package com.orangehrm.baseclass;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TakingScreenshot  extends Constants{
	
	@Test
	public void screenshotTest() throws IOException
	{
		String runmode=eo.getCellData(dataengine,0,3,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Screenshot test case skipped");
		}
		else
		{
			scr.takescreenshot(driver,screenshotPath+"\\Addemployee.png");
		}
	}

}
