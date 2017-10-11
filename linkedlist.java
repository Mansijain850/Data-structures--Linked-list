"""Simple linked list implementation"""
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.*;

class Linkedlist
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;

		}

	}
	public void printlist()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String args[])
	{
		Linkedlist llist = new Linkedlist();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node thrird = new Node(3);
		llist.head.next = second;
		second.next = thrird;
		llist.printlist();
	}
}