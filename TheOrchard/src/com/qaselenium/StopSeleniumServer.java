/**
 * @author sushant.sharma
 * Date : Mar 29 2012
 */
package com.qaselenium;

import org.testng.annotations.Test;

/**
 * @author sushant.sharma
 *
 */
public class StopSeleniumServer {
	@Test
	public  void Stopseleniumserver()
	{
		try
		{
			String[] cmd = new String[4];
			cmd[0] = "cmd.exe";
			cmd[1] = "/C";
			cmd[2] = "start";
			cmd[3] = "http://localhost:4444/selenium-server/driver/?cmd=shutDownSeleniumServer";
			Runtime.getRuntime().exec(cmd);
			System.out.println("Selenium Serever stopped");
		}
		catch(Exception e) {
	System.out.println("Error stopping selenium srver: " +	e);
	e.printStackTrace();
	}
	}
		
}
