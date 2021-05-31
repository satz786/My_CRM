package common;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;


public class Openbrowser {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	

	@BeforeSuite
	public void browsers() throws IOException, InterruptedException
	{

		
		Propertyreader read = new Propertyreader();
		String browsername = read.getbrowsername();

		if(browsername.contentEquals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browsername.contentEquals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();


		}
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
		 wait = new WebDriverWait(driver, 30);
			/*
			 * WebElement element =
			 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
			 * "//input[@name='email']"))); WebElement emailid =
			 * driver.findElement(By.xpath("//input[@name='email']"));
			 * 
			 * emailid.sendKeys("saathish181@gmail.com"); WebElement password =
			 * driver.findElement(By.xpath("//input[@name='password']"));
			 * password.sendKeys("Test@123");
			 * 
			 * 
			 * WebElement loginbtn = driver.findElement(By.xpath("//div[text()='Login']"));
			 * loginbtn.click();
			 */

	}


	@AfterSuite
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement settingicon = driver.findElement(By.xpath("(//i[@class='settings icon'])[1]"));
		settingicon.click();
		Thread.sleep(5000);

		WebElement logout = driver.findElement(By.linkText("Log Out"));
		logout.click();
		driver.close();
	}






}
