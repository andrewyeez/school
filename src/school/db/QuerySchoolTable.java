/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.db;

/**
 *
 * @author AndrewPro
 */
public class QuerySchoolTable {
    
    String createSchoolUser = 
        "create table " +
        "SCHOOL_USER " +
        "(ID integer NOT NULL, " +
        "FIRST_NAME varchar(40) NOT NULL, " +
        "LAST_NAME varchar(40) NOT NULL, " +
        "ROLE varchar(10) NOT NULL, " +
        "PRIMARY KEY (ID))";
    
    String createTeacher =  
        "create table " +
        "TEACHER " +
        "(ID integer NOT NULL, " +
        "SCHOOL_USER_ID integer, " +
        "DEPARTMENT varchar(40) NOT NULL, " +
        "FOREIGN KEY (SCHOOL_USER_ID) references SCHOOL_USER," +
        "PRIMARY KEY (ID))";
    
    String createCourse =  
        "create table " +
        "COURSE " +
        "(ID integer NOT NULL, " +
        "NAME varchar(40), " +
        "DESCRIPTION varchar(80), " +
        "TEACHER_ID integer NOT NULL, " +
        "FOREIGN KEY (TEACHER_ID) references TEACHER," +
        "PRIMARY KEY (ID))";
    
    String createStudent =  
        "create table " +
        "STUDENT " +
        "(ID integer NOT NULL, " +
        "CAN_ENROLL boolean NOT NULL, " +
        "STANDING varchar(10) NOT NULL, " +
        "COURSE_ID integer, " +
        "SCHOOL_USER_ID integer, " +
        "FOREIGN KEY (COURSE_ID) references COURSE," +
        "FOREIGN KEY (SCHOOL_USER_ID) references SCHOOL_USER," +
        "PRIMARY KEY (ID))";
    
    String dropSchoolUser = "DROP TABLE SCHOOL_USER";
    String dropTeacher = "DROP TABLE TEACHER";
    String dropCourse = "DROP TABLE COURSE";
    String dropStudent = "DROP TABLE STUDENT";

    String seedSchoolUser1 = 
        "INSERT INTO "
        + "SCHOOL_USER "
        + "(ID,FIRST_NAME, LAST_NAME, ROLE) "
        + "VALUES(" 
        + "1,"
        + "'Andrew',"
        + "'Yee',"
        + "'student'"
        + ")";
    String seedSchoolUser2 = 
        "insert into "
        + "SCHOOL_USER "
        + "(ID,FIRST_NAME, LAST_NAME, ROLE) "
        + "VALUES(" 
        + "2,"
        + "'Alexander',"
        + "'Yee',"
        + "'student'"
        + ")";
    String seedSchoolUser3 = 
        "insert into "
        + "SCHOOL_USER "
        + "(ID,FIRST_NAME, LAST_NAME, ROLE) "
        + "VALUES(" 
        + "3,"
        + "'Henry',"
        + "'Yee',"
        + "'teacher'"
        + ")";
    
    String seedTeacher1 = 
       "insert into "
        + "TEACHER "
        + "(ID,SCHOOL_USER_ID, DEPARTMENT) "
        + "VALUES(" 
        + "1,"
        + "3,"
        + "'science'"
        + ")";
    
    String seedCourse1 = 
       "insert into "
        + "COURSE "
        + "(ID, NAME, DESCRIPTION, TEACHER_ID) "
        + "VALUES(" 
        + "1,"
        + "'MATH 1',"
        + "'A very difficult class',"
        + "1"
        + ")";
    
    String seedStudent1 = 
       "insert into "
        + "STUDENT "
        + "(ID, CAN_ENROLL, STANDING, COURSE_ID, SCHOOL_USER_ID) "
        + "VALUES(" 
        + "1,"
        + "true,"
        + "'freshman',"
        + "1,"
        + "1"
        + ")";
    
    String seedStudent2 = 
       "insert into "
        + "STUDENT "
        + "(ID, CAN_ENROLL, STANDING, COURSE_ID, SCHOOL_USER_ID) "
        + "VALUES(" 
        + "2,"
        + "false,"
        + "'senior',"
        + "1,"
        + "2"
        + ")";
}
