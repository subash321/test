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
public class SeleniumSeverStart_Test {
	@Test
	public  void Stopseleniumserver()
	{
		try
		{
			String[] cmd = new String[5];
			cmd[0] = "cmd.exe";
			cmd[1] = "/D";
			cmd[2] = "start";
			cmd[3] = "cd selenium Grid\\selenium-grid-1.0.7";
			cmd[4] = "ant launch-hub";
			Runtime.getRuntime().exec(cmd);
			System.out.println("Selenium Serever stopped");
		}
		catch(Exception e) {
	System.out.println("Error stopping selenium srver: " +	e);
	e.printStackTrace();
	}
	}
		
}
