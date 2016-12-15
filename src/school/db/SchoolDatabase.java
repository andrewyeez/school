/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.db;
import java.sql.*;

/**
 * Order of the creation and dropping of tables are important because
 * the tables share are relationship with each other.
 * 
 * @author AndrewPro
 */
public class SchoolDatabase {
    String url = "jdbc:derby://localhost:1527/school";
    String name = "dummy";
    String pw = "password";
    QuerySchoolTable query = new QuerySchoolTable();
    
    public void createAndSeedSchoolTables(){
        createAllSchoolTables();
        seedAllSchoolTables();
    }
    
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
    
    public void seedUserTable(){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (
                Connection con = DriverManager.getConnection(url,name,pw)){
                System.out.println("###############################");
                System.out.println("##   SCHOOL DATABASE TABLE   ##");
                System.out.println("###############################");
                Statement stmt  = con.createStatement();
                System.out.println("##    SEEDING SCHOOL USER    ##");
                System.out.println("##    SCHOOL USER 1          ##");
                stmt.executeUpdate(query.seedSchoolUser1);
                System.out.println("##    SCHOOL USER 2          ##");
                stmt.executeUpdate(query.seedSchoolUser2);
                System.out.println("##    SCHOOL USER 3          ##");
                stmt.executeUpdate(query.seedSchoolUser3);
                System.out.println("###############################");
                System.out.println("##        COMPLETED          ##");
                System.out.println("###############################");
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    
    public void seedTeacherTable(){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (
                Connection con = DriverManager.getConnection(url,name,pw)){
                System.out.println("###############################");
                System.out.println("##   SCHOOL DATABASE TABLE   ##");
                System.out.println("###############################");
                Statement stmt  = con.createStatement();
                System.out.println("##    SEEDING TEACHER        ##");
                System.out.println("##    TEACHER 1              ##");
                stmt.executeUpdate(query.seedTeacher1);
                System.out.println("###############################");
                System.out.println("##        COMPLETED          ##");
                System.out.println("###############################");
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    
    public void seedCourseTable(){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (
                Connection con = DriverManager.getConnection(url,name,pw)){
                System.out.println("###############################");
                System.out.println("##   SCHOOL DATABASE TABLE   ##");
                System.out.println("###############################");
                Statement stmt  = con.createStatement();
                System.out.println("##    SEEDING COURSE         ##");
                System.out.println("##    COURSE 1               ##");
                stmt.executeUpdate(query.seedCourse1);
                System.out.println("###############################");
                System.out.println("##        COMPLETED          ##");
                System.out.println("###############################");
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    
    public void seedStudentTable(){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (
                Connection con = DriverManager.getConnection(url,name,pw)){
                System.out.println("###############################");
                System.out.println("##   SCHOOL DATABASE TABLE   ##");
                System.out.println("###############################");
                Statement stmt  = con.createStatement();
                System.out.println("##    SEEDING STUDENT         ##");
                System.out.println("##    STUDENT 1               ##");
                stmt.executeUpdate(query.seedStudent1);
                System.out.println("##    STUDENT 2               ##");
                stmt.executeUpdate(query.seedStudent2);
                System.out.println("###############################");
                System.out.println("##        COMPLETED          ##");
                System.out.println("###############################");
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    
    public void seedAllSchoolTables(){
        seedUserTable();
        seedTeacherTable();
        seedCourseTable();
        seedStudentTable();
    }
}
