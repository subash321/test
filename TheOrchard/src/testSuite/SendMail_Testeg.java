package testSuite;


import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.Date;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import org.testng.annotations.Test;

import FunctionLibrary.Common;

public class SendMail_Testeg {
	
	@Test
		public void sendMail() throws Exception {	   
	{
		System.out.println("29");
		createZip();
		String  fileAttachment="D:\\f drive subhash\\SafeFiles\\EclipseWorkspace\\Workspace_04May12\\workspace\\TheOrchard\\test-output\\TestReportUpdateJune.zip";
	      // Recipient's email ID needs to be mentioned.
	      String to = "subash.bose@synergytechservices.com";

	      // Sender's email ID needs to be mentioned
	      String from = "esob.321321@gmail.com";

	      // Assuming you are sending email from localhost
	     // String host = "localhost";

	      // Get system properties
	     // Properties properties = System.getProperties();

	      // Setup mail server
	      Properties props = new Properties();
	      //String smtpHost=Common.getKeyValue("SMTP.Host");
//	      props.put("mail.smtp.host","192.168.0.104");
	      props.put("mail.smtp.user", "'esob.321321@gmail.com','QA Team'");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", 465);
	        props.put("mail.smtp.starttls.enable","true");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.socketFactory.port", 465);
	        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	        props.put("mail.smtp.socketFactory.fallback", "false");
			System.out.println("47");
	      //properties.setProperty("192.168.133.10", host);

	      // Get the default Session object.
//	      Session session = Session.getDefaultInstance(props);
	      
	     

	      try{
	    	  Authenticator auth = new SMTPAuthenticator();
	            Session session1 = Session.getInstance(props, auth);
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session1);
	         
	         // Set From: header field of the header.
	     
	            message.setText("Confirmation Details about Newly created Version : ");
	            message.setSubject("Selenium Report");
	            message.setFrom(new InternetAddress("esob.321321@gmail.com","QA Team"));
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress("subash.bose@synergytechservices.com"));
//	            message.addRecipient(Message.RecipientType.TO, new InternetAddress("sushant.Sharma@synergytechservices.com"));
	            MimeBodyPart messageBodyPart =   new MimeBodyPart();
				
			    //fill message
			    messageBodyPart.setText("Hi, \nPlease find attached selenium RC test case report which was executed on different browsers using selenium grid.\n\n\n\n\n\n\nThanks & Regards, \nQA Team\nSynergy Tech Service ");

//			    messageBodyPart.setText("Automation reports for  "+new Date());

			    Multipart multipart = new MimeMultipart();
			    
			    multipart.addBodyPart(messageBodyPart);
			    // Part two is attachment
			    messageBodyPart = new MimeBodyPart();
			    String FileName="Selenium Report.zip" ;
			    DataSource source =  new FileDataSource(fileAttachment);
			    messageBodyPart.setDataHandler(new DataHandler(source));
			    messageBodyPart.setFileName(FileName);
			    multipart.addBodyPart(messageBodyPart);
			    // Put parts in message
			    message.setContent(multipart);
	            
	            Transport.send(message);
	         message.setFrom(new InternetAddress(from));
	                   System.out.println("Sent mail successfully....");
	      }catch (Exception e) {
	    	  throw new IllegalStateException("Mail not send", e);
	      }
	   }
	
	}
	
//	public static File[] attachment(){

	
	public static void createZip() throws Exception {
		System.out.println("157");
		File dir = new File("D:\\f drive subhash\\SafeFiles\\EclipseWorkspace\\Workspace_04May12\\workspace\\TheOrchard\\test-output\\Test Reports");
		System.out.println("159");
		String[] files=new String[dir.list().length];
		
		System.out.println("161");

		File[] filenames = dir.listFiles();
		System.out.println("File names= ");       
		for (int i = 0; i < filenames.length; i++) {
		         
		if (filenames[i].isFile()) {
		
		files[i] = filenames[i].getName();
		 System.out.println(files[i]);
		 
		}
		}
		
	//String[] filenames = dir.list();

	// Create a buffer for reading the files
	byte[] buf = new byte[1024];

	//try {
	    // Create the ZIP file
	//String  outFile=Common.getKeyValue("Report.Attachment");
	
	System.out.println("185");
	    String outFilename = "D:\\f drive subhash\\SafeFiles\\EclipseWorkspace\\Workspace_04May12\\workspace\\TheOrchard\\test-output\\TestReportUpdateJune.zip";
	    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));
System.out.println("189");
	    // Compress the files
	    for (int i=0; i<files.length; i++) {
	    	if (filenames[i].isFile())
	    	{
	        FileInputStream in = new FileInputStream(filenames[i]);

	        // Add ZIP entry to output stream.
	        out.putNextEntry(new ZipEntry(files[i]));

	        // Transfer bytes from the file to the ZIP file
	        int len;
	        while ((len = in.read(buf)) > 0) {
	            out.write(buf, 0, len);
	        }

	        // Complete the entry
	        out.closeEntry();
	        in.close();
	    }
	    	else
		    	System.out.println(files[i]+"This is not a file");
	   }
	    
	    // Complete the ZIP file
	    out.close();
	    
	  System.out.println(out.toString());
//	} catch (Exception e) {
//		System.out.println("Zip file not created. "+e);
//	
//	}
	
}
	private class SMTPAuthenticator extends javax.mail.Authenticator
    {
        public PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication("esob.321321@gmail.com", "chandrachandra");
        }
    }

}
