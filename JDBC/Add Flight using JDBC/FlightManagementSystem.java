import java.sql.*;
public class FlightManagementSystem
{
    public boolean addFlight(Flight flightObj){
        try{
            DB db=new DB();
            Connection ct=db.getConnection();
            PreparedStatement st=ct.prepareStatement("insert into flight values(?,?,?,?,?)");
            st.setInt(1,flightObj.getFlightId());
            st.setString(2,flightObj.getSource());
            st.setString(3,flightObj.getDestination());
            st.setInt(4,flightObj.getNoOfSeats());
            st.setDouble(5,flightObj.getFlightFare());
            int c=st.executeUpdate();
            if(c==1)
            return true;
            return false;
        }
        catch(Exception e)
        {
    }
    return false;
}
}