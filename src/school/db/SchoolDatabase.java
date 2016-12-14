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
    CreateSchoolTable query = new CreateSchoolTable();
    
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
        String setF = "DISABLE KEYS";
        String school_user = "DROP TABLE SCHOOL_USER";
        String teacher = "DROP TABLE TEACHER";
        String course = "DROP TABLE COURSE";
        String student = "DROP TABLE STUDENT";
        String setT = "SET FOREIGN_KEY_CHECKS=1";
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (
                Connection con = DriverManager.getConnection(url,name,pw)){
                System.out.println("###############################");
                System.out.println("##   SCHOOL DATABASE TABLE   ##");
                System.out.println("###############################");
                Statement stmt  = con.createStatement();
                System.out.println("##    DROPPING ALL TABLE     ##");
                stmt.executeUpdate(setF);
                stmt.executeUpdate(school_user);
                stmt.executeUpdate(teacher);
                stmt.executeUpdate(course);
                stmt.executeUpdate(student);
                stmt.executeUpdate(setT);
                System.out.println("###############################");
                System.out.println("##        COMPLETED          ##");
                System.out.println("###############################");
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }  
    }
}
