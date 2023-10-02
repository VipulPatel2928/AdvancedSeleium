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

public class TestNGWithBaseClass extends BaseClass {

	@Test(enabled = false)
	public void tstCase01() {
		System.out.println("This is Test Case 01");
	}

	@Test
	public void tstCase02() {
		System.out.println("This is Test Case 02");
	}

	@Test
	public void tstCase03() {
		System.out.println("This is Test Case 03");
	}

	@Test
	public void tstCase04() {
		System.out.println("This is Test Case 04");
	}

	@Test
	public void tstCase05() {
		System.out.println("This is Test Case 05");
	}

}
