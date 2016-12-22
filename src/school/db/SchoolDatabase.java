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
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }  
    }
    public void deleteEntryByTableID(int _id, String tableName){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeUpdate("DELETE FROM"
                                + "DUMMY." + tableName
                                + " WHERE ID = " + _id);
                System.out.println("Deleted "+  tableName + " w/ ID: " + _id);
                stmt.close();
                con.close();
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
                stmt.close();
                con.close();
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
                stmt.close();
                con.close();
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
                stmt.close();
                con.close();
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
                System.out.println("##    SEEDING STUDENT        ##");
                System.out.println("##    STUDENT 1              ##");
                stmt.executeUpdate(query.seedStudent1);
                System.out.println("##    STUDENT 2              ##");
                stmt.executeUpdate(query.seedStudent2);
                System.out.println("###############################");
                System.out.println("##        COMPLETED          ##");
                System.out.println("###############################");
                stmt.close();
                con.close();
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
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    public void createSchoolUser(int _id, String _fname, String _lname, String _role){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeQuery("INSERT INTO "
                                + "DUMMY.SCHOOL_USER "
                                + "(ID,FIRST_NAME, LAST_NAME, ROLE) "
                                + "VALUES(" 
                                + " "+_id+","
                                + "'"+_fname+"',"
                                + "'"+_lname+"',"
                                + "'"+_role+"'"
                                + ")");
                System.out.println("Created School User w/ ID: " + _id);
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    public void createStudent(int _id, boolean _can_enroll, String _standing, String _course_id, int _school_user_id){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeQuery("INSERT INTO "
                                + "DUMMY.STUDENT "
                                + "(ID, CAN_ENROLL, STANDING, COURSE_ID, SCHOOL_USER_ID) "
                                + "VALUES(" 
                                + " "+_id+","
                                + ""+_can_enroll+","
                                + "'"+_standing+"',"
                                + "'"+_course_id+"',"
                                + ""+_school_user_id+""
                                + ")");
                System.out.println("Created Student w/ ID: " + _id);
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    public void createCourse(int _id, String _name, String _description, int _teacher_id){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeQuery("INSERT INTO "
                                + "DUMMY.COURSE "
                                + "(ID, NAME, DESCRIPTION, TEACHER_ID) "
                                + "VALUES(" 
                                + " "+_id+","
                                + "'"+_name+"',"
                                + "'"+_description+"',"        
                                + ""+_teacher_id+""
                                + ")");
                System.out.println("Created Course w/ ID: " + _id);
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    public void createTeacher(int _id, int _school_user_id, String _department){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeQuery("INSERT INTO "
                                + "DUMMY.TEACHER "
                                + "(ID, SCHOOL_USER_ID, DEPARTMENT) "
                                + "VALUES(" 
                                + " "+_id+","
                                + ""+_school_user_id+","
                                + "'"+_department+"'"
                                + ")");
                System.out.println("Created Teacher w/ ID: " + _id);
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }

    public void updateSchoolUserByID(int _id, String columnName, String updatedValue){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeUpdate("UPDATE "
                                + "DUMMY.SCHOOL_USER SET "
                                + columnName +" = '" + updatedValue + "' "
                                + "WHERE ID = " + _id);
                System.out.println("Updated School User w/ ID: " + _id);
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    public void updateTeacherByID(int _id, String columnName, String updateValue){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeUpdate("UPDATE "
                                + "DUMMY.TEACHER SET "
                                + columnName + " = " + updateValue + " "
                                + "WHERE ID = " + _id);
                System.out.println("Updated Teacher w/ ID: " + _id);
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    public void updateCourseByID(int _id, String columnName, int updateValue){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeUpdate("UPDATE "
                                + "DUMMY.COURSE SET "
                                + " " + columnName + " = " + updateValue + " "
                                + "WHERE ID = " + _id);
                System.out.println("Updated Course w/ ID: " + _id);
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    public void updateCourseByID(int _id, String columnName, String updateValue){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeUpdate("UPDATE "
                                + "DUMMY.COURSE SET "
                                + " " + columnName + " = '" + updateValue + "' "
                                + "WHERE ID = " + _id);
                System.out.println("Updated Course w/ ID: " + _id);
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    public void updateStudentByID(int _school_user_id, String columnName, String updatedValue){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeUpdate("UPDATE "
                                + "DUMMY.SCHOOL_USER SET "
                                + columnName +" = '" + updatedValue + "' "
                                + "WHERE ID = " + _school_user_id);
                System.out.println("Updated Student w/ ID: " + _school_user_id);
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    public void updateStudentByID(int _school_user_id, String columnName, boolean updatedValue){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeUpdate("UPDATE "
                                + "DUMMY.STUDENT SET "
                                + columnName +" = " + updatedValue + " "
                                + "WHERE SCHOOL_USER_ID = " + _school_user_id);
                System.out.println("Updated Student w/ SCHOOL_USER_ID: " + _school_user_id);
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    public void updateStudentByID(int _school_user_id, String columnName, int updatedValue){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                stmt.executeUpdate("UPDATE "
                                + "DUMMY.STUDENT SET "
                                + columnName +" = " + updatedValue + " "
                                + "WHERE SCHOOL_USER_ID = " + _school_user_id);
                System.out.println("Updated Student w/ ID: " + _school_user_id);
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    
    public void getAllByTableName(String tableName){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM "
                                + "DUMMY." + tableName);
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCount = rsmd.getColumnCount();
                while (rs.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        if (i > 1) System.out.println("");
                        String columnValue = rs.getString(i);
                        System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
                    }
                        System.out.println("");  
                    }
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    public void getEntryByTableNameAndID(int _id, String tableName){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM "
                                + "DUMMY." + tableName
                                + " WHERE ID = "
                                +_id);
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCount = rsmd.getColumnCount();
                while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    if (i > 1) System.out.println("");
                    String columnValue = rs.getString(i);
                    System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
                }
                    System.out.println("");  
                }
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
    
    public void getStudentByLastName(String _lname){
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            try (Connection con = DriverManager.getConnection(url,name,pw)){
                Statement stmt  = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM "
                                + "DUMMY.SCHOOL_USER"
                                + " WHERE LAST_NAME = "
                                + "'" + _lname + "'");
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCount = rsmd.getColumnCount();
                while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    if (i > 1) System.out.println("");
                    String columnValue = rs.getString(i);
                    System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
                }
                    System.out.println("");  
                }
                stmt.close();
                con.close();
            }
        }catch(ClassNotFoundException | SQLException e){ 
                System.out.println(e);
        }
    }
}