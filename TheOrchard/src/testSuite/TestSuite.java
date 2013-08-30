package testSuite;

import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class TestSuite  {

	public SeleniumServer server;

	@BeforeSuite(alwaysRun = true)
	public void setupBeforeSuite() {
	
	  
	  RemoteControlConfiguration rcc = new RemoteControlConfiguration();
	  rcc.reuseBrowserSessions();
	  
	  	  //starting selenium server
	 
	    try {
			server = new SeleniumServer(false, rcc);
			 server.boot();
			    server.start();
			  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	  
	  
	}
	  
	//killing selenium server
	@AfterSuite(alwaysRun = true)
	public void setupAfterSuite()  {
		 server.stop();
		
			 
		}
	
	}