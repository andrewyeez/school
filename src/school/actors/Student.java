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
    public boolean createStudent(){
        int id = number.generateID();
        int user_id = number.generateID();
        if(validateForSchoolUser()){ 
            db.createSchoolUser(user_id, fname, lname, role);
            if(validateForStudent()){ 
                db.createStudent(id, canEnroll, standing, courseID, user_id); }
                return true;
        }else
            System.out.println("Failed Validations");
        return false;
        // failing during creation will result in a SQL error
    }
    public boolean updateStudentFirstName(int _user_id, String _fname){
        if((_user_id > 0) && (_fname.length() > 0)){
            db.getEntryByTableNameAndID(_user_id, "SCHOOL_USER");
            db.updateStudentByID(_user_id, "FIRST_NAME", _fname);
            db.getEntryByTableNameAndID(_user_id, "SCHOOL_USER");
            return true;
        }
        return false;
    }
    public boolean updateStudentLastName(int _user_id, String _lname){
        if((_user_id > 0) && (_lname.length() > 0)){
            db.getEntryByTableNameAndID(_user_id, "SCHOOL_USER");
            db.updateStudentByID(_user_id, "LAST_NAME", _lname);
            db.getEntryByTableNameAndID(_user_id, "SCHOOL_USER");
            return true;
        }
        return false;
    }
    public boolean updateStudentStanding(int _user_id, String _standing){
        if((_user_id > 0) && (_standing.length() > 0)){
            db.getEntryByTableNameAndID(_user_id, "SCHOOL_USER");
            db.updateStudentStandingByID(_user_id, _standing);
            db.getEntryByTableNameAndID(_user_id, "SCHOOL_USER");
            return true;
        }
        return false;
    }
    public boolean enrollStudent(int _user_id, int _course_id_){
        // first grab the the course_id string of the user
        // format should look like: 123,1,314,56
        // comma separated integers
        // create an array of integers from the comma separated integers
        // check if the courseid is already in the array
        // check that there is no more than 5 courses 
        // if not, insert it, if it is then do nothing.
        // create a string that takes in the integers 
        // call the update column method for students and update the
        // course_id column with the 
        return false;
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
