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
       Student st = new Student();
        st.findStudentByLastName("Yee");
       // st.updateStudentFirstName(2, "Alexander");
    }
    
}
