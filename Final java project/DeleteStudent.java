//gui application

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;




class DeleteStudent extends JFrame
{
 Container c;
 JLabel labRno;
 JTextField txtRno;
 JButton btnDelete, btnBack;

DeleteStudent()
{
 c = getContentPane();
 c.setLayout(new FlowLayout());

 labRno = new JLabel("Rno");
 txtRno = new JTextField(20);
 btnDelete = new JButton("Delete");
 btnBack = new JButton("Back");

 Font f = new Font("Calibri", Font.BOLD, 30);
 labRno.setFont(f);
 txtRno.setFont(f);
 btnDelete.setFont(f); 
 btnBack.setFont(f);  

labRno.setBounds(20, 20, 100, 30);
txtRno.setBounds(120, 20, 200, 30);
btnDelete.setBounds(350, 250, 100, 30);
btnBack.setBounds(350, 270, 200, 30);


 c.add(labRno);  
 c.add(txtRno);
 c.add(btnDelete);
 c.add(btnBack);

setTitle("Update Student");
setSize(700, 700);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

