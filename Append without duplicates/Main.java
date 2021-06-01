#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct Node{
  int data;
  Node *next;
};

void printlist(struct Node *node) 
{ 
    while (node != NULL) 
    { 
        cout<<node->data<<"\n";
        node = node->next; 
    } 
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
  int data , len = 0, start;
  std::cin>>data;
  start = data;
  while(data >= 0)
  {
    append(&head,data);
    cin >> data;
    len++;
  }
  if(len == 0)
    cout<<"List is empty";
  else
    printReverse(head);
  return 0;
}