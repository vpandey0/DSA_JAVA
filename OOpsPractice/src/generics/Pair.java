package generics;

//public class Pair {
//    private int first;
//    private int sec;
//    public Pair(int first,int sec) {
//    	this.first=first;
//    	this.sec=sec;
//    }
//    public void setFirst(int first) {
//		this.first = first;
//	}
//    
//    public int getFirst() {
//		return first;
//	}
//    public void setSec(int sec) {
//		this.sec = sec;
//	}
//    public int getSec() {
//		return sec;
//	}

//------Generic data type "T" --------

public class Pair <T,V>{
    private T first;
    private V sec;
    public Pair(T first,V sec) {
    	this.first=first;
    	this.sec=sec;
    }
    public void setFirst(T first) {
		this.first = first;
	}
    
    public T getFirst() {
		return first;
	}
    public void setSec(V sec) {
		this.sec = sec;
	}
    public V getSec() {
		return sec;
	}
    
}
