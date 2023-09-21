import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SMS extends JFrame
{
 Container c;
 JLabel labSMS; 
 JButton btnAdd, btnView, btnUpdate, btnDelete;

SMS()
{
 c = getContentPane();
 c.setLayout(null);


labSMS = new JLabel("SMS"); 
btnAdd = new JButton("Add");
btnView = new JButton("View");
btnUpdate = new JButton("Update");
btnDelete = new JButton("Delete");


Font f = new Font("Arial", Font.BOLD, 30);
labSMS.setFont(f);
btnAdd.setFont(f);
btnView.setFont(f);
btnUpdate.setFont(f);
btnDelete.setFont(f);


labSMS.setBounds(320, 30, 300, 40);
btnAdd.setBounds(200, 90, 300, 40);
btnView.setBounds(200, 150, 300, 40);
btnUpdate.setBounds(200, 210, 300, 40);
btnDelete.setBounds(200, 270, 300, 40);

c.add(labSMS);
c.add(btnAdd);
c.add(btnView);
c.add(btnUpdate);
c.add(btnDelete);

ActionListener a1 =(ae)->{
AddStudent s  = new AddStudent();
dispose();
};
btnAdd.addActionListener(a1);

ActionListener a2 =(ae)->{
UpdateStudent u  = new UpdateStudent();
dispose();
};
btnUpdate.addActionListener(a2);

ActionListener a3 =(ae)->{
DeleteStudent u  = new DeleteStudent();
dispose();
};
btnDelete.addActionListener(a3);


setTitle("SMS");
setSize(700, 700);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}


























