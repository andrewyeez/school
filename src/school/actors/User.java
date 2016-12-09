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

    String fname, lname, role;
    
    public User(String _fname, String _lname, String _role){
        fname = _fname;
        lname = _lname;
        role = _role;
    }
    
    public User(){
        fname = "";
        lname = "";
        role = "";
    }
    
    public void setFname(String _fname){ fname = _fname; }
    public void setLname(String _lname){ lname = _lname; }
    public void setRole(String _role){ role = _role; }

    public String getFname(){return fname;}
    public String getLname(){return lname;}
    public String getRole(){ return role; }
 
}