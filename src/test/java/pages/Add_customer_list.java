package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.Openbrowser;

public class Add_customer_list extends Openbrowser{
	
	
	public Add_customer_page Click_create_button()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='ui linkedin button'])[3]")));
		WebElement createbutton = driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[3]"));
		createbutton.click();
		
		return new Add_customer_page();
	}
	
	
	public Add_customer_list verify_the_user() throws InterruptedException
	{
		WebElement createbutton = driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[3]"));
		Thread.sleep(5000);

		Actions action = new Actions(driver);
		action.moveToElement(createbutton);
action.perform();
Thread.sleep(5000);
		WebElement customername1 = driver.findElement(By.xpath("(//td//a)[1]"));
		String customername = customername1.getText();
		System.out.println(customername+" this is customer name");
		String[] name = customername.split(" ");
		String firstname = name[0];
		Assert.assertEquals(firstname, "basker1", "The name is not matching");
		return this;
	}
	
	

}
