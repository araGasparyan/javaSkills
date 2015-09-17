package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import String.MyFrame;

public class Main {
	static final String DATABASE_URL = "jdbc:mysql://172.16.0.5/world";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Connection connection = null; // manages connection
		 Statement statement = null; // query statement
		 ResultSet resultSet = null; // manages results
		
	 // connect to database books and query database
	 try
		 {
		// establish connection to database
		 connection = DriverManager.getConnection(
		 DATABASE_URL, "root", "" );
		 // create Statement for querying database
		 statement = connection.createStatement();
		 // query database
		 resultSet = statement.executeQuery(
		 "SELECT * FROM students" );
		 ResultSetMetaData metaData = resultSet.getMetaData();
		 int numberOfColumns = metaData.getColumnCount();
		 
	
		 // process query results
		
		
	 System.out.println( "Authors Table of Books Database:\n" );
	
		 for ( int i = 1; i <= numberOfColumns; i++ )
		 System.out.printf( "%-8s\t", metaData.getColumnName( i ));
		 System.out.println();
		
		 while(resultSet.next() )
		 {
		 for ( int i = 1; i <= numberOfColumns; i++ )
		 System.out.printf( "%-8s\t",resultSet.getObject( i ) );
		 System.out.println();
		 } // end while
		 } // end try
		 catch( SQLException sqlException)
		 {
		 sqlException.printStackTrace();
		 } // end catch
		 */
		
		DFrame frame = new DFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		
		
		
		
	}
}

		


