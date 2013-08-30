/* This Test Case to start selenium server
 *  * @author sneha.chemburkar
 * Date:Oct 18, 2011
 */
package com.qaselenium;
import org.testng.annotations.*;

import com.thoughtworks.selenium.Selenium;

public class CopyOfStartSeleniumHub {
	public  Selenium selenium;
	//public static final String path = "C:\\SVN\\askmetestsvn\\TestCases\\Automation\\UserJarLibrary\\selenium-server-standalone-2.15.0.jar";
	@Test	
	public  void seleniumserver()
	{
		try {
			String locateSelenium_dir ="D:\\f drive subhash\\SafeFiles\\EclipseWorkspace\\Workspace_04May12\\workspace\\TheOrchard\\selenium-grid-1.0.7";
			String browse="*firefox C:\\Program Files\\Mozilla Firefox\\firefox.exe";
	//String locateSelenium_dir = "D:\\selenium Grid\\selenium-grid-1.0.7";
	 System.out.println("Selenium_Gridtesting");
	 Runtime rt = Runtime.getRuntime();
	 System.out.println("Selenium_Gridtestingantlaunch");
	 Process Process_01 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant launch-hub");
//	 Thread.sleep(12579);
	 System.out.println("Selenium_Gridtestingantremoteservlaunch");
	 Process Process_02 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5551 -DhubURL=http://localhost:4444 launch-remote-control");
       	 

//	 Thread.sleep(12579);
	 /*Process Process_02 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari launch-remote-control -DhubURL=http://192.168.0.130:4444 -Dhost=192.168.0.192 -Dport=5551");*/
     System.out.println("Selenium_Gridtestingantremoteservelaunch");
//	 Process Process_03 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5551 -Dhost=192.168.0.104 -DhubURL=http://localhost:4444 launch-remote-control");
 	 Process Process_03 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5553 -DhubURL=http://localhost:4444 launch-remote-control");
	 Process Process_04 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5552 -DhubURL=http://localhost:4444 launch-remote-control");
	 System.out.println("Selenium_Gridtestingantlaunch_remotese");
	 Process Process_05 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5554 -DhubURL=http://localhost:4444 launch-remote-control");
	 Process Process_06 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5555 -DhubURL=http://localhost:4444 launch-remote-control");
	 Process Process_07 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5556 -DhubURL=http://localhost:4444 launch-remote-control");
	 Process Process_08 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5557 -DhubURL=http://localhost:4444 launch-remote-control");
	 Process Process_09 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5558 -DhubURL=http://localhost:4444 launch-remote-control");
	 Process Process_10 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5559 -DhubURL=http://localhost:4444 launch-remote-control");
	 Process Process_11 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5560 -DhubURL=http://localhost:4444 launch-remote-control");
	 Process Process_12 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5561 -DhubURL=http://localhost:4444 launch-remote-control");
	 Process Process_13 = rt.exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*safari -Dport=5562 -DhubURL=http://localhost:4444 launch-remote-control");
	 Thread.sleep(23579);
	 


	/*  System.out.println("Running Selenium Server ");
		Runtime.getRuntime().exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*iehta -Dport=5557  -DhubURL=http://localhost:4444 launch-remote-control");
		Runtime.getRuntime().exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*iehta -Dport=5558  -DhubURL=http://localhost:4444 launch-remote-control");
		Runtime.getRuntime().exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*iehta -Dport=5559  -DhubURL=http://localhost:4444 launch-remote-control");
		Runtime.getRuntime().exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*iehta -Dport=5561  -DhubURL=http://localhost:4444 launch-remote-control");
		Runtime.getRuntime().exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*iehta -Dport=5562  -DhubURL=http://localhost:4444 launch-remote-control");
	*/	 
	 
	 
//	Runtime.getRuntime().exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant launch-hub");
//	Runtime.getRuntime().exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*iehta -Dport=5557  -DhubURL=http://localhost:4444 launch-remote-control");
//	Runtime.getRuntime().exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*iehta -Dport=5558  -DhubURL=http://localhost:4444 launch-remote-control");
//	Runtime.getRuntime().exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*iehta -Dport=5559  -DhubURL=http://localhost:4444 launch-remote-control");
//	Runtime.getRuntime().exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*iehta -Dport=5561  -DhubURL=http://localhost:4444 launch-remote-control");
//	Runtime.getRuntime().exec("cmd.exe /c cd \""+locateSelenium_dir+"\" & start ant -Denvironment=*iehta -Dport=5562  -DhubURL=http://localhost:4444 launch-remote-control");
	Thread.sleep(3579);
	System.out.println("Running Selenium Server batch file");
//	java -jar selenium-server-standalone-2.14.0.jar -role node  -hub http://localhost:4444/grid/register
//	Runtime.getRuntime().exec("java -jar D:\\Softwares\\Askme\\UserJarLibrary\\selenium-server-standalone-2.21.0.jar -role node  -hub");	
// 	Runtime.getRuntime().exec("java -jar D:\\Softwares\\Askme\\UserJarLibrary\\selenium-server-standalone-2.21.0.jar -interactive ");
//	Runtime.getRuntime().exec("java -jar D:\\Softwares\\Askme\\UserJarLibrary\\selenium-server-standalone-2.21.0.jar -userExtensions D:\\Softwares\\Askme\\UserJarLibrary\\user-extensions.js");
//	Runtime.getRuntime().exec("java -jar D:\\Softwares\\Askme\\UserJarLibrary\\selenium-server-standalone-2.21.0.jar -port 4445 -interactive");
	
//	Runtime.getRuntime().exec("java -jar D:\\selenium Grid\\selenium-grid-1.0.7\\lib\\selenium-grid-hub-standalone-1.0.7.jar ");
	System.out.println("SeleniumServer started");
//	Process.destroy();
//	System.exit(0);
	
	} 
	catch(Exception e) {
	System.out.println("Error starting selenium server: " +	e);
	e.printStackTrace();
	}
	}
	}


