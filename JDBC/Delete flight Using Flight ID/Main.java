import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlightManagementSystem f=new FlightManagementSystem();
        if(f.deleteFlight(123)==true)
        System.out.println("Flight Details deleted successfully");
        else
        System.out.println("Flight Not deleted. Check for the ID");
    }
}