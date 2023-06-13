import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlightManagementSystem o=new FlightManagementSystem();
        Flight f=new Flight(123,"jsr","asn",5,500);
        if(o.addFlight(f)==true)
        System.out.println("Flight details added Successfully");
        else
        System.out.println("Addition not done");
    }
}