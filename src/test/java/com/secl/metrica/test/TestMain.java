package com.secl.metrica.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMain {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		
		 	Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	    
	        String url = "jdbc:postgresql://localhost/metrica";
	        String user = "postgres";
	        String password = "secl2013";

	        try {
	        	Class.forName("org.postgresql.Driver");
	            con = DriverManager.getConnection(url, user, password);
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT * from Employee");

	            if (rs.next()) {
	                System.out.println(rs.getString(1));
	            }

	        } catch (SQLException ex) {
	            //Logger lgr = Logger.getLogger(Version.class.getName());
	            //lgr.log(Level.SEVERE, ex.getMessage(), ex);
	        	ex.printStackTrace();

	        } finally {
	            try {
	                if (rs != null) {
	                    rs.close();
	                }
	                if (st != null) {
	                    st.close();
	                }
	                if (con != null) {
	                    con.close();
	                }

	            } catch (SQLException ex) {
	            	ex.printStackTrace();
	            }
	        }

	}

}
