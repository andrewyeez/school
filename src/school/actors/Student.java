/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.actors;

/**
 * Student has many courses
 * Student has one user
 * 
 * @author andrewyee
 */
public class Student extends User{
    boolean canEnroll;
    String standing;
    String courseID;
    int userID;
    
    public Student(){
       canEnroll = false;
       standing = "";
       courseID = "";
       userID = 0;
    }
    public Student(boolean _canEnroll, String _standing, String _courseID,
            int _userID){
        canEnroll = _canEnroll;
        standing = _standing;
        courseID = _courseID;
        userID = _userID;
    }
}
