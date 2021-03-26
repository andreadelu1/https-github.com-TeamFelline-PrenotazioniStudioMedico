package it.meucci;

import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class SendMail {

    private static String USER_NAME = "";  // Inserire lo username GMail (la parte prima di "@gmail.com")
    private static String PASSWORD = ""; //  password dell'account Gmail
    private static String RECIPIENT = ""; //email destinatari TO
    //si potrebbero fare anche liste di destinatari CC e BCC
    

    public static void main(String[] args) 
    {
    	SendMail sm=new SendMail();
        String from = USER_NAME;
        String pass = PASSWORD;
        //String[] to = { RECIPIENT }; // list of recipient email addresses
        from=JOptionPane.showInputDialog("User name ");
        pass=JOptionPane.showInputDialog("password ");
        
        RECIPIENT=JOptionPane.showInputDialog("Destinatario ");
        String[] to = { RECIPIENT }; // list of recipient email addresses
        
        
        String subject = JOptionPane.showInputDialog("OGGETTO: ");
        String body = JOptionPane.showInputDialog("TESTO: ");

        //sendFromGMail(from, pass, to, subject, body);
    }

    public static void sendFromGMail(ArrayList<String> to, String subject, String body,File f) throws IOException {
 
        
        String host = "smtp.gmail.com";
        Properties props=new Properties();
		props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", "francescofelline2222@gmail.com");   //inserire la mail
        props.put("mail.smtp.password", "arturone69"); //inserire la password della mail
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

   	 	Multipart msg=new MimeMultipart();
   	 	MimeBodyPart att=new MimeBodyPart();
   	 	MimeBodyPart msgBody=new MimeBodyPart();
   	 
        
        try {
            message.setFrom(new InternetAddress(props.getProperty("mail.smtp.user")));
            ArrayList<InternetAddress>toAddress = new ArrayList<InternetAddress>(to.size()) ;
            
            
            if(f!=null) {
            	DataSource source = new FileDataSource(f);
            	att.setDataHandler(new DataHandler(source));
            	att.setFileName(f.getName());
            	msg.addBodyPart(att);
            	
            }

            // To get the array of addresses
            for( int i = 0; i < to.size(); i++ ) {
                toAddress.add(new InternetAddress(to.get(i)));
                
                //new InternetAddress(to[i])
            }

            for( int i = 0; i < toAddress.size(); i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress.get(i));
            }

            message.setSubject(subject);
            
            msgBody.setText(body);
            msg.addBodyPart(msgBody);
            
            message.setContent(msg);
            
            Transport transport = session.getTransport("smtp");
            System.out.println("Connessione al mail server");
            transport.connect(props.getProperty("mail.smtp.host"),props.getProperty("mail.smtp.user") ,props.getProperty("mail.smtp.password"));
            System.out.println("Connesso......");
            transport.sendMessage(message, message.getAllRecipients());
            System.out.println("Mail Inviata!!");
            transport.close();
            
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}