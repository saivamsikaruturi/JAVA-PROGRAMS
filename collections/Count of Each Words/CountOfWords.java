
import java.io.*;
import java.util.*; //import the necessary packages if needed
     
@SuppressWarnings("unchecked")//Do not delete this line
public class CountOfWords
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String article=sc.nextLine();
    String str;
    ArrayList<String> list=new ArrayList<String>();
    String words[]=article.split("[\\s\\,\\;\\:\\.\\?\\!]+");
    for(int i=0;i<words.length;i++)
    {
        words[i]=words[i].toLowerCase();
        
    }
    for(String i:words)
    list.add(i);
    System.out.println("Number of words "+list.size());
    Map<String,Integer>map=new HashMap<String,Integer>();
    for(String i:list)
    {
        if(map.containsKey(i))
        map.put(i,1+map.get(i));
        else
        map.put(i,1);
    }
    System.out.println("Words with the count");
    TreeMap<String,Integer>tm=new TreeMap<>(map);
    for(Map.Entry m:tm.entrySet())
    {
        System.out.println(m.getKey()+": "+m.getValue());
    }
    }
}