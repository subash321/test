/* This Test Case to start selenium server
 *  * @author sneha.chemburkar
 * Date:Oct 18, 2011
 */
package SeleniumServer;
import org.testng.annotations.*;

import com.thoughtworks.selenium.Selenium;




public class StartSeleniumServer {
	public  Selenium selenium;
	//public static final String path = "C:\\SVN\\askmetestsvn\\TestCases\\Automation\\UserJarLibrary\\selenium-server-standalone-2.15.0.jar";
	@Test
	public  void seleniumserver()
	{
	try
	{
	System.out.println("Running Selenium Server ");
	System.out.println("Running Selenium Server batch file");
	Runtime.getRuntime().exec("java -jar D:\\Softwares\\Askme\\UserJarLibrary\\selenium-server-standalone-2.21.0.jar -interactive ");
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
