#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
};
struct node* root;

void append(){
    struct node* temp;
    temp = (struct node*)malloc(sizeof(struct node));
    printf("Enter Node Data: \n");
    scanf("%d", &temp->data);
    temp->next = NULL;
    if(root == NULL){
        temp->next = root;
        root = temp;
    }else{
        struct node* p;
        p = root;
        while(p->next != NULL){
            p = p->next;
        }
        p->next = temp;
    }
}

void lengthOfList(){
    int count = 0;
    struct node* temp;
    temp = root;

    while(temp != NULL){
        count++;
        temp = temp->next;
    }
    printf("%d \n", count);
}

void display(){
    struct node* temp;
    temp = root;
    if(temp == NULL){
        printf("List Is Empty\n\n");
    }else{
        while(temp != NULL){
            printf("%d-->", temp->data);
            temp = temp->next;
        }
        printf("\n\n");
    }
}

void addAtBegin(){
    struct node* temp;
    temp = (struct node*)malloc(sizeof(struct node));
    printf("Enter Node Data: \n");
    scanf("%d", &temp->data);
    temp->next = root;
    root = temp;
}

void addAtAfter(){
    struct node* temp;
    temp = (struct node*)malloc(sizeof(struct node));
    printf("Enter Node Data: \n");
    scanf("%d", &temp->data);
    temp->next = NULL;
    if(root == NULL){
        temp->next = root;
        root = temp;
    }else{
        struct node* p;
        p = root;
        while(p->next != NULL){
            p = p->next;
        }
        p->next = temp;
    }
}

void deleteAtBegin(){
    root = root->next;
}

void deleteAtAfter(){
    struct node* temp;
    temp = root;
    while(temp->next->next != NULL){
        temp = temp->next;
    }
    temp->next = NULL;
}

int main(){
    int ch;
    while(1){
        printf("\nSingly Linked List\n");
        printf("1. Append\n2. Insert At Begin\n3. Insert at End\n4. Length of the list\n5. Display\n6. Delete At Begin\n7. Delete at End\n8. Exit\nEnter Your Choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1:
            append();
            break;
            case 2:
            addAtBegin();
            break;
            case 3:
            addAtAfter();
            break;
            case 4:
            lengthOfList();
            break;
            case 5:
            display();
            break;
            case 6:
            deleteAtBegin();
            break;
            case 7:
            deleteAtAfter();
            break;
            case 8:
            exit(1);
            break;
            default:
            printf("Invalid Input\n");
        }
    }
}