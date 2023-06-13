
import java.io.*;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.lang.*;
import java.util.concurrent.*;
public class StudentMarkList
{
    public static ConcurrentHashMap<String,Integer>getStudentMarkDetails()
    {
        Scanner sc=new Scanner(System.in);
        String s="Y";
        ConcurrentHashMap<String,Integer>number=new ConcurrentHashMap<String,Integer>();
        while(!(s.equals("N")))
        {
            System.out.println("Enter the name");
            String name=sc.nextLine();
            System.out.println("Enter the marks");
            int mark=Integer.parseInt(sc.nextLine());
            System.out.println("Do you want to continue (Y/N)");
            String s1=sc.nextLine();
            s=s1;
            number.put(name,mark);
        }
        return number;
    }
    public static ArrayList<String> getStudentListToDelete()
    {
        Scanner sc=new Scanner(System.in);
        String s3="Y";
        ArrayList<String> l1=new ArrayList<>();
        while(s3.equals("Y"))
        {
            System.out.println("Enter the name of the student to delete");
            String name=sc.nextLine();
            System.out.println("Do you want to continue (Y/N)");
            s3=sc.nextLine();
            l1.add(name);
        }
        return l1;
    }
    public static void main(String args[]){
        StudentMarkList m=new StudentMarkList();
        System.out.println("Add to Student Mark Register");
        ConcurrentHashMap<String,Integer> number=m.getStudentMarkDetails();
        System.out.println("Student details to be deleted");
        ArrayList<String>l1=m.getStudentListToDelete();
        System.out.println("Before deleting");
        for(Map.Entry<String,Integer>i:number.entrySet())
        {
            System.out.println("Name: "+i.getKey()+" Marks: "+i.getValue());
            
        }
        System.out.println("After deleting:");
        for(Map.Entry<String,Integer>j:number.entrySet()){
            if(l1.contains(j.getKey()))
            {
                number.remove(j.getKey(),j.getValue());
            }
        }
        for(Map.Entry<String,Integer>i:number.entrySet())
        {
            System.out.println("Name: "+i.getKey()+" Marks: "+i.getValue());
            
        }
    }
}