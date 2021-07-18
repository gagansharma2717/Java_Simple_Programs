//Multiple Panels
import javax.swing.*;
import java.awt.*;
public class DemoMultiPanels
{
	JFrame frame;
	JPanel panel, mainPanel, topPanel, bottomPanel;
	JLabel headingLabel, nameLabel, addressLabel, cityLabel, phoneLabel, passwordLabel;
	JTextField nameText, addressText, cityText, phoneText;
	JPasswordField passwordText;
	JButton submitButton, cancelButton;

	Font headingFont, labelFont, textFont;
	
	FlowLayout flow;
	
	BorderLayout border;
	
	GridBagLayout grid;
	GridBagConstraints gbc;

	public DemoMultiPanels()
	{
		frame=new JFrame("Demo Multi Panels!");

		mainPanel=new JPanel();
		panel=new JPanel();
		topPanel=new JPanel();
		bottomPanel=new JPanel();

		headingLabel=new JLabel("Registration Form!");
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

		headingFont=new Font("Curlz MT", Font.BOLD+Font.ITALIC, 30);
		labelFont=new Font("Calibri", Font.BOLD, 25);
		textFont=new Font("Tahoma", Font.ITALIC, 25);
		
		flow=new FlowLayout(FlowLayout.LEFT);
		
		border=new BorderLayout();
		
		grid=new GridBagLayout();
		gbc=new GridBagConstraints();
		

		
		frame.add(mainPanel);
		
		mainPanel.setLayout(border);

		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
		mainPanel.add(panel, BorderLayout.CENTER);
		
		topPanel.setLayout(flow);
		
		topPanel.add(headingLabel);
				
		panel.setLayout(grid);
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

		bottomPanel.add(submitButton);
		bottomPanel.add(cancelButton);

		headingLabel.setFont(headingFont);

		nameLabel.setFont(labelFont);
		addressLabel.setFont(labelFont);
		cityLabel.setFont(labelFont);
		phoneLabel.setFont(labelFont);
		passwordLabel.setFont(labelFont);

		nameText.setFont(textFont);
		addressText.setFont(textFont);
		cityText.setFont(textFont);
		phoneText.setFont(textFont);

		submitButton.setFont(labelFont);
		cancelButton.setFont(labelFont);

		topPanel.setBackground(Color.blue);
		panel.setBackground(Color.white);
		bottomPanel.setBackground(Color.red);

		headingLabel.setForeground(Color.white);
		nameLabel.setForeground(Color.blue);
		addressLabel.setForeground(Color.blue);
		cityLabel.setForeground(Color.blue);
		phoneLabel.setForeground(Color.blue);
		passwordLabel.setForeground(Color.blue);
		
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	public static void main(String arg[])
	{
		DemoMultiPanels ob=new DemoMultiPanels();
	}
}





