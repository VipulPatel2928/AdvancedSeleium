package priority.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {


	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Before Suite");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

	@Test(priority = 5)
	public void tstCase01() {
		System.out.println("This is Test Case 01");
	}

	@Test(priority = 4)
	public void tstCase02() {
		System.out.println("This is Test Case 02");
	}

	@Test(priority = 3)
	public void tstCase03() {
		System.out.println("This is Test Case 03");
	}

	@Test(priority = 2)
	public void tstCase04() {
		System.out.println("This is Test Case 04");
	}

	@Test(priority = 1)
	public void tstCase05() {
		System.out.println("This is Test Case 05");
	}
}
