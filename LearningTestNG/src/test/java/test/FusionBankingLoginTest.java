package test;

import Objects.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FusionBankingLoginTest {
	WebDriver driver= null;
	public static void main(String[] args) throws InterruptedException {
		loginTest();
		
	}
	public static void loginTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://blrcswcombk0035:8088/uxp/rt/html/login.html?locale=en-gb");
		FusionBankingLogin obj = new FusionBankingLogin(driver);
		obj.input_Username("teller13");
		obj.input_Password("welcome@99");
		obj.click_LoginButton();
		Thread.sleep(7000);
		driver.close();
		
	}

}
