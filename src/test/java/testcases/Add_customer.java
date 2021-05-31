package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import common.Openbrowser;
import pages.Dashboard;
import pages.Login_page;

public class Add_customer extends Openbrowser{
	
	
	@Test(priority = 0)
	public static void login_case() throws IOException, InterruptedException
	{
		new Login_page()
		.enter_username()
		.enterpassword()
		.click_login_button();
	}
	
	
	
	@Test(priority = 1)
	public void add_new_customers() throws IOException, InterruptedException
	{
		new Dashboard()
		.click_on_contacts()
		.Click_create_button()
		.enter_first_name()
		.enter_lastname()
		.click_on_save_button()
		.click_on_contacts()
		.verify_the_user();
	}

}
