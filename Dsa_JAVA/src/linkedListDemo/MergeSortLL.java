package linkedListDemo;

import java.util.Scanner;

public class MergeSortLL {
	
	public static Node<Integer> midPoint(Node<Integer> head){
	        if(head==null){
	            return head;
	        }
	        Node<Integer> slow=head;
	       Node<Integer> fast=head.next;
	       while(fast!=null && fast.next!=null){
	           slow=slow.next;
	           fast=fast.next.next;
	       }
	       return slow;
	    }
	public static Node<Integer> mergeSortedLL(Node<Integer> head1, Node<Integer> head2){
	    Node<Integer> head=null, tail=null;
	    Node<Integer> t1=head1, t2=head2;
	    if(t1.data<=t2.data){
	        head=t1;
	        tail=t1;
	        t1=t1.next;
	    }
	    else{
	        head=t2;
	        tail=t2;
	        t2=t2.next;
	    }
	while(t1!=null && t2!=null){
	    if(t1.data<=t2.data){
	      tail.next=t1;
	        tail=t1;
	        t1=t1.next;
	    }
	    else{
	        tail.next=t2;
	        tail=t2;
	        t2=t2.next;
	    }
	}
	if(t1==null){
	    tail.next=t2;
	}
	else{
	    tail.next=t1;
	}
	return head;
	
	}
		public static Node<Integer> mergeSort(Node<Integer> head) {
			//Your code goes here
	        if(head==null || head.next==null){
	            return head;
	        }
	        Node<Integer> mid=midPoint(head);
	        Node<Integer> left=head;
	        Node<Integer> right=mid.next;
	        mid.next=null;
	
	        left=mergeSort(left);
	        right=mergeSort(right);
	        Node<Integer> res=mergeSortedLL(left,right);
	        return res;
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
			Node<Integer> head=takeInput();
				
		   head=mergeSort(head);
	       print(head);
		
	}
	

}
