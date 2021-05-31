package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.Openbrowser;

public class Add_customer_page extends Openbrowser {
	
	public Add_customer_page enter_first_name()
	{
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("basker");
		return this;
	}

	
	public Add_customer_page enter_lastname()
	{
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("B");
		return this;
	}
	
	public Dashboard click_on_save_button()
	{
		WebElement savebutton = driver.findElement(By.xpath("(//button[@class='ui linkedin button'])"));
		savebutton.click();
		
		return new Dashboard();
	}
}
