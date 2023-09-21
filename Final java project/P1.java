//gui application

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Login extends JFrame
{
 Container c;
 JLabel labLogin, labUsername, labPassword;
 JTextField txtUsername, txtPassword;
 JButton btnLogin, btnSignup;


Login()
{
 c = getContentPane();
 c.setLayout(null);

labLogin = new JLabel("LOGIN");
labUsername = new JLabel("Enter UserName");
txtUsername = new JTextField(10);
labPassword = new JLabel("Enter Password");
txtPassword = new JTextField(10);
btnLogin = new JButton("Login");
btnSignup = new JButton("SignUp");


Font f = new Font("Arial", Font.BOLD, 30);
labLogin.setFont(f);
labUsername.setFont(f);
txtUsername.setFont(f);
labPassword.setFont(f); 
txtPassword.setFont(f); 
btnLogin.setFont(f); 
btnSignup.setFont(f); 

labLogin.setBounds(300, 30, 300, 40);
labUsername.setBounds(230, 100, 300,40);
txtUsername.setBounds(200, 140, 300,40); 
labPassword.setBounds(230, 190, 300,40); 
txtPassword.setBounds(200, 230, 300,40); 
btnLogin.setBounds(100, 300, 250,40);
btnSignup.setBounds(380, 300, 250,40); 

c.add(labLogin);
c.add(labUsername);
c.add(txtUsername);
c.add(labPassword); 
c.add(txtPassword); 
c.add(btnLogin);
c.add(btnSignup); 


ActionListener a1 =(ae)->{
Signup s  = new Signup();
dispose();
};
btnSignup.addActionListener(a1);

ActionListener a2 =(ae)->{
SMS m = new SMS();
dispose();
};
btnLogin.addActionListener(a2);

setTitle("app by akshay");
setSize(700, 700);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}



class P1
{
 public static void main(String args[])
{
 Login l = new Login();
}
}








