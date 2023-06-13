
import java.io.*;
import java.util.*;
import java.lang.*;
public class  Main{
public static Candidate getCandidateDetails() throws InvalidSalaryException
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the candidate Details");
    System.out.println("Name");
    String name=sc.nextLine();
    System.out.println("Gender");
    String gender=sc.next();
    System.out.println("Expected Salary");
    double expectedsalary=sc.nextDouble();
    Candidate ob=new Candidate();
    ob.setName(name);
    ob.setGender(gender);
    ob.setExpectedSalary(expectedsalary);
    if(ob.getExpectedSalary()<10000)
    {
        throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
    }
    return ob;
}
public static void main (String[] args)  throws InvalidSalaryException{
   Candidate ob=getCandidateDetails();
   try{
       if(ob.getExpectedSalary()<10000){
           throw new InvalidSalaryException("Registeration Failed. Salary cannot be less than 10000. ");
       }
   }
    catch(InvalidSalaryException e)
    {
        System.out.println(e.getMessage());
    }
        System.out.println("Registeration Successful" );
    }
}