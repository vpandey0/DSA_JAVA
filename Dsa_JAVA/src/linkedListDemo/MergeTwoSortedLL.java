package linkedListDemo;

import java.util.Scanner;

public class MergeTwoSortedLL {
	
	 public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
	        //Your code goes here
	        Node<Integer> head=null, tail=null;
	        Node<Integer> t1=head1,t2=head2;
	        if(head1==null&&head2==null){
	            return null;
	        }
	        if(head1==null){
	            return head2;
	        }
	          if(head2==null){
	            return head1;
	        }
	    if(t1.data<=t2.data){
	        head=t1;
	        tail=t1;
	        t1=t1.next;
	    }else{
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
	}else{
	    tail.next=t1;
	}
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
			Node<Integer> head1=takeInput();
			Node<Integer> head2=takeInput();
		    Node<Integer> headNode=null;
		
		   headNode=mergeTwoSorteds(head1,head2);
	       print(headNode);
		
	}
	

}
