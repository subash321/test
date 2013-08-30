/* This Test Case to start selenium server
 *  * @author sneha.chemburkar
 * Date:Oct 18, 2011
 */
package com.qaselenium;
import org.testng.annotations.*;

import com.thoughtworks.selenium.Selenium;




public class safeStartSeleniumHub {
	public  Selenium selenium;
	//public static final String path = "C:\\SVN\\askmetestsvn\\TestCases\\Automation\\UserJarLibrary\\selenium-server-standalone-2.15.0.jar";
	@Test
	public  void seleniumserver()
	{		
		try {
	String rynew_dir = "D:\\selenium Grid\\selenium-grid-1.0.7";
	
	System.out.println("Running Selenium Server ");
	Runtime.getRuntime().exec("cmd.exe /c cd \""+rynew_dir+"\" & start ant launch-hub");
	Runtime.getRuntime().exec("cmd.exe /c cd \""+rynew_dir+"\" & start ant -Denvironment=*iehta -Dport=5557  -DhubURL=http://localhost:4444 launch-remote-control");
	System.out.println("Running Selenium Server batch file");
//	java -jar selenium-server-standalone-2.14.0.jar -role node  -hub http://localhost:4444/grid/register
//	Runtime.getRuntime().exec("java -jar D:\\Softwares\\Askme\\UserJarLibrary\\selenium-server-standalone-2.21.0.jar -role node  -hub");	
// 	Runtime.getRuntime().exec("java -jar D:\\Softwares\\Askme\\UserJarLibrary\\selenium-server-standalone-2.21.0.jar -interactive ");
//	Runtime.getRuntime().exec("java -jar D:\\Softwares\\Askme\\UserJarLibrary\\selenium-server-standalone-2.21.0.jar -userExtensions D:\\Softwares\\Askme\\UserJarLibrary\\user-extensions.js");
//	Runtime.getRuntime().exec("java -jar D:\\Softwares\\Askme\\UserJarLibrary\\selenium-server-standalone-2.21.0.jar -port 4445 -interactive");
	System.out.println("SeleniumServer started");
	} 
	catch(Exception e) {
	System.out.println("Error starting selenium server: " +	e);
	e.printStackTrace();
	}
	}
	}


