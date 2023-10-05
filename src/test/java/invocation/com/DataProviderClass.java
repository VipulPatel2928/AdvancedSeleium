package invocation.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

	@DataProvider(name="firstNameLastName")
	public Object[][] getFirstNameLastName(){
		return new Object[][] {
			{"Vipul" , "Patel"},
			{ "Dhruv", "Patel"},
			{"Rutul", "Soni" },
			{"Rutul", "Soni" }
		};
	}
	//---------------------------------------------------------//
	@Test(dataProvider = "firstNameLastName")
	public void testCase1(String firstname, String lastName) {
		System.out.println(firstname);
		System.out.println(lastName);
	}
	
	@Test(dataProvider = "firstNameLastName")
	public void testCase2(String firstname, String lastName) {
		System.out.println(firstname);
		System.out.println(lastName);
	}
}
