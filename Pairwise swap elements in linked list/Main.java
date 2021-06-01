#include<iostream>
#include<bits/stdc++.h>
using namespace std;

struct Node
{
  int data;
  Node *next;
};

void push(Node** headadd, int data)
{
  Node *new_node = new Node();
  new_node->data = data;
  new_node->next = (*headadd);
  (*headadd) = new_node;
}

void printReverse(Node* head)
{
  if(head == NULL)
    return;
  printReverse(head->next);  
  cout << head->data << "\n";
}

void pairwiseswap(Node* head, int len)
{
  Node* temp = head;
  
  if(len%2 != 0)
    temp = temp->next;
  
  while(temp != NULL && temp->next != NULL)
  {
    swap(temp->data, temp->next->data);
    temp = temp->next->next;
  }
}
int main()
{
  struct Node* head = NULL;
  int data , len = 0;
  std::cin>>data;
  
  while(data >= 0)
  {
    push(&head,data);
    cin >> data;
    len++;
  }
  if(len == 0)
    cout<<"List is empty";
  else{
    pairwiseswap(head,len);
    printReverse(head);
  }
  return 0;
}