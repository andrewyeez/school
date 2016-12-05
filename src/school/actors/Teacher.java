/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.actors;

/**
 * Teacher has many courses
 * @author andrewyee
 */
public class Teacher extends User{
    String role = "teacher";
    // Using Users constructors
    public Teacher(String _fname, String _lname, String _courseID, String _dob){
        super(_fname,_lname,_dob,_courseID,"teacher");
    }
    public Teacher(){
        super();
    }
    
}
