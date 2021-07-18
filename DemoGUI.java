import java.awt.*;
import javax.swing.*;
public class DemoGUI
{
	JFrame frame;
	JButton submitButton,cancelButton;
	JPanel panel;
	JTextField nameText,addressText,contactText,emailText;
	JLabel nameLabel,contactLabel,addressLabel,passwordLabel,genderLabel,emailLabel,countryLabel,languageLabel;
	JPasswordField passwordField;
	JRadioButton maleRadio,femaleRadio,othersRadio;
	ButtonGroup radioButtongroup;
	JComboBox countryCombobox;
	JCheckBox cCheckbox,caCheckbox,javaCheckbox;
	public DemoGUI() 
	{
		frame=new JFrame("My First Frame");
		panel=new JPanel(); 
		panel.setBounds(40,80,200,200);        
		frame.add(panel);
		nameLabel=new JLabel("Name");
		panel.add(nameLabel);
		nameText=new JTextField(10);
		panel.add(nameText);
		addressLabel=new JLabel("Address");
		panel.add(addressLabel);
		addressText=new JTextField(10);
		panel.add(addressText);
		contactLabel=new JLabel("Contact");
		panel.add(contactLabel);
		contactText=new JTextField(10);
		panel.add(contactText);
		genderLabel=new JLabel("Gender");
		panel.add(genderLabel);
		radioButtongroup=new ButtonGroup();
		maleRadio=new JRadioButton("A) Male");
		radioButtongroup.add(maleRadio);
		panel.add(maleRadio);
		femaleRadio=new JRadioButton("B) Female");
		radioButtongroup.add(femaleRadio);
		panel.add(femaleRadio);
		othersRadio=new JRadioButton("C) Others");
		radioButtongroup.add(othersRadio);
		panel.add(othersRadio);
		countryLabel=new JLabel("Country");
		panel.add(countryLabel);
		String country[]={"India","Aus","China","Japan","Russia","U.S.A","England","Newzealand"};      
		countryCombobox=new JComboBox(country);
		panel.add(countryCombobox);
		languageLabel=new JLabel("Languages Known");
		panel.add(languageLabel);
		cCheckbox = new JCheckBox("C");  
	    cCheckbox.setBounds(100,100, 50,50); 
	    panel.add(cCheckbox);
		caCheckbox = new JCheckBox("C++",true);  
	    panel.add(caCheckbox);
	    javaCheckbox = new JCheckBox("Java");  
	    panel.add(javaCheckbox);
	    emailLabel=new JLabel("Email");
		panel.add(emailLabel);
		emailText=new JTextField(10);
		panel.add(emailText);	
		passwordLabel=new JLabel("Password");
		panel.add(passwordLabel);
		passwordField=new JPasswordField(10);
		panel.add(passwordField);
		submitButton=new JButton("Submit");
		cancelButton=new JButton("Cancel");
		panel.add(submitButton);
		panel.add(cancelButton);
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) 
	{
	DemoGUI ob=new DemoGUI();	

	}

}
