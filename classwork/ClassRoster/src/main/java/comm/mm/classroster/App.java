/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 07/19/2021
 * purpose: App class for Class Roster project
 */
package comm.mm.classroster;

import com.mm.classroster.controller.ClassRosterController;
import com.mm.classroster.dao.ClassRosterDao;
import com.mm.classroster.dao.ClassRosterDaoFileImpl;
import com.mm.classroster.ui.ClassRosterView;
import com.mm.classroster.ui.UserIO;
import com.mm.classroster.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller = 
                new ClassRosterController(myDao, myView);
        controller.run();
    }   
}
