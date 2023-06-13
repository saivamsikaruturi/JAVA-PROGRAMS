 import java.sql.*;
import java.util.*;
public class FlightManagementSystem{
    public boolean updateFlightFare(int flightId,double flightFare)
    {
        try{
            DB db=new DB();
            Connection ct=db.getConnection();
            PreparedStatement st=ct.prepareStatement("Update flight set flightfare="+flightFare+"where flightId="+flightId);
            int s=st.executeUpdate();
            if(s==1)
            return true;
            
        }
        catch(Exception e){
            
        }
        return false;
    }
}