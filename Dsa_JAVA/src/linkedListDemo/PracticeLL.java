package linkedListDemo;

public class PracticeLL {
	public  static void print(Node<Integer> head) {
		 Node<Integer> temp = head;

		    while(temp != null){
		        System.out.print(temp.data +" ");
		        temp = temp.next;
		    }
		    System.out.println();
	}
	public static void increment(Node<Integer> head){
	    Node<Integer> temp = head;
	    while(temp != null){
	        temp.data++;
	        temp = temp.next;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Node<Integer> node1=new Node<Integer>(10);
//		Node<Integer> node2=new Node<Integer>(20);
//		Node<Integer> node3=new Node<Integer>(10);
//		Node<Integer> node4=new Node<Integer>(10);
//        node1.next=node2;
//        node2.next=node3;
//        node3.next=node4;
//        print(node2);
//        ----------------------------------------
		   Node<Integer> node1 = new Node<Integer>(10);
		    Node<Integer> node2 = new Node<Integer>(20);
		    node1.next = node2;
		    increment(node1);
		    print(node1);

	}

}
