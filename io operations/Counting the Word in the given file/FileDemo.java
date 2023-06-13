
import java.util.*;
import java.io.*;
public class FileDemo{
    public static void main(String[] args) 
    {
        int c=0;
        try{
            File file=new File("log.txt");
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String[] words=sc.nextLine().split(" ");
                for(int i=0;i<words.length;i++){
                    //System.oput.println(words[i]+" ");
                    if(words[i].toLowerCase().equals("knowledge"))
                    c++;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
            
            System.out.println(c);
    }
}