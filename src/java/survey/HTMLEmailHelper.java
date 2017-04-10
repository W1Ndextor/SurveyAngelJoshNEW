
package survey;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Angel
 */
public class HTMLEmailHelper {
    
    private final String email = "acjam113@gmail.com";
    private final String username = "acjam113@gmail.com";
    private final String password = "dovetest2";
    private final String host = "smtp.gmail.com";
    private final int port = 465;
    
    private Properties props = null;
    private SMTPAuthenticator auth = null;
    private Session ses = null;
    
    public int send(String to, String subject, String body){
        int result = 0;
        
        props = new Properties();
        auth = new SMTPAuthenticator();
        ses = Session.getInstance(props, auth);
        
        MimeMessage msg = new MimeMessage(ses);
        try{
            msg.setContent(body, "text/html");
            msg.setSubject(subject);
            msg.setFrom(new InternetAddress(email));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            
            Transport transport = ses.getTransport("smpts");
            transport.connect(host, port, username, password);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            
            result = 1;
        }catch (MessagingException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public static class SMTPAuthenticator extends Authenticator {
        public PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication("acjam113", "dovetest2");
        }
        
    }
    
}
