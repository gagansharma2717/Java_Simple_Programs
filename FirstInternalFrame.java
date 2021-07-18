import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class FirstInternalFrame extends JInternalFrame implements ActionListener{

	JPanel panel;
	JLabel nameLabel, addressLabel, cityLabel, phoneLabel, salaryLabel, regDateLabel, departmentLabel;
	JTextField nameText, addressText, cityText, phoneText, salaryText, regDateText;
	JComboBox departmentCombo;
	JButton submitButton, cancelButton;
	public FirstInternalFrame()
	{
		panel=new JPanel();

		nameLabel=new JLabel("Enter Name : ");
		addressLabel=new JLabel("Enter Address : ");
		cityLabel=new JLabel("Enter City : ");
		phoneLabel=new JLabel("Enter Phone : ");
		salaryLabel=new JLabel("Enter Salary : ");
		regDateLabel=new JLabel("Enter Registration Date : ");
		departmentLabel=new JLabel("Select Department : ");
		
		nameText=new JTextField(10);
		addressText=new JTextField(10);
		cityText=new JTextField(10);
		phoneText=new JTextField(10);
		salaryText=new JTextField(10);
		regDateText=new JTextField(10);
	
		//String dep[]={"1", "2", "3", "4", "5"};
		
		//departmentCombo=new JComboBox(dep);
		
		departmentCombo=new JComboBox();
		
		
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
		panel.add(salaryLabel);
		panel.add(salaryText);
		panel.add(regDateLabel);
		panel.add(regDateText);
		panel.add(departmentLabel);
		panel.add(departmentCombo);
		
		panel.add(submitButton);
		panel.add(cancelButton);

		submitButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:Chhotu");
			PreparedStatement ps=con.prepareStatement("select * from departmentDetails");
			ResultSet rs=ps.executeQuery();	//insert, update, delete
			while(rs.next())
			{
//				String id=rs.getString(1);
//				String name=rs.getString(2);
//				String location=rs.getString(3);
//				

				String id=rs.getString("departmentID");
				String name=rs.getString("departmentName");
				String location=rs.getString("location");
				
				departmentCombo.addItem(name+" - "+id);
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		
		
		add(panel);

		setSize(300,300);
		setMaximizable(true);
		setClosable(true);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==submitButton)
		{
			
			if(nameText.getText().equals(""))
			{
				JOptionPane.showMessageDialog(panel, "Name is required!");
				nameText.requestFocus();
			}
			else if(addressText.getText().equals(""))
			{
				JOptionPane.showMessageDialog(panel, "Address is required!");
				addressText.requestFocus();
			}
			else if(cityText.getText().equals(""))
			{
				JOptionPane.showMessageDialog(panel, "City is required!");
				cityText.requestFocus();
			}
			else if(phoneText.getText().equals(""))
			{
				JOptionPane.showMessageDialog(panel, "Phone is required!");
				phoneText.requestFocus();
			}
			else if(salaryText.getText().equals(""))
			{
				JOptionPane.showMessageDialog(panel, "Salary is required!");
				salaryText.requestFocus();
			}
			else if(regDateText.getText().equals(""))
			{
				JOptionPane.showMessageDialog(panel, "Registration Date is required!");
				regDateText.requestFocus();
			}
			else
			{
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:Chhotu");
					PreparedStatement ps=con.prepareStatement("insert into employeeDetails(name, address, city, phone, salary, regDate, departmentID) values(?, ?, ?, ?, ?, ?, ?)");
					ps.setString(1, nameText.getText());
					ps.setString(2, addressText.getText());
					ps.setString(3, cityText.getText());
					ps.setString(4, phoneText.getText());
					ps.setString(5, salaryText.getText());
					ps.setString(6, regDateText.getText());
					
					String department=departmentCombo.getSelectedItem().toString();
					
					String arr[]=department.split(" ");
					int size=arr.length;
					//ps.setString(7, departmentCombo.getSelectedItem().toString());
					
					ps.setString(7, arr[size-1]);
					
					int i=ps.executeUpdate();	//insert, update, delete
					if(i>0)
					{
						JOptionPane.showMessageDialog(panel, "Record Inserted Successfully!");
						nameText.setText("");
						addressText.setText("");
						cityText.setText("");
						phoneText.setText("");
						salaryText.setText("");
						regDateText.setText("");
						departmentCombo.setSelectedIndex(0);
					}
				}
				catch(Exception ee)
				{
					System.out.println(ee);
				}
			}
		}
		else if(evt.getSource()==cancelButton)
		{
			dispose();
		}
	}
}
