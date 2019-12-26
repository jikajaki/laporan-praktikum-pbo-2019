package unittesting;

import org.junit.Assert;
import org.junit.Test;
public class MessageProcessor1841720116zakhytest {
    MessageProcessor1841720116zakhy mProcessor;

    public MessageProcessor1841720116zakhytest() {
        mProcessor = new MessageProcessor1841720116zakhy();
        mProcessor.setSenderzakhy("Ronaldo");
        mProcessor.setRecipientzakhy("Rafael");
        mProcessor.setMessagezakhy("Whats up bro?");
    }
    
    @Test
    public void testShowMessagezakhy(){
        String expetedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expetedResult, mProcessor.messageFormatzakhy());
    }
}
