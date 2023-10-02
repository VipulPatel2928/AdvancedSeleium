package browserLaunch.com;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class TestClass {
	public static WebDriver driver;

	public static void jsClick(WebDriver driver, WebElement ele) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:3px solid red; background:green')", ele);
		jsExecutor.executeScript("arguments[0].click()", ele);
	}

	public static void jsSendKey(WebDriver driver, WebElement ele) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].value=''", ele);
	}

	public static void verticalScrollBy(WebDriver driver, int i) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0," + i + ")", "");
	}

	public static void horizontalScrollBy(WebDriver driver, int i) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(" + i + ",0)", "");
	}

	public static WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

	public static void takeAScreenShot(WebDriver driver,String FileName) throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String pathString = System.getProperty("user.dir");
		System.out.println("Path : " + pathString);
		pathString = pathString + "\\" + "Report\\";
		File destFile = new File(pathString+FileName + ".png");
		FileUtils.copyFile(sourFile, destFile);
	}

	public static WebDriver getChromeDriverWithCustomSettings(String headLess) {
		WebDriverManager.chromedriver().setup();

		Map<String, Object> prefs = new HashMap<String, Object>();
		String pathString = System.getProperty("user.dir");

		System.out.println("Path : " + pathString);

		pathString = pathString + "\\" + "ProjectFilesDownloaded";

		System.out.println("Path : " + pathString);

		prefs.put("download.default_directory", pathString);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-extensions");
		options.addArguments("--start-maximized");

		if (headLess.equals("Yes")) {
			options.addArguments("headless");
			System.out.println("User has selected the browser launch");
		} else {
			System.out.println("User has selected the browser launch");
		}

		options.addArguments("incognito");
		// options.addArguments("--window-size=1920,1080");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");

		options.setExperimentalOption("prefs", prefs);

		driver = new ChromeDriver(options);
		return driver;
	}

	public static void sendData(WebElement ele, String data) {
		ele.click();
		ele.clear();
		ele.sendKeys(data);

	}

	public static void waitForSeconds(int seconds) {

		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {

		WebDriver driver = TestClass.getChromeDriverWithCustomSettings("YesNo");
		driver.get("https://www.bseindia.com/");
		waitForSeconds(6);
		WebElement gainerElement = 	driver.findElement(By.xpath("//a[@id='gainer']"));
		jsClick(driver, gainerElement);
		waitForSeconds(3);
		
        List<WebElement> ele1 = driver.findElements(By.xpath("//tbody[@ng-repeat=\"g in Gainers.Table |limitTo:5 track by g.scrip_cd\"]//tr//td//a"));
        List<WebElement> ele2 = driver.findElements(By.xpath("//tbody[@ng-repeat=\"g in Gainers.Table |limitTo:5 track by g.scrip_cd\"]//tr//td[2]"));
        List<WebElement> ele3 = driver.findElements(By.xpath("//tbody[@ng-repeat=\"g in Gainers.Table |limitTo:5 track by g.scrip_cd\"]//tr//td[3]"));
        List<WebElement> ele4 = driver.findElements(By.xpath("//tbody[@ng-repeat=\"g in Gainers.Table |limitTo:5 track by g.scrip_cd\"]//tr//td[4]"));
        
        for(int i=0; i<ele1.size();i++) {
        	System.out.println(ele1.get(i).getText() + " "+ele2.get(i).getText() + " "+ele3.get(i).getText() + " "+ele4.get(i).getText());
        }
       
        
		waitForSeconds(5);
		driver.quit();
		System.out.println("Browser closed");
	}
}
