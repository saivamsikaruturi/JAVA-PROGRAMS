 //import necessary packages
 import java.io.*;
 import java.util.Scanner;
 
 @SuppressWarnings("unchecked")//Do not delete this line
 public class FileManager 
 {
    static int count;
    static public File createFile()
    {
     File file=null;
     try{
         file=new File("visitors.txt");
         boolean res=file.createNewFile();
     }
     catch(IOException e){
         System.out.println("error");
     }
    return file;//change the return type as per the requirement    
    }
    static public void writeFile(File f, String record)
	{
	    try{
	        FileOutputStream fos=new FileOutputStream(f,true);
	        byte[] b=record.getBytes();
	        fos.write(b);
	        count++;
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	} 
	static public String[] readFile(File f)
	{
	    String k[]=new String[count];
	     String t="";
	     int counts=0;
	     FileInputStream fis=null;
	     int d=0;
	     try{
	         fis=new FileInputStream(f);
	         while((d=fis.read())!=-1){
	             if((char)d!=';'){
	                 t+=(char)d;
	             }
	             else{
	                 k[counts]=t;
	                 counts++;
	                 t="";
	             }
	         }
	     }
	     catch(Exception e)
	     {
	         e.printStackTrace();
	     }
	    return k;//change the return type as per the requirement  
	}
 }