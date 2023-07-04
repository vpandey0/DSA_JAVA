package generics;



public class PairUse {

	public static void main(String[] args) {
//     Pair<Integer> p=new Pair<>(2, 3);
//     p.setFirst(10);
//     System.out.println(p.getFirst());
//     System.out.println(p.getSec());
     //What if i want to store the data of string i will have make new class for string type
     //to avoid make multiple class for every datatype we use Generic datatype
		Pair<Integer, String> p1=new Pair<>(2,"acf");
//		System.out.println(p1.getSec());
		String aString="abdd";
		Pair<Pair<Integer, String>, String> p2=new Pair<>(p1, aString);
		System.out.println(p2.getFirst().getFirst());
		System.out.println(p2.getFirst().getSec());
		System.out.println(p2.getSec());
	}

}
