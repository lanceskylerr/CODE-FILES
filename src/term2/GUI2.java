package term2;

import javax.swing.*;
import java.awt.FlowLayout;
 
public class GUI2 extends JFrame {
 
	public GUI2() {
		super("Students");
		setLayout(null);
 
		JLabel lblStudID = new JLabel("Student ID");
		lblStudID.setBounds(100, 100, 200, 30);
		add(lblStudID);
 
		JTextField txtStudID = new JTextField(8);
		txtStudID.setBounds(220, 100, 200, 30);
		add(txtStudID);
 
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(100, 135, 200, 30);
		add(lblName);
 
		JTextField txtName = new JTextField(8);
		txtName.setBounds(220, 135, 200, 30);
		add(txtName);
 
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(100, 170, 200, 30);
		add(lblGender);
 
		String[] valCbb = { "Male", "Female" };
		JComboBox cbbGender = new JComboBox(valCbb);
		cbbGender.setBounds(220, 170, 200, 30);
		add(cbbGender);
		
		JTable tblStd = new JTable();
		JScrollPane sp = new JScrollPane();
		sp.setViewportView(tblStd);
		sp.setBounds(100, 205, 350, 280);
		setSize(200,200);
		setVisible(true);
		add (sp);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(100, 500, 100, 30);	
		add(btnSave);
 
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(210, 500, 100, 30);
		add(btnUpdate);
 
		JButton btnView = new JButton("View List");
		btnView.setBounds(320, 500, 100, 30);
		add(btnView);
 
 
 
	}
 
}