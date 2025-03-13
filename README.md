# Flight-Management-System
Overview
The Flight Management System is a Java-based application that allows users to manage flight details, including adding, retrieving, updating, and deleting flights. The system interacts with a MySQL database for data storage.

Features
✅ Add new flight details
✅ Retrieve flight information by ID
✅ Update flight fare
✅ Delete flight records
✅ Display all available flights

Technologies Used
Programming Language: Java
Database: MySQL
Libraries: JDBC

Flight-Management-System/
│── App.java                        # Main application (User interaction)
│── Flight.java                      # Flight entity class
│── FlightManagementSystem.java      # Business logic for flight operations
│── DB.java                          # Database connection handling
│── Query.java                       # SQL Queries
│── README.md                        # Project documentation


Installation & Setup
1. Clone the Repository
git clone https://github.com/dhaval-narale/Flight-Management-System.git
cd Flight-Management-System

2. Set Up the Database
Create a MySQL database named codingwallah.
Use the following SQL script to create the flight table:
CREATE TABLE flight (
    flightId INT PRIMARY KEY,
    source VARCHAR(50),
    destination VARCHAR(50),
    flightfare DOUBLE
);

Update DB.java with your MySQL username and password.



