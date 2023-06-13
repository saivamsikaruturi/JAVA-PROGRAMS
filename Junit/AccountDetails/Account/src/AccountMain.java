import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class AccountMain{
    public static void main(String [] args){
        Account acc = new Account(1035,"Savings",10000);
        acc.deposit(5000);
        System.out.println("Amount after deposit : "+acc.getBalance());
        acc.withdraw(15000);
        System.out.println("Amount after withdraw : "+acc.getBalance());
        acc.withdraw(100);
        System.out.println("Amount after withdraw : "+acc.getBalance());
        Result result=JUnitCore.runClasses(AccountTest.class);
        for(Failure failure:result.getFailures()){
            System.out.println(failure);
        }
        System.out.println("Result="+result.wasSuccessful());
    }
}