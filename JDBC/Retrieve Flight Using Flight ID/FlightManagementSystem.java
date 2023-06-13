import java.sql.*;
public class FlightManagementSystem{
    public Flight viewFlightById(int flightId)
    {
        try{
            DB db=new DB();
            Flight f=null;
            Connection ct=db.getConnection();
            PreparedStatement st=ct.prepareStatement("select*from flight where flightId="+flightId);
            ResultSet rs=st.executeQuery();
            while(rs.next())
            {
                int id=rs.getInt(1);
                String source=rs.getString(2);
                String destination=rs.getString(3);
                int no=rs.getInt(4);
                double fare=rs.getDouble(5);
                f=new Flight(id,source,destination ,no,fare);
                
            }
            return f;
        }catch(Exception e){
            
        }
        return null;
    }
}