package singleInheritance.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.browsingcontext.NavigationResult;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleInheritanceSubClass extends SingleInheritanceSuperClass {

	public void method3() {
		System.out.println("method3 of SingleInheritanceSubClass");
	}
	
	public void method4() {
		System.out.println("method4 of SingleInheritanceSubClass");
	}
	
//	@Override
//	public void method1() {
//		System.out.println("method1 of SingleInheritanceSubClass");
//	}
	
	public static void main(String[] args) {
		
		// Child - Child
		SingleInheritanceSubClass objSubClass = new SingleInheritanceSubClass();
		objSubClass.method1();
		objSubClass.method2();
		objSubClass.method3();
		objSubClass.method4();
		
		System.out.println("<--------------------------------------------------------->");
		
		// Parent Child
		SingleInheritanceSuperClass objSuperClass = new SingleInheritanceSuperClass();

		objSuperClass.method1();
		objSuperClass.method2();
		objSuperClass.method3();
		objSuperClass.method4();
		
		System.out.println("<--------------------------------------------------------->");
		// Parent - Parent
		SingleInheritanceSuperClass objSubClass1 = new SingleInheritanceSubClass();
	
		objSubClass1.method1();
		objSubClass1.method2();
		objSubClass1.method3();
		objSubClass1.method4();
	
		
		System.out.println("<--------------------------------------------------------->");
		
		// Child - Parent
		// Remove the comment to see the compiler error
		//SingleInheritanceSubClass objClass = new SingleInheritanceSuperClass();
	}

}
