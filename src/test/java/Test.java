import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main (String[] args) {
		//System.setProperty("Webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.smartskip.com.au");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
