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
    QuerySchoolTable query = new QuerySchoolTable();
    
    public void createAllSchoolTables(){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (
                Connection con = DriverManager.getConnection(url,name,pw)){
                System.out.println("###############################");
                System.out.println("##   SCHOOL DATABASE TABLE   ##");
                System.out.println("###############################");
                Statement stmt  = con.createStatement();
                System.out.println("##    CREATING SCHOOL USER   ##");
                stmt.executeUpdate(query.createSchoolUser);
                System.out.println("##    CREATING TEACHER       ##");
                stmt.executeUpdate(query.createTeacher);
                System.out.println("##    CREATING COURSE        ##");
                stmt.executeUpdate(query.createCourse);
                System.out.println("##    CREATING STUDENT       ##");
                stmt.executeUpdate(query.createStudent);
                System.out.println("###############################");
                System.out.println("##        COMPLETED          ##");
                System.out.println("###############################");
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }  
    }
    
    public void dropAllSchoolTables(){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (
                Connection con = DriverManager.getConnection(url,name,pw)){
                System.out.println("###############################");
                System.out.println("##   SCHOOL DATABASE TABLE   ##");
                System.out.println("###############################");
                Statement stmt  = con.createStatement();
                System.out.println("##    DROPPING STUDENT       ##");
                stmt.executeUpdate(query.dropStudent);
                System.out.println("##    DROPPING COURSE        ##");
                stmt.executeUpdate(query.dropCourse);
                System.out.println("##    DROPPING TEACHER       ##");
                stmt.executeUpdate(query.dropTeacher);
                System.out.println("##    DROPPING SCHOOL USER   ##");
                stmt.executeUpdate(query.dropSchoolUser);
                System.out.println("###############################");
                System.out.println("##        COMPLETED          ##");
                System.out.println("###############################");
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }  
    }
}
