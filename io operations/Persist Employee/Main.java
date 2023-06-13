
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws FileNotFoundException

    {
        try{
            File file=new File("log.txt");
            boolean res=file.createNewFile();
            if(res==false)
            System.out.println("File not created");
            ArrayList<Employee> list=new ArrayList<Employee>();
            EmployeeUtility eu=new EmployeeUtility();
            Scanner sc=new Scanner(System.in);
            while(true){
                System.out.println("Enter your Id:");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter your Name:");
                String name=sc.nextLine();
                System.out.println("Enter Apprisa Rating: ");
                float r=sc.nextFloat();
                Employee e=new Employee(id,name,r);
                list.add(e);
                sc.nextLine();
                System.out.println("Do you want to continue(yes/no):");
                String ans=sc.nextLine();
                if(ans.equals("no"))
                break;
            }
            eu.addEmployee("log.txt",list);
            System.out.println("Enter the employee id:");
            int id1=sc.nextInt();
            sc.nextLine();
            Employee emp=eu.viewEmployeeById("log.txt",id1);
            System.out.println(emp.getEmployeeId());
            System.out.println(emp.getName());
            System.out.println(emp.getAppraisalRating());
            
        }catch(Exception e){
            System.out.println("Main error");
        }
        
    }
}