import java.awt.BorderLayout;

import javax.swing.*;

public class BorderWala {
	JFrame frame;
	JButton signupButton,cancelButton,submitButton,dekhloButton,mrziButton;
	public BorderWala() {
		frame=new JFrame("My Second Frame");
				
		signupButton=new JButton("SignUp");
		cancelButton=new JButton("Cancel");
		submitButton=new JButton("Submit");
		dekhloButton=new JButton("Dekh Lo");
		mrziButton=new JButton("Mrzi");
		
		frame.add(signupButton,BorderLayout.SOUTH);
		frame.add(cancelButton,BorderLayout.NORTH);
		frame.add(submitButton,BorderLayout.EAST);
		frame.add(mrziButton,BorderLayout.WEST);
		frame.add(dekhloButton,BorderLayout.CENTER);
		
		
		frame.setSize(600,600);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderWala();

	}

}
