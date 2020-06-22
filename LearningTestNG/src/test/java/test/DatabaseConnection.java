package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.*;

public class DatabaseConnection {
	protected Connection con=null;
	protected Statement smt=null;
	protected ResultSet rs=null;

	@BeforeTest
	public void establishConnection() {

		try {
			java.lang.Class.forName(utils.DatabaseUtils.getDriver());
			con=DriverManager.getConnection(DatabaseUtils.getDBurl(),DatabaseUtils.getDBUsername(),DatabaseUtils.getDBPassword());


		} 
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void sqlstatementQuery() {
		try {
			smt=con.createStatement();
			rs=smt.executeQuery("select * from bankfusion.BFTB_USERLOGINNODE");
			while(rs.next()) {
				System.out.println(rs.getString("BFIDPK"));
			} 
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@AfterTest
	public void closeConnection() {

		try {
			if(con!=null)
				con.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}




