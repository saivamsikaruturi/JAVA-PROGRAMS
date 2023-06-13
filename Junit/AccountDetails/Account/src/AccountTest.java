import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class AccountTest{
    @Test
    public void testWithdraw(){
        Account a1=new Account(123,"Savings",1000000);
        assertTrue(a1.withdraw(100)==true);
        assertTrue(a1.withdraw(1000000)==false);
        assertTrue(a1.withdraw(-100)==false);
        assertTrue(a1.withdraw(0)==false);
    }
    @Test
    public void testDeposit(){
        Account a1=new Account(123,"Savings",1000000);
        assertTrue(a1.deposit(100)==true);
        assertTrue(a1.deposit(-100)==false);
        assertTrue(a1.deposit(0)==false);
    }
}