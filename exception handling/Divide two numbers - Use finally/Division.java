import java.util.Scanner;
public class Division
{
    public  String divideTwoNumbers(int number1,int number2)                                                                                  
    {
        String output="";
        try
        {
            if(number2==0)
            throw new ArithmeticException();
            output ="The answer is"+" " +number1/number2+"."+" ";
        }

        catch(ArithmeticException a)
        {
           output="Division by zero is not possible. ";
        }
        finally
        {
          output+="Thanks for using the application.";
        }
        return output;
         
    }
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter the numbers");
       int number1 = sc.nextInt();
       int number2=sc.nextInt();
        System.out.println(new Division().divideTwoNumbers(number1,number2));
    }
}
