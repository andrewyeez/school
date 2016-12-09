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
    boolean canEnroll;
    String standing;
    int userID;
    
    public Student(){
       canEnroll = false;
       standing = "";
       userID = 0;
    }
    public Student(boolean _canEnroll, String _standing, int _userID){
        canEnroll = _canEnroll;
        standing = _standing;
        userID = _userID;
    }
}
