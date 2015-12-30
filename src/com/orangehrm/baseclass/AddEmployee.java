package com.orangehrm.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddEmployee  extends Constants{
	
	@Test
	public void addEmployeeTest() throws IOException
	{
		AddEmployeePage aep=PageFactory.initElements(driver,AddEmployeePage.class);
		int rowcount=eo.getRowCount(empList,0);
		String runmode=eo.getCellData(dataengine,0,2,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("AddEmpl test case skipped");
		}
		else
		{
			for(int i=1;i<=rowcount;i++)
			{
			
				Row r=eo.getRow(empList, 0,i);
				Sleeper.sleepTight(10);
				aep.menu.pim();
				Sleeper.sleepTight(10);
				aep.addEmplopyee.click();
				Sleeper.sleepTight(5);
				aep.addEmployee(r);
			}
		}
	}

}
