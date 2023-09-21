import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Signup extends JFrame
{
 Container c;
 JLabel labSignup, labUsername, labPassword, labRepeatPass;
 JTextField txtUsername, txtPassword, txtRepeatPass;
 JButton btnRegister, btnLogin;

Signup()
{
 c = getContentPane();
 c.setLayout(null);


labSignup = new JLabel("SIGNUP"); 
labUsername = new JLabel("Enter UserName");
txtUsername = new JTextField(10);
labPassword = new JLabel("Enter Password");
txtPassword = new JTextField(10);
labRepeatPass = new JLabel("Repeat Password");
txtRepeatPass = new JTextField(10);
btnRegister = new JButton("Register");
btnLogin = new JButton("Login");


Font f = new Font("Arial", Font.BOLD, 30);
labSignup.setFont(f);
labUsername.setFont(f);
txtUsername.setFont(f);
labPassword.setFont(f);
txtPassword.setFont(f);
labRepeatPass.setFont(f);
txtRepeatPass.setFont(f);
btnRegister.setFont(f);
btnLogin.setFont(f);


labSignup.setBounds(300, 30, 300, 40);
labUsername.setBounds(230, 100, 300, 40);
txtUsername.setBounds(200, 140, 300, 40);
labPassword.setBounds(230, 210, 300, 40);
txtPassword.setBounds(200, 250, 300, 40);
labRepeatPass.setBounds(230, 310, 300, 40);
txtRepeatPass.setBounds(200, 350, 300, 40);
btnRegister.setBounds(100, 410, 250, 40);
btnLogin.setBounds(380, 410, 250, 40);

c.add(labSignup);
c.add(labUsername);
c.add(txtUsername);
c.add(labPassword);
c.add(txtPassword);
c.add(labRepeatPass);
c.add(txtRepeatPass);
c.add(btnRegister);
c.add(btnLogin);


setTitle("Register us");
setSize(700, 700);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}


























