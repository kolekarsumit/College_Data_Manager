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
public class Table_student_ragistration {
   public static void main(String args[]) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","**********","**********");
		Statement smt=con.createStatement();
		smt.executeUpdate("create table **********(name varchar(20),age number,gender varchar(20),phno number(20),code_lang varchar(20),uname varchar(20),pass varchar(20))");
		System.out.println("Tbale is created ");
		con.close();
	}
	catch(Exception e) {
	System.out.println(e);	
	}
} 
}
