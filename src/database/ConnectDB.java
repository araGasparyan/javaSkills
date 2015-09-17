package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectDB {
 
	Connection connection = null; 
	 Statement statement = null; 
	 ResultSet resultSet = null; 
	 private String columns[];
	 private Object data[][];
	 public ConnectDB() {
		 
		 try {
			connection = DriverManager.getConnection(
					 "jdbc:mysql://172.16.0.5/world", "admin", "ZtZc9J" );
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 try {
			resultSet = statement.executeQuery(
					 "SELECT * FROM city" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 try {
			ResultSetMetaData metaData = resultSet.getMetaData();
			columns=new String[metaData.getColumnCount()];
			for ( int i = 0; i <metaData.getColumnCount(); i++ ){
				columns[i]=metaData.getColumnName( i+1 );
				System.out.printf( "%-8s\t", columns[i]);}
			System.out.println();
			 int count=0;
			while(resultSet.next() )
			 {
				count++;
			 /*
				 for ( int i = 0; i < resultSet.getr; i++ ){
				 data[i][i]=resultSet.getObject( i+1 );
				 */
			 }
			data=new Object[count][metaData.getColumnCount()];
			resultSet.first();
			int row=0;
			do
			 {
				
				for ( int j = 1; j <=metaData.getColumnCount() ; j++ ){
					data[row][j-1]=resultSet.getObject(j);
					System.out.printf( "%-8s\t", data[row][j-1]);
					
				}
				row++;
				
				System.out.println();
			 }while(resultSet.next() );
			 
			
			
			
			 
			}
		 
		 	 
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		
		 
	}
	 
	public String[] getColumns() {
		return columns;
	}
	
	public Object[][] getData() {
		return data;
	}

	public void insert(String str1, String str2, int date, int pay){
		try {
			statement.executeUpdate(
					 "insert into students values (null," + "'" +str1+ "','" +str2+ "','" +date+ "'," + pay+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}

		

