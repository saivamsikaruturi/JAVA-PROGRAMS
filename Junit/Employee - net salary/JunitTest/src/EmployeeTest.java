import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class EmployeeTest{
    @Test
    public void testCalNetPay(){
        Employee e=new Employee(123,"Jhon",100000.25,44);
        double salary=100000.25,pfper=44;
        double val=salary-salary*(pfper/100);
        assertTrue(e.calNetPay()==val);
        Employee e1=new Employee(123,"Jhon",100000.25,4);
        salary=100000.25;
        pfper=4;
        val=salary;
        assertTrue(e1.calNetPay()==val);
    }
}