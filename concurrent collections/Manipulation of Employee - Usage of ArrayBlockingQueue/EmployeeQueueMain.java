import java.util.*;
import java.io.*;
import java.util.concurrent.*;
public class EmployeeQueueMain
{
    public static void main(String args[])
    {
        int ch=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Employees");
        int n=sc.nextInt();
        ArrayBlockingQueue<Employee> qob=new ArrayBlockingQueue<Employee>(n);
        while(!(ch==4))
        {
            System.out.println("Employee Queue Operations");
            System.out.println("1. Add an employee");
            System.out.println("2. Remove an employee");
            System.out.println("3. View all employees");
            System.out.println("4. Exit");
            System.out.println("Enter the choice");
            ch=sc.nextInt();
            if(ch==1)
            {
                try{
                    System.out.println("Enter the employee id, name and designation");
                    int empId=sc.nextInt();
                    String empName=sc.next();
                    String empDesign=sc.next();
                    Employee e=new Employee(empId,empName,empDesign);
                    qob.add(e);
                } catch(IllegalStateException e)
                {
                    System.out.println("Queue full");
                }
            }
            if(ch==2)
            {
                    System.out.println("Enter the empId, name and designation");
                    int empId=sc.nextInt();
                    String empName=sc.next();
                    String empDesign=sc.next();
                    Employee e=new Employee(empId,empName,empDesign);
                    qob.remove(e);
                    Object[] array=qob.toArray();
                    for(int i=0;i<array.length-1;i++)
                    {
                        System.out.println(array[i].toString());
                    }
            }
            if(ch==3)
            {
                Object[] array=qob.toArray();
                for(int i=0;i<array.length;i++)
                {
                    System.out.println(array[i].toString());
                }
            }
        }
    }
}