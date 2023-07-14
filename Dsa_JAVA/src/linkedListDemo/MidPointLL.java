package linkedListDemo;

import java.util.Scanner;

public class MidPointLL {
	public static Node<Integer> midPointInLL(Node<Integer> head){
		Node<Integer> slow=head;
        Node<Integer> fast=head;
       
        if(head==null){
            return null;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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
		
	//	int length=nodeLength(headNode);
	//	System.out.println(length);
	
	headNode=midPointInLL(headNode);
    System.out.println(headNode.data);
	
}


}
