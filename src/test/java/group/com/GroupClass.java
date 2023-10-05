package group.com;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupClass {
	@BeforeGroups
	public void groupBefore() {
		System.out.println("groupbefore");
	}
	
	@AfterGroups
	public void groupAfter() {
		System.out.println("groupAfter");
	}
	
	@Test(groups = "odds")
	public void groupTestCase01() {
		System.out.println("groupTestCase01");
	}
	
	@Test(groups = "even")
	public void groupTestCase02() {
		System.out.println("groupTestCase02");
	}
	
	@Test(groups = "odds")
	public void groupTestCase03() {
		System.out.println("groupTestCase03");
	}
	
	@Test(groups = "even")
	public void groupTestCase04() {
		System.out.println("groupTestCase04");
	}
	
	@Test(groups = "odds")
	public void groupTestCase05() {
		System.out.println("groupTestCase05");
	}
	
	@Test(groups = "even")
	public void groupTestCase06() {
		System.out.println("groupTestCase06");
	}
	
	@Test(groups = "odds")
	public void groupTestCase07() {
		System.out.println("groupTestCase07");
	}
	
	@Test(groups = "even")
	public void groupTestCase08() {
		System.out.println("groupTestCase08");
	}
	
	@Test(groups = {"odds","even"})
	public void groupTestCase09() {
		System.out.println("groupTestCase09");
	}

}
