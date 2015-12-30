package com.orangehrm.baseclass;

import java.io.IOException;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Logout  extends Constants{

	@Test
	public void logoutTest() throws IOException
	{
		String runmode=eo.getCellData(dataengine,0,4,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Logout test case skipped");
		}
		else
		{
			Menu menu=PageFactory.initElements(driver,Menu.class);
			Sleeper.sleepTightInSeconds(5);
			menu.logout();
		}
}
	}
