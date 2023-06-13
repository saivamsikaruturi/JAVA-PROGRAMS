
import java.io.*;
public class FileDemo
{
    public static void main(String[] args) 
    {
     String line=null;
     try{
         FileReader fileReader =new FileReader("log.txt");
         BufferedReader bufferedReader=new BufferedReader(fileReader);
         while((line=bufferedReader.readLine())!=null){
             System.out.println(line);
         }
         bufferedReader.close();
     }catch(Exception e)
     {
    System.out.println("Error reading file");
    }
}
}