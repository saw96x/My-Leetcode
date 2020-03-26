#include <iostream>
using namespace std;
struct node
{
	int val;
	node *next;
};
class MyLinkedList
{
private:
	node *head;
	int length;

public:
	/** Initialize your data structure here. */
	MyLinkedList()
	{
		head = new node;
		head->next = nullptr;
		length = 0;
	}

	/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	int get(int index)
	{
		if (index < 0 || index >= length)
			return -1;
		node *temp = head;
		for (int i = 0; i <= index; i++)
			temp = temp->next;
		return temp->val;
	}

	/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	void addAtHead(int val)
	{
		node *pnew = new node;
		pnew->val = val;
		pnew->next = head->next;
		head->next = pnew;
		length++;
	}

	/** Append a node of value val to the last element of the linked list. */
	void addAtTail(int val)
	{
		node *temp = head;
		for (int i = 0; i < length; i++)
			temp = temp->next;
		node *pnew = new node;
		pnew->val = val;
		temp->next = pnew;
		pnew->next = nullptr;
		length++;
	}

	/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	void addAtIndex(int index, int val)
	{
		if (index > length)
			return;
		else if (index <= 0)
			addAtHead(val);
		else
		{
			node *temp = head;
			for (int i = 0; i < index; i++)
				temp = temp->next;
			node *pnew = new node;
			pnew->val = val;
			pnew->next = temp->next;
			temp->next = pnew;
			length++;
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	void deleteAtIndex(int index)
	{
		if (index < 0 || index >= length || length == 0)
			return;
		if (index == 0)
		{
			node *p = head->next;
			head->next = p->next;
			delete p;
			length--;
			return;
		}
		node *temp = head;
		for (int i = 0; i < index; i++)
			temp = temp->next;
		node *p = temp->next;
		temp->next = p->next;
		delete p;
		length--;
	}
};