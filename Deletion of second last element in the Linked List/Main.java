#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct Node
{
  int data;
  struct Node* next;
  struct Node* prev;
};

void delete2ndlast(struct Node* head, int len) 
{ 
    struct Node* temp = head;  
    temp = head;
    int arr[len-1];
    int k = temp->data;
    for (int i=1; i<len; i++)
    {
        temp = temp->next; 
        arr[i-1] = temp->data;
    }
    for(int j=1; j<len-1; j++)
    {
      cout<<arr[len-1-j]<<" ";
    }
    cout<<k;
    return; 
}

void push(Node** head_ref, int new_data)  
{  
    Node* new_node = new Node(); 

    new_node->data = new_data;  

    new_node->prev = NULL;  

    new_node->next = (*head_ref);      

    if((*head_ref) != NULL)  
    (*head_ref)->prev = new_node ;  

    (*head_ref) = new_node;  
}

int main()
{
  struct Node* head = NULL;
  int x;
  cin>>x;
  int len = 0;
  while(x>=0)
  {
   push(&head,x);
   cin>>x;
   len++; 
  }
  if(len<2)
  {
    cout<<"Deletion of second last element is not possible";
    return 0;
  }
  delete2ndlast(head,len);
  return 0;
}