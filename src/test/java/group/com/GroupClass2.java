package group.com;

import org.testng.annotations.Test;

public class GroupClass2 {
	
	@Test(groups = "odds")
	public void groupTestCase012() {
		System.out.println("groupTestCase012");
	}
	
	@Test(groups = "even")
	public void groupTestCase022() {
		System.out.println("groupTestCase022");
	}
	
	@Test(groups = "odds")
	public void groupTestCase032() {
		System.out.println("groupTestCase032");
	}
	
	@Test(groups = "even")
	public void groupTestCase042() {
		System.out.println("groupTestCase042");
	}
	
	@Test(groups = "odds")
	public void groupTestCase052() {
		System.out.println("groupTestCase052");
	}
	
	@Test(groups = "even")
	public void groupTestCase062() {
		System.out.println("groupTestCase062");
	}
	
	@Test(groups = "odds")
	public void groupTestCase072() {
		System.out.println("groupTestCase072");
	}
	
	@Test(groups = "even")
	public void groupTestCase082() {
		System.out.println("groupTestCase082");
	}
	
	@Test(groups = {"odds","even"})
	public void groupTestCase092() {
		System.out.println("groupTestCase092");
	}

}
