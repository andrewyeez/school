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
public class CreateSchoolTable {
    
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
        "CAN_ENROLL boolean NOT NULL, " +
        "STANDING varchar(10) NOT NULL, " +
        "TEACHER_ID integer, " +
        "SCHOOL_USER_ID integer, " +
        "FOREIGN KEY (SCHOOL_USER_ID) references SCHOOL_USER," +
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

}
