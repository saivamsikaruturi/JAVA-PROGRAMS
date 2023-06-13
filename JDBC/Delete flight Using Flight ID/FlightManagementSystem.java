import java.util.*;
import java.sql.*;
public class FlightManagementSystem{
    public boolean deleteFlight(int flightId)
    {
        try{
            DB db=new DB();
            Connection ct=db.getConnection();
            PreparedStatement st=ct.prepareStatement("delete from flight where flightid="+flightId);
            int s=st.executeUpdate();
            if(s==1)
            return true;
        }catch(Exception e){
            
        }
        return false;
    }
}
