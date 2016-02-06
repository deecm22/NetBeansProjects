package wrUtil;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
//import javax.activation.*;  
  
public class SendMail  
{  
 public void sendEmail(String to, String from,  String subject, String body){  
      //String to = "test@gmail.com";//change accordingly  
      //String from = "test@yahoo.com";//change accordingly  
      //mail server information should be in a properties file.
      //mailcatcher smtp hostname
      String host = "localhost";//or IP address 
      //smtp port
      String port="1025";
  
     //configure the properties for the session
      Properties properties = System.getProperties();  
      properties.setProperty("mail.smtp.host", host); 
      properties.setProperty("mail.smtp.port", port);
      
      //Get the session object.
      Session session = Session.getInstance(properties);  
  
     //compose the message  
      try{ 
         MimeMessage message = new MimeMessage(session);  
         message.setFrom(new InternetAddress(from));  
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
         message.setSubject(subject);  
         message.setText(body);  
  
         // Send message  
         Transport.send(message);  
         System.out.println("message sent successfully....");  
  
      }catch (MessagingException mex) {mex.printStackTrace();}  
     
   }  
}  