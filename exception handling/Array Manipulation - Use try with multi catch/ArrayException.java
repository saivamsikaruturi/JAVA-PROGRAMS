
import java.io.*;
import java.util.*;
public class ArrayException{
    public String getPriceDetails()
    {
    
        Scanner sc=new Scanner(System.in);
        String ans="";
        try{
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the price details");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        
            arr[i]=sc.nextInt();
        
        System.out.println("Enter the index of the array element you want to access");
        int b=sc.nextInt();
       ans="The array element is "+arr[b]; 
        }
     catch(InputMismatchException e)
        {
             ans="Input was not in the correct format";
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            ans= "Array index is out of range";
        }
        catch(Exception e)
        {
    }
    return ans;
    }
    public  static void main (String[] args) {
    System.out.println(new ArrayException().getPriceDetails());
    }
}
