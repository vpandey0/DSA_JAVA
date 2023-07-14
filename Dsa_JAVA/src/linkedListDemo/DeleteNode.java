package linkedListDemo;

import java.util.Scanner;

public class DeleteNode {
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.
		Node<Integer> temp=head;
		if(head==null){
			return head;
		}
		if(pos==0){
				return head.next;
		}
		
		int i=0;
		while(temp!=null && i<pos-1){
			temp=temp.next;
			i++;
		}
		if(temp==null || temp.next==null){
			return head;
		}
		if(temp.next!=null){
		Node<Integer> curr=temp.next;
		temp.next=curr.next;
		
		}
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
		headNode=deleteNode(headNode, 3);
		print(headNode);
		
	}

}
