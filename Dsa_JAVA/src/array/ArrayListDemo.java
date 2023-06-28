package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> list=new ArrayList<>(); 
      System.out.println(list.size());
      list.add(15);
      list.add(13);
      list.add(2,14);
      System.out.println(list.get(2));
      for(int i=0;i<list.size();i++) {
    	  System.out.print(list.get(i)+" ");
      }
      System.out.println();
//      list.remove(1);
      list.set(2, 45);
      for(int i=0;i<list.size();i++) {
    	  System.out.print(list.get(i)+" ");
      }
      for(int elem:list) {
    	  System.out.print(elem+ " ");
	}
	}
}
