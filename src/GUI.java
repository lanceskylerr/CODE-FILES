import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame{

    public GUI(){

        super("Sky Information System");
       // setLayout(new FlowLayout());

        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu file = new JMenu("File");
        menubar.add(file);
        

        JMenuItem frmStudents = new JMenuItem("Students");
        file.add(frmStudents);

        JMenuItem frmCourse = new JMenuItem("Course");
        file.add(frmCourse);

        JMenuItem frmExit = new JMenuItem("Exit");
        file.add (frmExit);




    }
}


