package parameter.com;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClass {
	@Parameters("url")
	@Test
	public void parameterTestCase01(String url) {
		System.out.println("parameterTestCase01 : "+url);
	}
	
	@Parameters("url")
	@Test
	public void parameterTestCase02(String url) {
		System.out.println("parameterTestCase02 :"+url);
	}
	
	@Test
	public void parameterTestCase03(ITestContext testContext) {
		
		String browser=testContext.getCurrentXmlTest().getParameter("browser");
		System.out.println("parameterTestCase03 : "+browser);
	}
}
