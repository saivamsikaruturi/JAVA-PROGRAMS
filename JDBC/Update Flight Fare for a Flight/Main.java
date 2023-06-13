import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlightManagementSystem f=new FlightManagementSystem();
        if(f.updateFlightFare(123,450)==true)
        System.out.println("Flight Fare updated successfully");
        else
        System.out.println("Flight fare not updated. Check for the ID");
        
    }
}