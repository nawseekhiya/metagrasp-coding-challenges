/**
 * ALGORITHM reverse(head)
 *  head: the head node of the linked list
 *      reverses the order of nodes in the list
 *  prev <- NULL
 *  current <- head
 *  next <- NULL
 *  while current is not NULL do
 *      next <- current->next    // stores the next node
 *      current->next <- prev    // reverses the pointer of the current node
 *      prev <- current          // moves prev to the current node
 *      current <- next          // moves to the next node
 *  head <- prev                 // sets the new head of the reversed list
 *  return head
 */

#include <stdio.h>
#include <stdlib.h>

// structure the node is defined
struct Node {
    int data;
    struct Node* next;
};

// this functions reverse the nodes of the list
struct Node* reverse(struct Node* head) {
    struct Node* prev = NULL;
    struct Node* curr = head;
    struct Node* next = NULL;

    while (curr != NULL) {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

// this function inserts a node at the beginning of the list
void push(struct Node** headRef, int newData) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = newData;
    newNode->next = (*headRef);
    (*headRef) = newNode;
}

// this function prints the linked list
void printList(struct Node* node) {
    while (node != NULL) {
        printf("%d ", node->data);
        node = node->next;
    }
    printf("\n");
}

int main() {
    struct Node* head = NULL;
    int size,val;
    printf("Enter size of linked list: ");
    scanf("%d",&size);
    printf("Enter %d values to push them to linked list: ",size);
    for(int i=0;i<size;i++)
    {
        scanf("%d",&val);
        push(&head, val);
    }
    printf("Original Linked List:\n");
    printList(head);
    head = reverse(head);
    printf("Reversed Linked List:\n");
    printList(head);
    return 0;
}


