package term2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class GUIMENU extends JFrame {
 
	JMenuBar menubar = new JMenuBar();
	JMenu file = new JMenu("File");
 
	JMenuItem frmStudentsMenu = new JMenuItem("Students");
 
	JMenuItem frmCourse = new JMenuItem("Course");
 
	JMenuItem exit = new JMenuItem("Exit");
	event click = new event();
	callGUI2 clickStudents = new callGUI2();
 
	JMenu trans = new JMenu("Transaction");
	JMenuItem payment = new JMenuItem("Assessment");
 
	public GUIMENU() {
 
		super("SKY INFORMATION SYSTEM");
		setLayout(new FlowLayout());
 
		setJMenuBar(menubar);
 
		file.setMnemonic('F');
		menubar.add(file);
 
		frmStudentsMenu.setMnemonic('S');
		file.add(frmStudentsMenu);
 
		frmCourse.setMnemonic('C');
		file.add(frmCourse);
 
		exit.setMnemonic('X');
		file.add(exit);
 
		frmStudentsMenu.addActionListener(clickStudents);
		exit.addActionListener(click);
	}
 
	public class callGUI2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GUI2 gui2 = new GUI2();
			gui2.setSize(600, 400);
			gui2.setVisible(true);
		}
	}
 
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String messageBox = "Are you sure you want your close the application?";
			int ans = JOptionPane.showConfirmDialog(null, messageBox, "Exit", JOptionPane.YES_NO_OPTION);
			if (ans == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
		}
	}
 
}
 