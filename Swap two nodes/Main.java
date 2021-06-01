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
  Node* new_node = new Node();
  new_node->data = data;
  new_node->next = (*headadd);  
  *headadd = new_node;
}

void printReverse(Node* head)  
{  
    if (head == NULL)  
    return;  
    printReverse(head->next);  
    cout << head->data <<" ";
}

void swaplist(Node* head, int p, int q)
{
  while(head != NULL)
  {
    if(head->data == p)
      head->data = q;
    else if(head->data == q)
      head->data = p;
    head = head->next;
  }
}
int main()
{
  int n;
  std::cin>>n;
  struct Node *head = NULL;
  int x;
  for(int i=0; i<n; i++)
  {
    cin>>x;
    push(&head,x);
  }
  
  int p,q;
  std::cin>>p>>q;
  swaplist(head, p, q);
  printReverse(head);
  return 0;
}