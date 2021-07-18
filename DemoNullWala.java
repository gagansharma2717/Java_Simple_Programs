//NULL Layout
import javax.swing.*;
import java.awt.*;
class DemoNullWala
{
	JFrame frame;
	JPanel panel;
	JLabel nameLabel, addressLabel, cityLabel, phoneLabel, passwordLabel;
	JTextField nameText, addressText, cityText, phoneText;
	JPasswordField passwordText;
	JButton submitButton, cancelButton;
	public DemoNullWala()
	{
		frame=new JFrame("Demo Null Layout!");
	
		panel=new JPanel();

		nameLabel=new JLabel("Enter Name : ");
		addressLabel=new JLabel("Enter Address : ");
		cityLabel=new JLabel("Enter City : ");
		phoneLabel=new JLabel("Enter Phone : ");		
		passwordLabel=new JLabel("Enter Password : ");

		nameText=new JTextField(10);
		addressText=new JTextField(10);
		cityText=new JTextField(10);
		phoneText=new JTextField(10);
		
		passwordText=new JPasswordField(10);

		submitButton=new JButton("Submit");
		cancelButton=new JButton("Cancel");

		frame.add(panel);

		panel.setLayout(null);

		nameLabel.setBounds(100, 30, 100, 30);
		nameText.setBounds(210, 30, 100, 30);
		addressLabel.setBounds(100, 70, 100, 30);
		addressText.setBounds(210, 70, 100, 30);
		cityLabel.setBounds(100, 110, 100, 30);
		cityText.setBounds(210, 110, 100, 30);
		phoneLabel.setBounds(100, 150, 100, 30);
		phoneText.setBounds(210, 150, 100, 30);
		passwordLabel.setBounds(100, 190, 100, 30);
		passwordText.setBounds(210, 190, 100, 30);
		submitButton.setBounds(100, 230, 100, 30);
		cancelButton.setBounds(210, 230, 100, 30);

		panel.add(nameLabel);
		panel.add(nameText);
		panel.add(addressLabel);
		panel.add(addressText);
		panel.add(cityLabel);
		panel.add(cityText);
		panel.add(phoneLabel);
		panel.add(phoneText);
		panel.add(passwordLabel);
		panel.add(passwordText);
		panel.add(submitButton);
		panel.add(cancelButton);

		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	public static void main(String arg[])
	{
		DemoNullWala ob=new DemoNullWala();
	}
}





