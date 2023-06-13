import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class EmployeeMain{
    public static void main(String[] args){
        try{
            Result result=JUnitCore.runClasses(EmployeeTest.class);
            for(Failure failure:result.getFailures()){
                System.out.println(failure);
            }
                System.out.println("Result="+result.wasSuccessful());
                
            }
            catch(Exception e){
                
            }
        }
    }
