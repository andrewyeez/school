/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.actors;

/**
 * Course has one teacher
 * 
 * 
 * @author andrewyee
 */
public class Course {
    String name, description;
    int teacherID;
    
    public Course(){
        name = "";
        description = "";
        teacherID = 0;
    }
    
    public Course(String _name, String _description, int _teacherID){
        name = _name;
        description = _description;
        teacherID = _teacherID;
    }
}
