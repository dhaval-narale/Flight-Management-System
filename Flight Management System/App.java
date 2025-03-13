package application;

import java.sql.SQLException;
import java.util.Scanner;

public class App 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("               Welcome to Dhaval Flight Services\n");
		int choice;
		do
		{
			System.out.println("\nOptions:\n1.add flight\n2.retrieve flight\n3.update flight\n4.delete flight\n5.display\n6.exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				addFlightFunc(sc);
				break;
			case 2:
				selectFlightFunc(sc);
				break;
			case 3:
				updateFlightFunc(sc);
				break;
			case 4:
				deleteFlightFunc(sc);
				break;
			case 5:
				displayFunc(sc);
				break;
			case 6:
				System.out.println("wrong choice");
				sc.close();
				return;
			}
			
		}while(choice!=6);
		
		
	}
	
	static public void addFlightFunc(Scanner sc)
	{
		System.out.println("enter flight id");
		int flightId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter source city");
		String source=sc.nextLine();
		
		System.out.println("enter destination city");
		String destination=sc.nextLine();
		
		System.out.println("enter flight fare");
		double flightFare=sc.nextDouble();
		
		FlightManagementSystem obj=new FlightManagementSystem();
		
		try 
		{
			obj.addFlight(new Flight(flightId,source,destination,flightFare));
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	static public void selectFlightFunc(Scanner sc)
	{
		System.out.println("enter flight id");
		int flightId=sc.nextInt();
		
		
		FlightManagementSystem obj=new FlightManagementSystem();
		
		try 
		{
			obj.selectFlightById(flightId);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	static public void deleteFlightFunc(Scanner sc)
	{
		System.out.println("enter flight id");
		int flightId=sc.nextInt();
		
		
		FlightManagementSystem obj=new FlightManagementSystem();
		
		try 
		{
			obj.deleteFlight(flightId);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	static public void displayFunc(Scanner sc)
	{
		
		
		
		FlightManagementSystem obj=new FlightManagementSystem();
		
		try 
		{
			obj.selectFlight();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	static public void updateFlightFunc(Scanner sc)
	{
		System.out.println("enter flight id");
		int flightId=sc.nextInt();
		
		System.out.println("enter flight fare");
		double flightFare=sc.nextDouble();
		
		
		FlightManagementSystem obj=new FlightManagementSystem();
		
		try 
		{
			obj.updateFlight(flightId,flightFare);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
