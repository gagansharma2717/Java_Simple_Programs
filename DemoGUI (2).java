import java.awt.*;
import javax.swing.*;
public class DemoGUI
{
	JFrame frame;
	JPanel panel;
	JLabel nameLabel,contactLabel,addressLabel,passwordLabel,genderLabel,emailLabel,countryLabel,languageLabel,commentLabel;
	JTextField nameText,contactText,emailText;
	JTextArea addressTextarea,commentTextarea;
	JScrollPane addressScroll;
	JPasswordField passwordField;
	JComboBox countryCombobox;
	JCheckBox cCheckbox,caCheckbox,javaCheckbox;
	JRadioButton maleRadio,femaleRadio,othersRadio;
	ButtonGroup radioButtongroup;
	JButton signupButton,cancelButton;
	GridLayout grid;
	
	public DemoGUI() 
	{
		frame=new JFrame("My First Frame");
		
		panel=new JPanel(); 
		panel.setBounds(40,80,200,200);        
		
		
		nameLabel=new JLabel("Name");
		addressLabel=new JLabel("Address");
		contactLabel=new JLabel("Contact");
		genderLabel=new JLabel("Gender");
		countryLabel=new JLabel("Country");
		languageLabel=new JLabel("Languages Known");
		emailLabel=new JLabel("Email");
		passwordLabel=new JLabel("Password");
		commentLabel=new JLabel("Comments");
		
		nameText=new JTextField(10); //10 is the width here...
		
		contactText=new JTextField(10);
		emailText=new JTextField(10);
		
		commentTextarea=new JTextArea(5,10);
		addressTextarea=new JTextArea(5,10);
		
		addressScroll=new JScrollPane(addressTextarea);
		passwordField=new JPasswordField(10);
		
		String country[]={"India","Aus","China","Japan","Russia","U.S.A","England","Newzealand"};      
		countryCombobox=new JComboBox(country);

		cCheckbox = new JCheckBox("C");  
	    caCheckbox = new JCheckBox("C++",true);  
	    javaCheckbox = new JCheckBox("Java");
	    
	    
	    maleRadio=new JRadioButton("A) Male");
		femaleRadio=new JRadioButton("B) Female");
		othersRadio=new JRadioButton("C) Others");
		
		
		radioButtongroup=new ButtonGroup(); //ButtonGroup is a function used for grouping the buttons so that only one button is selected...
		radioButtongroup.add(maleRadio);
		radioButtongroup.add(femaleRadio);
		radioButtongroup.add(othersRadio);
		
		signupButton=new JButton("SignUp");
		cancelButton=new JButton("Cancel");
		
		grid=new GridLayout(12,2);
		
		frame.add(panel);
		
		panel.add(nameLabel);
		panel.add(nameText);
		
		panel.add(addressLabel);		
		panel.add(addressScroll);
		
		panel.add(contactLabel);		
		panel.add(contactText);
		
		panel.add(genderLabel);		
		panel.add(maleRadio);
		panel.add(femaleRadio);
		panel.add(othersRadio);
		
		panel.add(countryLabel);
		panel.add(countryCombobox);
		
		panel.add(languageLabel);		
	    panel.add(cCheckbox);
		panel.add(caCheckbox);	      
	    panel.add(javaCheckbox);
	    
		panel.add(emailLabel);		
		panel.add(emailText);	
		
		panel.add(passwordLabel);		
		panel.add(passwordField);
		
		panel.add(commentLabel);
		panel.add(commentTextarea);
		
		panel.add(signupButton);
		panel.add(cancelButton);
		
		panel.setLayout(grid);
		
		frame.setSize(600,600);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) 
	{
	DemoGUI ob=new DemoGUI();	

	}

}
