package timeout.com;

import org.testng.annotations.Test;

public class TimeOutClass {

	@Test(timeOut = 9000)
	public void timeOutTestCase1() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("This is timeOutTestCase1 ");
	}
}
