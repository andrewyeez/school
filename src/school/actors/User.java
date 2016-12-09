/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.actors;

/**
 *
 * @author andrewyee
 */
public class User {
    // public variables fname, lname, courseID
    String fname, lname, role, courseID;
    
    // courseID is a string because it will hold an array of CourseIDs
    
    // by default, the role is a student and an admin has to change the role.
    public User(String _fname, String _lname, String _courseID, String _role){
        fname = _fname;
        lname = _lname;
        courseID = _courseID;
        role = _role;
    }
    
    public User(){
        fname = "";
        lname = "";
        courseID = "";
        role = "";
    }
    
    // setter
    public void setFname(String _fname){ fname = _fname; }
    public void setLname(String _lname){ lname = _lname; }
    public void setCourseID(String _courseID){ courseID = _courseID; }
    public void setRole(String _role){ role = _role; }

    // getter
    public String getFname(){return fname;}
    public String getLname(){return lname;}
    public String getCourseID(){return courseID;}
    public String getRole(){ return role; }
    
    // enroll to a course
    public boolean enroll(int _courseID){
        if(this.courseID.length() > 1){
            this.courseID = this.courseID + "," + _courseID;
            return true;
        }else if(this.courseID.length() == 0){
            this.courseID = Integer.toString(_courseID);
            return true;
        }
        return false;
    }
    
}
