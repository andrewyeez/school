/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.db;
import java.sql.*;

/**
 * This class will be the main DB file for CRUD
 * 
 * @author AndrewPro
 */
public class SchoolDatabase {
    String url = "jdbc:derby://localhost:1527/school";
    String name = "dummy";
    String pw = "password";
    public void connect(){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)) {
                String mySqlQuery = "";
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(mySqlQuery);
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }  
    }  
}
