import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlightManagementSystem o=new FlightManagementSystem();
        String s=sc.nextLine();
        String d=sc.nextLine();
        ArrayList<Flight>
            list =o.viewFlightsBySourceDestination(s,d);
            if(list.size()==0)
        {
            System.out.println("No flights available for the given source and destination");
        }
        else{
            for(Flight f:list)
            {
                System.out.println("Flight ID:"+f.getFlightId());
                System.out.println("Source:"+f.getSource());
                System.out.println("Destination:"+f.getDestination());
                System.out.println("No of seats:"+f.getNoOfSeats());
                System.out.println("Flight Fare:"+f.getFlightFare());
            }
        }
    }
}