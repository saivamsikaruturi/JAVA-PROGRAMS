
import java.util.*;
import java.io.*;
public class FileDemo{
        public static void main(String[] args) throws FileNotFoundException
        {
            String word="";
            String current;
            Scanner sc=new Scanner(new File("log.txt"));
            while(sc.hasNext()){
                current=sc.next();
                if(current.length()>word.length()){
                    word=current;
                }
            }
            System.out.println(word);
        }
}