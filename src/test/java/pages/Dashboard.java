package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Openbrowser;

public class Dashboard extends Openbrowser{

	
	public Add_customer_list click_on_contacts() throws InterruptedException
	{
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='users icon']")));
				WebElement contacts = driver.findElement(By.xpath("//i[@class='users icon']"));
		Actions action = new Actions(driver);
				action.moveToElement(contacts);
		action.perform();
		
		WebElement contacts_menu = driver.findElement(By.xpath("//span[text()='Contacts']"));
		contacts_menu.click();
		
		return new Add_customer_list();
	}
	
	
	
}
