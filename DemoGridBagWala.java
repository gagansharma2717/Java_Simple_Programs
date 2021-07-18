//GridBagLayout Layout
import javax.swing.*;
import java.awt.*;
public class DemoGridBagWala
{
	JFrame frame;
	JPanel panel;
	JLabel nameLabel, addressLabel, cityLabel, phoneLabel, passwordLabel;
	JTextField nameText, addressText, cityText, phoneText;
	JPasswordField passwordText;
	JButton submitButton, cancelButton;
	
	GridBagLayout grid;
	GridBagConstraints gbc;

	public DemoGridBagWala()
	{
		frame=new JFrame("Demo Grid Bag Layout!");
	
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

		grid=new GridBagLayout();
		gbc=new GridBagConstraints();
		
		panel.setLayout(grid);
		
		
		
		frame.add(panel);

		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=0;
		gbc.gridy=0;
		grid.setConstraints(nameLabel, gbc);
		panel.add(nameLabel);
		
		
		gbc.gridx=1;
		gbc.gridy=0;
		grid.setConstraints(nameText, gbc);
		panel.add(nameText);
		

		gbc.gridx=0;
		gbc.gridy=1;
		grid.setConstraints(addressLabel, gbc);
		panel.add(addressLabel);
		


		//gbc.anchor=GridBagConstraints.SOUTHEAST;
		gbc.gridx=1;
		gbc.gridy=1;
		grid.setConstraints(addressText, gbc);
		panel.add(addressText);

		gbc.gridx=0;
		gbc.gridy=2;
		grid.setConstraints(cityLabel, gbc);
		panel.add(cityLabel);

		gbc.gridx=1;
		gbc.gridy=2;
		grid.setConstraints(cityText, gbc);
		panel.add(cityText);

		gbc.gridx=0;
		gbc.gridy=3;
		grid.setConstraints(phoneLabel, gbc);
		panel.add(phoneLabel);

		gbc.gridx=1;
		gbc.gridy=3;
		grid.setConstraints(phoneText, gbc);
		panel.add(phoneText);

		gbc.gridx=0;
		gbc.gridy=4;
		grid.setConstraints(passwordLabel, gbc);
		panel.add(passwordLabel);

		gbc.gridx=1;
		gbc.gridy=4;
		grid.setConstraints(passwordText, gbc);
		panel.add(passwordText);

		gbc.gridx=0;
		gbc.gridy=5;
		grid.setConstraints(submitButton, gbc);
		panel.add(submitButton);

		gbc.gridx=1;
		gbc.gridy=5;
		grid.setConstraints(cancelButton, gbc);
		panel.add(cancelButton);

		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	public static void main(String arg[])
	{
		DemoGridBagWala ob=new DemoGridBagWala();
	}
}





