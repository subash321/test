package Test_UsExt;

import static org.testng.AssertJUnit.*;
import org.testng.annotations.*;
import com.thoughtworks.selenium.*;


public class CopyOfSample2
{
    private static final String Timeout = "30000";
    private static final String BASE_URL = "http://google.com/";
    private static final String BASE_URL_1 = "/";
    private Selenium selenium;
    private HttpCommandProcessor proc;
    
    @BeforeClass
    protected void setUp()throws Exception
    {
       proc = new HttpCommandProcessor("localhost", 4444, "*iexplore", BASE_URL);
       selenium = new DefaultSelenium(proc);     
       selenium.start();
       selenium.windowFocus();
       selenium.windowMaximize();
       selenium.windowFocus();
    }
    
    @AfterClass(alwaysRun=true)
    protected void tearDown() throws Exception
    {
       selenium.stop();
    }
    
    @Test(groups="search")
    public void test_GoogleSearch() throws Exception
    {
     selenium.open(BASE_URL_1);
     System.out.println("test_01");
     selenium.type("name=q", "selenium HQ");
     System.out.println("test_01.0");
    // proc.doCommand("getTimerStart",new String[] {"GooglePage"});
     System.out.println("test_01.02");
    // System.out.println(proc.doCommand("getTimerStart",new String[] {"GooglePage"}));
     System.out.println("test_02");
     //selenium.click("btnG"); //selenium command 
     proc.doCommand("myClick",new String[] {"btnG"}); //user extension for Click ()
     System.out.println("test_03");
     selenium.waitForPageToLoad(Timeout);
     System.out.println (proc.doCommand("getTimerStop",new String[] {"GooglePage"}));
     Thread.sleep(5000); //Show the page for few seconds 
    }   
}