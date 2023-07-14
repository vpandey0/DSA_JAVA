package linkedListDemo;

import java.util.Scanner;

public class InsertNode {
	public static Node<Integer> insertNodeInLinkedList(Node<Integer> head, int data,int pos) {
		Node<Integer> newNode=new Node<Integer>(data);
		Node<Integer> temp=head;
		if(pos==0) {
			newNode.next=head;
			head=newNode;
			return head;
		}
		int i=0;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
		
	}
	public static Node<Integer> takeInput() {
		// TODO Auto-generated method stub
		Node<Integer> head=null,tail=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!= -1) {
		Node<Integer> newNode=new Node<Integer>(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
		data=s.nextInt();
		}
		return head;

	}
	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
				while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		head=temp;
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node<Integer> headNode=takeInput();
		headNode=insertNodeInLinkedList(headNode, 40, 3);
		print(headNode);
		
	}

}
