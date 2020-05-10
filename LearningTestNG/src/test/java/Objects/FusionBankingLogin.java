package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FusionBankingLogin {
	
		private WebDriver driver=null;

		By user_name = By.xpath("//input[@name='user']");
		By password= By.xpath("//input[@id='password']");
		By singnin_button= By.xpath("//input[@name='login']");
		By search = By.xpath("//input[@id='uxpMenuSearch']");

		public FusionBankingLogin(WebDriver driver){
			this.driver=driver;
		}
	
		public void input_Username(String text){
			driver.findElement(user_name).sendKeys(text);
			
		}
		public void input_Password(String text){
			driver.findElement(password).sendKeys(text);	
			}
		public void click_LoginButton(){
			driver.findElement(singnin_button).click();
		}
				
}
