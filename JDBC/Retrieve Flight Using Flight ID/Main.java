import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlightManagementSystem o=new FlightManagementSystem();
        if(o.viewFlightById(123)!=null){
            Flight f=o.viewFlightById(123);
            System.out.println("Flight ID:"+f.getFlightId());
            System.out.println("Source:"+f.getSource());
            System.out.println("Destination:"+f.getDestination());
            System.out.println("No of seats:"+f.getNoOfSeats());
            System.out.println("Flight Fare:"+f.getFlightFare());
        }
        else
        System.out.println("Invalid Flight ID");
    }
}