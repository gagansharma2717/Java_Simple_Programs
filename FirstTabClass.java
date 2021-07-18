import javax.swing.*;

public class FirstTabClass 
{
	JPanel panel;
	JLabel nameLabel, addressLabel, cityLabel, phoneLabel;
	JTextField nameText, addressText, cityText, phoneText;
	JButton submitButton, cancelButton;
	public FirstTabClass()
	{
		panel=new JPanel();

		nameLabel=new JLabel("Enter Name : ");
		addressLabel=new JLabel("Enter Address : ");
		cityLabel=new JLabel("Enter City : ");
		phoneLabel=new JLabel("Enter Phone : ");
		
		nameText=new JTextField(10);
		addressText=new JTextField(10);
		cityText=new JTextField(10);
		phoneText=new JTextField(10);
	
		submitButton=new JButton("Submit");
		cancelButton=new JButton("Cancel");

		panel.add(nameLabel);
		panel.add(nameText);
		panel.add(addressLabel);
		panel.add(addressText);
		panel.add(cityLabel);
		panel.add(cityText);
		panel.add(phoneLabel);
		panel.add(phoneText);
		
		panel.add(submitButton);
		panel.add(cancelButton);
		
		
		
	}
	public JPanel getTab()
	{
		return panel;
	}
	
}
