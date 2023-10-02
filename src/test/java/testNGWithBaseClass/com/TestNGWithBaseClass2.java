package testNGWithBaseClass.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGWithBaseClass2 extends BaseClass {

	@Test(enabled = false)
	public void tstCase06() {
		System.out.println("This is Test Case 06");
	}

	@Test
	public void tstCase07() {
		System.out.println("This is Test Case 07");
	}

	@Test
	public void tstCase08() {
		System.out.println("This is Test Case 08");
	}

	@Test
	public void tstCase09() {
		System.out.println("This is Test Case 09");
	}

	@Test
	public void tstCase10() {
		System.out.println("This is Test Case 10");
	}

}
