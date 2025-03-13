package application;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FlightManagementSystem 
{
	public static void addFlight(Flight obj) throws SQLException
	{
		Connection con=DB.connect();
		String query=Query.createQuery;
		
		PreparedStatement pstm=con.prepareStatement(query);
		pstm.setInt(1, obj.getFlightId());
		pstm.setString(2,obj.getSource());
		pstm.setString(3,obj.getDestination());
		pstm.setDouble(4,obj.getFlightFare());
		
		int count=pstm.executeUpdate();
		System.out.println(count+" no. of rows added");
		pstm.close();
	}
	
	public static void deleteFlight(int id) throws SQLException
	{
		Connection con=DB.connect();
		String query=Query.deleteQuery;
		
		PreparedStatement pstm=con.prepareStatement(query);
		pstm.setInt(1,id);
		
		int count=pstm.executeUpdate();
		System.out.println(count+" no. of rows deleted");
		pstm.close();
	}
	
	public static void updateFlight(int id,double fare) throws SQLException
	{
		Connection con=DB.connect();
		String query=Query.updateQuery;
		
		PreparedStatement pstm=con.prepareStatement(query);
		pstm.setDouble(1,fare);
		pstm.setInt(2, id);
		
		int count=pstm.executeUpdate();
		System.out.println(count+" no. of rows updated");
		pstm.close();
	}
	
	public static void selectFlightById(int id) throws SQLException
	{
		Connection con=DB.connect();
		String query=Query.selectById;
		
		PreparedStatement pstm=con.prepareStatement(query);
		pstm.setInt(1,id);
		
		ResultSet rs=pstm.executeQuery();
		
		while(rs.next()) 
		{
			System.out.println("flightId="+rs.getInt(1));
			System.out.println("source="+rs.getString(2));
			System.out.println("destination="+rs.getString(3));
			System.out.println("flightFare="+rs.getDouble(4));
		}
		pstm.close();
	}
	
	public static void selectFlight() throws SQLException
	{
		Connection con=DB.connect();
		String query=Query.selectQuery;
		
		PreparedStatement pstm=con.prepareStatement(query);
		
		ResultSet rs=pstm.executeQuery();
		
		
		while(rs.next()) 
		{
			System.out.println("flightId="+rs.getInt(1));
			System.out.println("source="+rs.getString(2));
			System.out.println("destination="+rs.getString(3));
			System.out.println("flightFare="+rs.getDouble(4));
			System.out.println();
		}
		pstm.close();
	}
	
	
}
