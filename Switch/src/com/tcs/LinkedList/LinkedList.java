package com.tcs.LinkedList;

public class LinkedList {

	Node head;	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public void printList(){
		Node n = head;
		while(null != n){
			System.out.println(n.data+ " ");
			n = n.next;
		}
	}

	public void insertElement(int data){
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		for(int i=0;i<3;i++){
			ll.insertElement(i);
		}
		ll.printList();
	}
}
