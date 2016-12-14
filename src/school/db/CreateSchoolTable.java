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
    String createTeacher = "create table school" +
                            ".TEACHER " +
                            "(ID integer NOT NULL, " +
                            "USER_ID integer NOT NULL, " +
                            "DEPARTMENT varchar(40) NOT NULL, " +
                            "FOREIGN KEY (USER_ID) references USER," +
                            "PRIMARY KEY (ID))";
    
    String createUser   =  "create table school" +
                           ".SCHOOLUSER " +
                           "(ID integer NOT NULL, " +
                           "FIRST_NAME varchar(40) NOT NULL, " +
                           "LAST_NAME varchar(40) NOT NULL, " +
                           "ROLE varchar(10) NOT NULL, " +
                           "PRIMARY KEY (ID))";
    
    String createStudent = "create table school" +
                           ".STUDENT " +
                           "(ID integer NOT NULL, " +
                           "CAN_ENROLL boolean NOT NULL, " +
                           "STANDING varchar(10) NOT NULL, " +
                           "COURSE_ID integer, " +
                           "USER_ID integer NOT NULL, " +
                           "FOREIGN KEY (COURSE_ID) references COURSE," +
                           "FOREIGN KEY (USER_ID) references USER," +
                           "PRIMARY KEY (ID))";
    
    String createCourse =  "create table school" +
                           ".COURSE " +
                           "(ID integer NOT NULL, " +
                           "CAN_ENROLL boolean NOT NULL, " +
                           "STANDING varchar(10) NOT NULL, " +
                           "TEACHER_ID integer, " +
                           "USER_ID integer NOT NULL, " +
                           "FOREIGN KEY (USER_ID) references USER," +
                           "FOREIGN KEY (TEACHER_ID) references TEACHER," +
                           "PRIMARY KEY (ID))";
}
