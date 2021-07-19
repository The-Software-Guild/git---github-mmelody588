/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/19/2021
 * purpose: App class for Class Roster project
 */
package comm.mm.classroster;

import com.mm.classroster.controller.ClassRosterController;

public class App {
    public static void main(String[] args) {
        ClassRosterController controller = new ClassRosterController();
        controller.run();
    }   
}
