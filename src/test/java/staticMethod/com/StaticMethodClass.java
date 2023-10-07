package staticMethod.com;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import net.bytebuddy.asm.Advice.This;

public class StaticMethodClass {

	//Class level
	public static  int i;
	public int i1;

	// Class level
	// Static method dosen't allow non static instance variable
	// Static method allow local variable and static variable
	public static void staticFun(int p) {
		i = p;
		//int j = 100;
		System.out.println("Value of i :" + i);
		//System.out.println("Value of i :" + j);
	}

	
	public void display() {
		System.out.println("Value of i :" + i);
		System.out.println("Value of i :" + i1);
	}
	
	public void nonStaticfun(int p) {
		i1 = p;
		//int j = 100;
		System.out.println("Value of i :" + i1);
		//System.out.println("Value of i :" + j);
	}
	public static void main(String[] args) {
		StaticMethodClass objStaticMethodClass = new StaticMethodClass();

		objStaticMethodClass.staticFun(500);
		objStaticMethodClass.nonStaticfun(600);
	
		System.out.println("<----------------------------------------------------->");
		objStaticMethodClass.display();
		System.out.println("<----------------------------------------------------->");
		
		StaticMethodClass objStaticMethodClass1 = new StaticMethodClass();

		objStaticMethodClass1.staticFun(501);
		objStaticMethodClass1.nonStaticfun(601);

		 
		
		System.out.println("<----------------------------------------------------->");
		
		objStaticMethodClass.display();
	
	}

}
