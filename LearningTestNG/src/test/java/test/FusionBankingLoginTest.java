package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FusionBankingLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FusionBankingLoginTest {
	WebDriver driver= null;
//	public static void main(String[] args) throws InterruptedException {
//		loginTest();
//		
//	}
	@BeforeTest
	public void testSetUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@Test
	public void loginTest() throws InterruptedException{
		
		driver.get("http://blrcswcombk0035:8088/uxp/rt/html/login.html");
		FusionBankingLogin obj = new FusionBankingLogin(driver);
		obj.input_Username("teller13");
		obj.input_Password("welcome@99");
		obj.click_LoginButton();

	}
	@AfterTest
	public void tearDowntest() {
		driver.close();
		driver.quit();
		System.out.println("Test Successful");
	}

}
