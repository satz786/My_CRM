package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.Openbrowser;

public class Customer_details_page extends Openbrowser{
	
	
	public Customer_details_page get_name_value() throws InterruptedException
	{
		
		Thread.sleep(10000);
		WebElement customer_name = driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[1]/text()"));
		String firstname = customer_name.getText();
		System.out.println(firstname);
		return this;
	}

}
