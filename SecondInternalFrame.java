import javax.swing.*;
public class SecondInternalFrame extends JInternalFrame{

	JPanel panel;
	JLabel nameLabel,  phoneLabel;
	JTextField nameText, phoneText;
	JButton submitButton;
	public SecondInternalFrame()
	{
		panel=new JPanel();

		nameLabel=new JLabel("Enter Name : ");
		phoneLabel=new JLabel("Enter Phone : ");
		
		nameText=new JTextField(10);
		phoneText=new JTextField(10);
	
		submitButton=new JButton("Submit");

		panel.add(nameLabel);
		panel.add(nameText);
		panel.add(phoneLabel);
		panel.add(phoneText);
		
		panel.add(submitButton);
		
		
		add(panel);
		
		setSize(300,300);
		setMaximizable(true);
		setClosable(true);
		setVisible(true);
	}
	
}
