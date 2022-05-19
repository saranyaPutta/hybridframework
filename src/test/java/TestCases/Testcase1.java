package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Login;

public class Testcase1  extends Mainclass {
		@Test
		public void loginTest() throws IOException
		{
			driver.get(baseURL);
			logger.info("URL is open");
			Login lp = new Login(driver);
			lp.setUserName(username);
			logger.info("Enter username");
			lp.setPassword(password);
			logger.info("Enter password");
			lp.clickSubmit();
			
			lp.setSearchfor(Search);
			logger.info("Enter search");
			lp.clickSubmit();
			
			if (driver.getTitle().equals("Facebook– log in or sign up")) {
				Assert.assertTrue(true);
				logger.info("login test passed");
			} else {
				captureScreen(driver,"loginTest");//calling from base
				Assert.assertTrue(false);
				logger.info("login test failed");
			}
			
		}
	}

