#include<stdio.h>
#include<stdlib.h>

struct node 
{
    int data;
    struct node *next;
}*head,*tail;

struct node *head=NULL;
struct node *tail=NULL;

void create(int data)
{
    struct node *temp;
    temp=malloc(sizeof(struct node));

    temp->data=data;

    if(head==NULL)
    {
        head=temp;
        tail=temp;
        tail->next=head;
    }
    else
    {
        tail->next =temp;
        temp->next=head;
        tail=temp;
    }
    
}

void display()
{
    struct node *q;

    if(head==NULL)
    {
        printf("List is empty\n");
        return;
    }

    q=head;

    while(q->next!=head)
    {
        printf("%d->",q->data);
        q=q->next;
    }
    printf("%d",q->data);
}

void search(int s)
{
    struct node *q;
    
    q=head;
    
    while(q->next!=head)
    {
        if(q->data==s)
        {
            printf("Found");
            return;
        }
        q=q->next;
    }

    if(q->data==s)
    {
        printf("Found");
        return;
    }

    printf("Not Found");
}

void count()
{
    struct node *q;

    int count = 1;
    q=head;

    while(q->next!=head)
    {
        count++;
        q=q->next;
    }

    printf("\nCount = %d\n", count);
}

void insert(int ins,int pos)
{
    struct node *temp, *q;
    temp=malloc(sizeof(struct node));

    temp->data=ins;
    if(pos==1)
    {
        temp->next=head;
        head=temp;
        tail->next=head;
    }
    else if(pos>1)
    {
        q=head;
        for(int i=1;i<pos-1;i++)
        {
            q=q->next;
        }

        temp->next=q->next;
        q->next=temp;
    }
}

void delete(int del)
{
    struct node *temp, *q;

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

    if(head->data==del)
    {
        temp=head;
        head=temp->next;
        tail->next=head;
        free(temp);
        return;
    }

    q=head;
    while(q->next!=head)
    {
        if(q->next->data==del)
        {
            temp=q->next;
            q->next=temp->next;
            free(temp);
            return;
        }
        q=q->next;
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
    p3->next=head;
}

int main()
{
    int data,n,s,ins,pos,del;

    printf("Enter total number of nodes = ");
    scanf("%d",&n);

    for(int i=0;i<n;i++)
    {
        printf("Enter data to each node = ");
        scanf("%d",&data);
        create(data);
    }
    display();
    printf("\nEnter the data you want to search = ");
    scanf("%d",&s);
    search(s);
    count();
    printf("Enter the data you want to insert and position = ");
    scanf("%d %d",&ins,&pos);
    insert(ins,pos);
    display();
    printf("\nEnter the data you want to delete = ");
    scanf("%d",&del);
    delete(del);
    display();  
    reverse();
    display();
}
