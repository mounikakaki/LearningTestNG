package SeleniumJavaFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	static WebElement	element;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
		WebElement	element = driver.findElement(By.xpath("//input[@name='q']"));
		element.submit();
		driver.close();
	
	}
	
		


}
