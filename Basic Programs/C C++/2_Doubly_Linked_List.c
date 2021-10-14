#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* prev;
    struct node* next;
};
struct node* head;

void append(){
    int item;
    struct node* ptr;
    ptr = (struct node*)malloc(sizeof(struct node));
    printf("Enter Node Data: ");
    scanf("%d", &item);
    if(ptr == NULL){
        printf("OVERFLOW");
    }else{
        if(head == NULL){
            ptr->next = NULL;
            ptr->prev = NULL;
            ptr->data = item;
            head = ptr;
        }else{
            ptr->data = item;
            ptr->prev = NULL;
            ptr->next = head;
            head->prev = ptr;
            head = ptr;
        }
        printf("\nNode Inserted\n");
    }
}

void traverse(){
    struct node* ptr;
    if(head == NULL){
        printf("\nList is Empty\n");
    }else{
        ptr = head;
        while(ptr != NULL){
            printf("%d-->", ptr->data);
            ptr=ptr->next;
        }
    }
}

void insertAtBegin(){
    int item;
    struct node* ptr;
    ptr = (struct node*)malloc(sizeof(struct node));
    printf("Enter Node Data: ");
    scanf("%d", &item);
    if(ptr == NULL){
        printf("OVERFLOW");
    }else{
        if(head == NULL){
            ptr->next = NULL;
            ptr->prev = NULL;
            ptr->data = item;
            head = ptr;
        }else{
            ptr->data = item;
            ptr->prev = NULL;
            ptr->next = head;
            head->prev = ptr;
            head = ptr;
        }
        printf("\nNode Inserted\n");
    }
}

int main(){
    int x;
    while(1){
        printf("\nDoubly Linked List\n");
    printf("1. Append\n2. Display\nEnter Your Choice: \n");
    scanf("%d", &x);
    switch(x){
        case 1:
        append();
        break;
        case 2:
        traverse();
        break;
        default:
        printf("\nInvalid Input\n");
    }
    }
}