package priority.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Priority2 {


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

	
	@Test(timeOut = 200)
	@Parameters("name")
	public void tstCase01(String name) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("This is Test Case 01     :"+name);
	}

	@Test
	@Parameters("name")
	public void tstCase02(String name) {
		System.out.println("This is Test Case 02     :"+name);
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
	
	@Test
	public void atstCase06() {
		System.out.println("This is Test Case 06");
	}

	@Test
	public void btstCase07() {
		System.out.println("This is Test Case 07");
	}
}
