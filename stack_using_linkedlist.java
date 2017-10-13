import java.io.*;
import java.lang.*;
import java.util.*;

class stackusingll
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next =null;

		}
	}
	public void printlist()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data + " ");
			n=n.next;
		}
		System.out.println(" ");
	}
	public void push(int value)
	{ //creating a new Node and making it as head
		Node n = new Node(value);
		n.next=head;
		head=n;

	}
	public int pop()
	{//First check if head = null ->if yes then return 0
		//else de-link the fiirst node and make the next node of current head =head
		if(head==null)
		{
			return 0;
		}
		int value = head.data;
		head=head.next;
		return value;

	}
	public static void main(String args[])
	{
		stackusingll llist = new stackusingll();
		llist.head=new Node(1);
		Node second = new Node(3);
		Node thrird = new Node(4);
		llist.head.next=second;
		second.next=thrird;
		llist.printlist();
		llist.push(8);
		llist.printlist();
		llist.pop();
		llist.printlist();
	}


}