/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import school.actors.Student;

/**
 *
 * @author andrewyee
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student c = new Student("Andrew","Yee",-1,"");
        System.out.println(c.getFname() + " " + c.getLname() + " is a " + c.getRole());
    }
    
}
