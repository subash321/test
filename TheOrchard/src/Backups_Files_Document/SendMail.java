package Backups_Files_Document;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
 
public class SendMail
	{
	private String recipient;
	private String textMessage;
	

	public SendMail(String recipient, String textMessage) {
		// TODO Auto-generated constructor stub
		this.recipient=recipient;
		this.textMessage=textMessage;
	
	}

	public void send(String recipient,String textMessage)
    {
    	System.out.println("test");
        Properties props = new Properties();
        props.put("mail.smtp.user", "sona.dhepse@gmail.com");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", 465);
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", 465);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
 
        try
        {
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            //session.setDebug(true);
 
            MimeMessage msg = new MimeMessage(session);
            msg.setText("Confirmation Details about Newly created Version : "+textMessage);
            msg.setSubject("Confirmation Mail");
            msg.setFrom(new InternetAddress("sona.dhepse@gmail.com"));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress("subash.bose@synergytechservices.com"));
            Transport.send(msg);
        }
        catch (Exception mex)
        {
            mex.printStackTrace();
        } 
    }
    
    private class SMTPAuthenticator extends javax.mail.Authenticator
    {
        public PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication("sona.dhepse@gmail.com", "9969557732");
        }
    }
}