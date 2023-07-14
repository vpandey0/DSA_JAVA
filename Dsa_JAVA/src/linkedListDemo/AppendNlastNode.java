package linkedListDemo;

import java.util.Scanner;

public class AppendNlastNode {
	public static int nodeLength(Node<Integer> head) {
		int count=0;
		while(head!=null) {
			head=head.next;
			count++;
		}
		return count;
	}
	public static Node<Integer> appendNlastNodetoFirst(Node<Integer> head, int n){
	Node<Integer> currNode=head;
	Node<Integer> tempNode=head;
	int length=nodeLength(head);

	int i=0;
	while(i<length-n-1) {
		
		tempNode=tempNode.next;
		i++;
	}
	head=tempNode.next;
	tempNode.next=null;
	Node<Integer> newNode=head;
	while(newNode.next!=null) {
		newNode=newNode.next;
	}
	newNode.next=currNode;
	return head;
	}
	public static Node<Integer> takeInput(){
			
			Node<Integer> head=null, tail=null;
			Scanner s=new Scanner(System.in);
			int data=s.nextInt();
			while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
				
			}else {
				tail.next =newNode;
				tail=newNode;
			}
			data=s.nextInt();
			
			}
			return head;
			
		}
	
	public static void print(Node<Integer> head) {
		Node<Integer> tempNode=head;
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		head=tempNode;
		System.out.println();
	}
	public static void main(String[] args) {
		Node<Integer> headNode=takeInput();
		print(headNode);
//		int length=nodeLength(headNode);
//		System.out.println(length);

		headNode=appendNlastNodetoFirst(headNode, 3);
		print(headNode);
		
	}

}
