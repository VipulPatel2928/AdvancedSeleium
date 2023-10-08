package multiLevelInheritance.com;

public class Level4Class4 extends Level3Class3   {
	public void method() {
		System.out.println("Method 1 Level4Class4");
	}

	public void method4() {
		System.out.println("Method 4 Level4Class4");
	}

	public static void main(String[] args) {
		Level4Class4 obj4 = new Level4Class4();
		obj4.method();
		obj4.method1();
		obj4.method2();
		obj4.method3();
		obj4.method4();
		System.out.println("<---------------------------------------------------------->");
		Level3Class3 obj3 = new Level4Class4();
		obj4.method();
		obj4.method1();
		obj4.method2();
		obj4.method3();
		obj4.method4();

	}

}
