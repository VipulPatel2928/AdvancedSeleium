package constructor.com;

public class ConstructorClass {
   public int age = 50;
	public void f1() {
		System.out.println("This is function 1");
	}
	
	public ConstructorClass() {
		this(500);
		f1();
		System.out.println("This is default , No-parameter Constructor");
	}
	
	public ConstructorClass(int i){
		System.out.println("This is one parameter Constructor");
	}
	
	public ConstructorClass(String str){
		System.out.println("This is one parameter Constructor");
	}
	
	public static void main(String[] args) {
		// Implicity return the value but there is no return type for the constructor
		ConstructorClass obConstructorClass1 = new ConstructorClass(10);
		obConstructorClass1.f1();
		System.out.println(obConstructorClass1.age);
		
		ConstructorClass obConstructorClass2 = new ConstructorClass();
		obConstructorClass2.f1();
	}
}
