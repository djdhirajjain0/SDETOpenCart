package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass
{
	@Test(groups= {"Regression","Master"}) //Step8 groups added
	public void test_account_Registration() throws InterruptedException
	{		
		logger.info("Starting TC_001_AccountRegistrationTest");
//		try {
			HomePage hp = new HomePage(driver);
			
			hp.clickRegister();
			logger.info("Clicked on Register ");

			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
			Thread.sleep(1000);
			regpage.setFirstName(randomeString().toUpperCase());
			logger.info("Provided First Name ");

			regpage.setLastName(randomeString().toUpperCase());
			logger.info("Provided Last Name ");

			regpage.setEmail(randomeString() + "@gmail.com");// randomly generated the email
			//regpage.setEmail("pavannoltraining@gmail.com");// duplicate email should fail test case
			logger.info("Provided Email ");

			regpage.setTelephone(randomeNumber());
			logger.info("Provided Telephone ");

			regpage.setPassword("test@123");
			logger.info("Provided Password ");

			regpage.setConfirmPassword("test@123");
			logger.info("Provided Confrmed Password ");

			regpage.setPrivacyPolicy();
			logger.info("Set Privacy Policy ");

			regpage.clickContinue();
			logger.info("Clicked on Continue ");

			Thread.sleep(2000);

			String confmsg = regpage.getConfirmationMsg();
			Assert.assertEquals(confmsg, "Your Account Has Been Created!");
//		}
//		catch(Exception e)
//		{
//			Assert.fail();
//		}

		logger.info("Finished TC_001_AccountRegistrationtTest");
	}
					
}


