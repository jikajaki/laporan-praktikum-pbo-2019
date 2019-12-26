package unittesting;

public class MessageProcessor1841720116zakhy {
    private String mSender, mRecipient, mMessage;

     public String getMessagezakhy() {
         return mMessage;     
     } 
 
    public String getRecipientzakhy() {         
        return mRecipient;     
    } 
 
    public String getSenderzakhy() {         
        return mSender;     
    } 

      public void setMessagezakhy(String message) {         
          this.mMessage = message;     
    } 
 
    public void setRecipientzakhy(String recipient) {
        this.mRecipient = recipient;     
    } 
 
    public void setSenderzakhy(String sender) {
        this.mSender = sender;     
    } 
    
    public String messageFormatzakhy(){
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s", 
                this.mRecipient, this.mSender, this.mMessage);
        return message;
    }
    
    public void showMessagezakhy(){
        System.out.println(messageFormatzakhy());
    }
}
