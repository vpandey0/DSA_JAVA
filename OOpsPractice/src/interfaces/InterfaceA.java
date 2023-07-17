package interfaces;



public interface InterfaceA {
   public void method();
}
class One{
    public void method(){
        System.out.println("Class One method");
    }
	
}
class Two extends One implements InterfaceA{
    public void method(){
        System.out.println("Class Two method");
    }
}
