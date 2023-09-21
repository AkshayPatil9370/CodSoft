//gui application

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;




class AddStudent extends JFrame
{
 Container c;
 JLabel labRno, labName, labMarks;
 JTextField txtRno, txtName, txtMarks;
 JButton btnSave, btnBack;

AddStudent()
{
 c = getContentPane();
 c.setLayout(new FlowLayout());

 labRno = new JLabel("Rno");
 labName = new JLabel("Name");
 labMarks = new JLabel("Marks");
 txtRno = new JTextField(20);
 txtName = new JTextField(20);
 txtMarks = new JTextField(20);
 btnSave = new JButton("Save");
 btnBack = new JButton("Back");

 Font f = new Font("Calibri", Font.BOLD, 30);
 labRno.setFont(f);
 labName.setFont(f);
 labMarks.setFont(f);
 txtRno.setFont(f);
 txtName.setFont(f);
 txtMarks.setFont(f);
 btnSave.setFont(f); 
 btnBack.setFont(f);  

labRno.setBounds(20, 20, 100, 30);
txtRno.setBounds(120, 20, 200, 30);
labName.setBounds(20, 60, 100, 30);
txtName.setBounds(120, 60, 200, 30);
labMarks.setBounds(20, 100, 100, 30);
txtMarks.setBounds(120, 100, 200, 30);
btnSave.setBounds(350, 200, 100, 30);
btnBack.setBounds(350, 250, 200, 30);


 c.add(labRno); 
 c.add(labName);  
 c.add(txtRno);
 c.add(txtName);
 c.add(txtMarks);
 c.add(labMarks);
 c.add(btnSave);
 c.add(btnBack);

setTitle("Add Student");
setSize(700, 700);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

