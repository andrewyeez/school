/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.actors;

/**
 * Teacher has many courses  
 * Teacher is just a child of User
 * Im not sure if there should only be 1 table for User/Teacher/Student
 * 
 * @author andrewyee
 */
public class Teacher extends SchoolUser{
    String department;
    int userID;
    
    public Teacher(){
      department = "";
      userID = 0;
    }
    
    public Teacher(String _department, int _userID){
        department = _department;
        userID = _userID;
    }
    
}
