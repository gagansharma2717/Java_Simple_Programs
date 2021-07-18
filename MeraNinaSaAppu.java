//<applet code="MeraNinaSaAppu.class" height="200" width="250"></applet>
import javax.swing.*;
import java.awt.*;
	
public class MeraNinaSaAppu extends JApplet
{
	JPanel panel;
	JLabel userNameLabel, passwordLabel;
	JTextField userNameText;
	JPasswordField passwordText;
	JButton loginButton;
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawLine(100,100,200,200);
	}
	public void init()
	{
		panel=new JPanel();
		userNameLabel=new JLabel("Enter Username : ");
		passwordLabel=new JLabel("Enter Password : ");

		userNameText=new JTextField(10);
		passwordText=new JPasswordField(10);

		loginButton=new JButton("Login");

		panel.add(userNameLabel);
		panel.add(userNameText);		
		panel.add(passwordLabel);
		panel.add(passwordText);		
	
		panel.add(loginButton);
		
		add(panel);
	}
}