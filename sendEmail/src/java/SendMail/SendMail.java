package SendMail;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
  
public class SendMail  
{  
 public static void main(String [] args){  
      String to = "test@gmail.com";//change accordingly  
      String from = "test@yahoo.com";//change accordingly  
      String host = "localhost";//or IP address 
      String port="1025";
  
     //Get the session object  
      Properties properties = System.getProperties();  
      properties.setProperty("mail.smtp.host", host); 
      properties.setProperty("mail.smtp.port", port);
      Session session = Session.getDefaultInstance(properties);  
  
     //compose the message  
      try{ 
         MimeMessage message = new MimeMessage(session);  
         message.setFrom(new InternetAddress(from));  
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
         message.setSubject("Another Test");  
         message.setText("Hello, this is another test example of sending email with Java Mail. ");  
  
         // Send message  
         Transport.send(message);  
         System.out.println("message sent successfully....");  
  
      }catch (MessagingException mex) {mex.printStackTrace();}  
   }  
}  