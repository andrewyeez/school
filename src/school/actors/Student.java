/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.actors;
import school.db.SchoolDatabase;
import school.helpers.MakeNumber;
/**
 * Student has many courses
 * Student has one user
 * 
 * @author andrewyee
 */
public class Student extends SchoolUser{
    SchoolDatabase db = new SchoolDatabase();
    MakeNumber number = new MakeNumber();
    boolean canEnroll = true;
    String courseID = "";
    String standing;
    
    public Student(){
        super("Enter", "Name", "");
        standing = "";
    }
    
    public Student(String _fname, String _lname, String _standing){
        super(_fname,_lname, "student");
        standing = _standing;
    }
    
    // Create a Student
    // assume that the user used the constructor Student(w/ params) 
    // use the available variables to fill the info
    // do some validations before attempting to create
    public boolean newStudent(){
        int id = number.generateID();
        int user_id = number.generateID();
        if(validateForSchoolUser()){ db.createSchoolUser(user_id, fname, lname, role); }
        if(validateForStudent()){ db.createStudent(id, canEnroll, standing, courseID, user_id); }
        return true;
        // failing during creation will result in a SQL error
    }
    
    public void findStudentByLastName(String _lname){
        db.getStudentByLastName(_lname);
    }
    
    public boolean validateForSchoolUser(){
        boolean fnameIsPresent = fname.length() > 0;
        boolean lnameIsPresent = lname.length() > 0;
        boolean roleIsPresent = role.length() > 0;
        return fnameIsPresent && lnameIsPresent && roleIsPresent;
    }
    
    public boolean validateForStudent(){
        boolean canEnrollIsPresent = canEnroll;
        boolean standingIsPresent = standing.length() > 0;
        boolean courseIdIsPresent = courseID.length() > 0;
        return canEnrollIsPresent && standingIsPresent && courseIdIsPresent;
    }

}
