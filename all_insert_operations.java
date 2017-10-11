'''Linkedlist implementation of 
1.Inserting node at the begining
2.Inserting node between two nodes
3.Inserting node at the end of Linkedlist
''' 
import java.lang.*;
import java.io.*;
import java.util.*;

class Linkedlistall{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;

		}
	}
	public void printlist()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data + "->");

			n=n.next;
		}
		System.out.println(" ");
	}
	public void insertatbeg(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public void insertbet(Node prev_node, int new_data)
	{
		if(prev_node==null)
		{
			System.out.println("cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	public void insertend(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head==null)
		{
			new_node=head;
			return;
		}
		new_node.next = null; 
		Node last = head;
		while(last.next!=null)
		{
			last = last.next;
		}
		last.next=new_node;
		return;

	}
	public static void main(String args[])
	{
		Linkedlistall llist = new Linkedlistall();
		llist.head = new Node(8);
		Node second = new Node(80);
		llist.head.next=second;
		second.next=null;
		llist.printlist();
		llist.insertend(78);
		llist.printlist();

	}
}