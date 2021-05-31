package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Openbrowser;
import common.Propertyreader;

public class Login_page extends Openbrowser{
	
	
	
	public Login_page enter_username() throws IOException, InterruptedException
	{
		Propertyreader property = new Propertyreader();

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(property.getusername());
		return this;
	}
	
	
	public Login_page enterpassword() throws IOException
	{
		Propertyreader property = new Propertyreader();

		WebElement password = driver.findElement(By.name("password"));
		System.out.println(property.getpassword()+" Password");
		password.sendKeys(property.getpassword());
		return this;
	}
	
	
	public Dashboard click_login_button()
	{
		WebElement loginbutton = driver.findElement(By.xpath("//div[text()='Login']"));
		loginbutton.click();
		return new Dashboard();
	}

}
