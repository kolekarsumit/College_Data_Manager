/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codezzzareaa_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Sumit
 */
public class demo {
    public static void main(String args[]) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CodeEraa","Code@123");
		Statement smt=con.createStatement();
		smt.executeUpdate("create table demo2(name varchar(10),age number)");
		System.out.println("Tbale is created ");
		con.close();
	}
	catch(Exception e) {
	System.out.println(e);	
	}
    }
}
