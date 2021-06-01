#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct Node{
  int data;
  Node *next;
};

void push(Node** head_ref, int new_data)  
{  
    Node* new_node = new Node();  
    new_node->data = new_data;  
    new_node->next = (*head_ref);  
    (*head_ref) = new_node;  
}

void printReverse(Node* head)  
{  
    if (head == NULL)  
    return;  
    printReverse(head->next);  
    cout << head->data << "\n";
} 
int append(Node** head_ref, int new_data)  
{  
  	int flag = 1;
    Node *temp;
    temp = *head_ref;
    while(temp != NULL)
    {
      if(temp->data == new_data)
        flag = 0;
      temp = temp->next;
    }
  if(flag == 1)
  {
    Node* new_node = new Node();  
    new_node->data = new_data;  
    new_node->next = (*head_ref);
    (*head_ref) = new_node;
  }
  return 0;
} 
int main()
{
  struct Node* head = NULL;
  struct Node* head1 = NULL;
  int data , len = 0;
  std::cin>>data;
  while(data >= 0)
  {
    append(&head,data);
    push(&head1,data);
    cin >> data;
    len++;
  }
  if(len == 0)
  {
    cout<<"Linked list before removal of duplicates"<<"\n";
    cout<<"Linked list after removal of duplicates"<<"\n";
  }
  else
  {
    cout<<"Linked list before removal of duplicates"<<"\n";
    printReverse(head1);
    cout<<"Linked list after removal of duplicates"<<"\n";
    printReverse(head);
  }
  return 0;
}