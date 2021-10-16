#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
    struct node *prev;
}*head,*tail;

struct node *head=NULL;
struct node *tail=NULL;

void create(int data)
{
    struct node *temp,*q;

    temp=malloc(sizeof(struct node));

    temp->data=data;

    if(head==NULL)
    {
        temp->prev=NULL;
        head=temp;
        tail=temp;
        tail->next=head;
    }
    else
    {
        tail->next=temp;
        temp->prev=q;
        temp->next=head;
        tail=temp;
    }
}

void display()
{
    struct node *temp,*q;

    q=head;
    if(head==NULL)
    {
        printf("List is empty\n");
    }
    else
    {
        while(q->next!=head)
        {
            printf("%d<->",q->data);
            q=q->next;
        }
        printf("%d\n",q->data);
    }
}

void search(int s)
{
    struct node *q;
    int pos=0;

    q=head;

    while(q->next!=head)
    {
        if(q->data==s)
        {
            printf("Element %d found at %d Position\n",q->data,pos);
            return;
        }
        q=q->next;
        pos++;
    }

    if(q->data==s)
    {
        printf("Element %d found at %d Position\n",q->data,pos);
    }
    else
    {
        printf("Element not Found");
    }
}

void insert(int ins,int pos)
{
    struct node *q,*temp;
    temp=malloc(sizeof(struct node));

    temp->data=ins;

    if(pos==0)
    {
        head->prev=temp;
        temp->next=head;
        temp->prev=NULL;
        head=temp;
        tail->next=head;
    }
    else if(pos>0)
    {
        q=head;
        for(int i=0;i<pos-1;i++)
        {
            q=q->next;
        }

        if(q->next==head)
        {

            temp->next=head;
            temp->prev=q;
            q->next=temp;
            tail=temp;
        }
        else
        {
            q->next->prev=temp;
            temp->next=q->next;
            temp->prev=q;
            q->next=temp;
        }

    }
}

void delete(int del)
{
    struct node *q,*temp;
    q=head;

    if(head->next==tail)
    {
        if(head->data==del)
        {
            temp=head;
            head=NULL;
            tail=NULL;
            free(temp);
            return;
        }
    }
    else if(head->data==del)
    {
        temp=head;
        head=head->next;
        head->prev=NULL;
        tail->next=head;
        free(temp);
        return;
    }
    else
    {
        while(q->next->next!=head)
        {
            if(q->next->data==del)
            {
                temp=q->next;
                q->next=temp->next;
                temp->next->prev=q;
                free(temp);
                return;
            }
            q=q->next;
        }

        if(q->next->data==del)
        {
            temp=q->next;
            q->next=head;
            tail=q;
            free(temp);
            return;
        }
    }
}

void reverse()
{
    printf("\nAfter Reversed\n");
    struct node *p1,*p2,*p3;

    p1=head;
    p2=head;
    p3=head;
    p3=p3->next;
    p1=p1->next->next;

    while(p3!=head)
    {
        p3->next=p2;
        p2=p3;
        p3=p1;
        p1=p1->next;
    }
    head=p2;
    tail=p3;
    p3->next=head;
}

int main()
{
    int data,n,s,ins,pos,del;

    printf("Enter total number of nodes = ");
    scanf("%d", &n);

    for(int i=0; i<n; i++)
    {
        printf("Enter data to each node = ");
        scanf("%d", &data);
        create(data);
    }

    display();
    printf("\nEnter data you want to search = ");
    scanf("%d",&s);
    search(s);
    printf("\nEnter the data you want to insert and Position = ");
    scanf("%d %d",&ins,&pos);
    insert(ins,pos);
    printf("Enter the data you want to delete = ");
    scanf("%d",&del);
    delete(del);
    reverse();
    display();
    printf("%d %d",head->data,tail->data);
}
