
import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DemoWebTest {
	WebDriver driver;

	@Before
	public void setup(){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://dev.smartskip.com.au");
		driver.manage().window().maximize();
	}
	@Test
	public void testCase1() {
		driver.getTitle();
		//WebElement Learn_more_btn = driver.findElement(By.linkText("Learn more"));
		//Action act = new Actions(driver);
		//Learn_more_btn.click();


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Learn more")));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);

	}
	@After
	public void tearDown() {
		driver.quit();
	}

	}


