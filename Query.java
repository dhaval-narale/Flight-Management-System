package application;

public class Query 
{
	static String selectQuery="select * from flight;";
	static String deleteQuery="delete from flight where flightId=?;";
	static String updateQuery="update flight set flightfare=? where flightId=?";
	static String createQuery="insert into flight (flightId,source,destination,flightfare) values(?,?,?,?);";
	static String selectById="select * from flight where flightId=?;";
}
