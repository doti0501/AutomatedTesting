
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import javax.swing.*;

public class DemoWebTest {
	WebDriver driver;

	@BeforeClass
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev.smartskip.com.au");
		driver.manage().window().maximize();
	}
	@Test
	public void testCase1() {
		driver.getTitle();
		WebElement Dbutton = driver.findElement(By.linkText("Learn more"));
		//Action act = new Actions(driver);
		Dbutton.click();

	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}


//	public static void main (String[] args) {
//		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://dev.smartskip.com.au");

	}

}
