package invocation.com;

import org.testng.annotations.Test;

public class InvocationClass {
	
	@Test(invocationCount = 5)
	public void testCase1() {
		System.out.println("This is test case 1");
	}

}
