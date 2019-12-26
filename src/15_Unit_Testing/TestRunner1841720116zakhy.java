package unittesting;

//import javax.naming.spi.DirStateFactory.Result;

//import com.mysql.cj.xdevapi.Result;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1841720116zakhy {
    
    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessor1841720116zakhytest.class);
        showMessageResult(mResult, MessageProcessor1841720116zakhytest.class.getSimpleName());
    }
    
    public static void showMessageResult(Result mResult, String className){
        if(mResult.wasSuccessful()){
            System.out.format("The Result Test from %s : %s\n", className,mResult.wasSuccessful());
        }else{
            for(Failure failure : mResult.getFailures())
                System.out.println(failure.toString());
        }
        //System.out.println(mResult.wasSuccessful());
    }
}
