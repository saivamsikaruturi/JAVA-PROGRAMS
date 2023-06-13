import java.util.*;
import java.sql.*;
public class FlightManagementSystem
{
    public ArrayList<Flight>
    viewFlightsBySourceDestination(String source,String destination)
    {
        ArrayList<Flight>list=new ArrayList<Flight>();
        try{
            DB db=new DB();
            Connection ct=db.getConnection();
            PreparedStatement st=ct.prepareStatement("select*from flight  where source=? AND destination=?");
            st.setString(1,source);
            st.setString(2,destination);
            ResultSet rs=st.executeQuery();
            Flight f=null;
            while(rs.next())
            {
                int id=rs.getInt(1);
                String s=rs.getString(2);
                String d=rs.getString(3);
                int n=rs.getInt(4);
                double fare=rs.getInt(5);
                f=new Flight(id,s,d,n,fare);
                list.add(f);
            }
            return list;
        }catch (Exception e){
            
        }
        return list;
    }
}