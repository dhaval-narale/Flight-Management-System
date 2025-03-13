package application;


public class Flight 
{
	
	private int flightId;
	private String source;
	private String destination;
	private double flightFare;
	
	
	public int getFlightId() 
	{
		return flightId;
	}
	public void setFlightId(int flightId) 
	{
		this.flightId = flightId;
	}
	
	
	public String getSource() 
	{
		return source;
	}
	public void setSource(String source) 
	{
		this.source = source;
	}
	
	
	public String getDestination() 
	{
		return destination;
	}
	public void setDestination(String destination) 
	{
		this.destination = destination;
	}
	
	
	
	public double getFlightFare() 
	{
		return flightFare;
	}
	public void setFlightFare(double flightFare) 
	{
		this.flightFare = flightFare;
	}
	
	
	public Flight(int flightId, String source, String destination, double flightFare) 
	{
		super();
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.flightFare = flightFare;
	}

	public String toString()
	{
		return "Flight [flightId="+flightId+" source="+source+" destination="+destination+" fare="+flightFare+"]";
	}

}
