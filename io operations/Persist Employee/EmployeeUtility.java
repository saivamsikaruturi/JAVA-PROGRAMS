import java.io.*;
import java.util.*;
@SuppressWarnings("unchecked") 
public class EmployeeUtility {
    public boolean addEmployee(String fileName, ArrayList<Employee> employeeList)
    {
        try{
            FileOutputStream fos=new FileOutputStream(fileName); 
            ObjectOutputStream out=new ObjectOutputStream(fos);
            out.writeObject(employeeList);
            out.close(); 
            fos.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return true;
    }
    public Employee viewEmployeeById(String fileName,int employeeId)
    {
        ArrayList<Employee> list=null;
        try{
            FileInputStream fis=new FileInputStream(fileName);
            ObjectInputStream input=new ObjectInputStream(fis); 
            list=(ArrayList)input.readObject();
            for(Employee e:list)
            {
                if(e.getEmployeeId()==employeeId)

return e;          
}
return null;
        } 
        catch(Exception e)
        {
            System.out.println("Some Error");
        }
        return null;
    }
}