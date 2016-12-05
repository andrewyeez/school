/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.actors;

/**
 * Student has many courses
 * @author andrewyee
 */
public class Student extends User{
    String role = "student";
    // Using Users constructors
    public Student(String _fname, String _lname, String _courseID, String _dob){
        super(_fname,_lname,_dob,_courseID, "student");
    }
    public Student(){
        super();
    }

}
