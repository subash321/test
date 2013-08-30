package Backups_Files_Document;


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

public class Backups_SendMail {
	
	@Test
		public void sendMail() throws Exception {	   
	{
		System.out.println("29");
		createZip();
		String  fileAttachment="D:\\test-output.zip";
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
	      props.put("mail.smtp.host","smtp.gmail.com");
	      //properties.setProperty("192.168.133.10", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(props);
	      
	     

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);
	         
	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));
	       
	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));
	        
	         // Set Subject: header field
	         message.setSubject("AskMe Web Automation Reports");
	       
	        
				MimeBodyPart messageBodyPart =   new MimeBodyPart();
				
					    //fill message
					    messageBodyPart.setText("Automation reports for  "+new Date());

					    Multipart multipart = new MimeMultipart();
					    
					    multipart.addBodyPart(messageBodyPart);

					    // Part two is attachment
					    messageBodyPart = new MimeBodyPart();
					
					  
					   
					    DataSource source =  new FileDataSource(fileAttachment);
					    
					    messageBodyPart.setDataHandler(new DataHandler(source));
					   
					    messageBodyPart.setFileName("Automation test report.zip");
					    
					    multipart.addBodyPart(messageBodyPart);
                        
					    // Put parts in message
					    message.setContent(multipart);
					   
				
	                   // Send message
	                   Transport.send(message);
	                
	                   System.out.println("Sent mail successfully....");
	      }catch (Exception e) {
	    	  throw new IllegalStateException("Mail not send", e);
	      }
	   }
	
	}
//	public static File[] attachment(){

	
	public static void createZip() throws Exception {
		
		File dir = new File("C:\\Automation\\AskMeWeb\\test-output\\Test Reports");
		String[] files=new String[dir.list().length];
		
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
	
	    String outFilename = "C:\\Automation\\AskMeWeb\\test-output\\TestReport.zip";
	    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));

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

}
