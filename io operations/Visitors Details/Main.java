//import necessary packages
import java.util.Scanner;
import java.io.*;
 @SuppressWarnings("unchecked")//Do not delete this line
public class Main
{
	public static void main(String[] args) 
	{
	    FileManager fm=new FileManager();
	    Scanner sc=new Scanner(System.in);
	    String ans="yes";
	    File f=fm.createFile();
	    while(ans.equals("yes")){
	        System.out.println("Enter Name");
	        String name =sc.nextLine();
	        System.out.println("Enter Phone Number");
	        String no=sc.nextLine();
	        System.out.println("Enter Email");
	        String email=sc.nextLine();
	        System.out.println();
	        fm.writeFile(f,name+","+no+","+email+";");
	        System.out.println("Do you want to display all records(yes/no)");
	        String rep=sc.nextLine().toLowerCase();
	        if(rep.equals("yes")){
	            String s[]=fm.readFile(f);
	            int l=s.length;
	            for(int i=0;i<l;i++){
	                System.out.println(s[i]);
	            }
	        }
	    }
	}
}
