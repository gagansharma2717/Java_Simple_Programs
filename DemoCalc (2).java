import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DemoCalc implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton oneButton, twoButton, threeButton, fourButton, fiveButton;
	JTextField valueText;
	
	public DemoCalc()
	{
		frame=new JFrame("Demo Calculator");
		
		panel=new JPanel();

		oneButton=new JButton("1");
		twoButton=new JButton("2");
		threeButton=new JButton("3");
		fourButton=new JButton("4");
		fiveButton=new JButton("5");
	
		valueText=new JTextField(10);
		
		panel.add(valueText);
		panel.add(oneButton);
		panel.add(twoButton);
		panel.add(threeButton);
		panel.add(fourButton);
		panel.add(fiveButton);

		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		threeButton.addActionListener(this);
		fourButton.addActionListener(this);
		fiveButton.addActionListener(this);
		
		frame.add(panel);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	public static void main(String arg[])
	{
		new DemoCalc();
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==oneButton)
		{
			String s=valueText.getText();
			valueText.setText(s+"1");
		}
		else if(evt.getSource()==twoButton)
		{
			String s=valueText.getText();
			valueText.setText(s+"2");
		}
		else if(evt.getSource()==threeButton)
		{

			String s=valueText.getText();
			valueText.setText(s+"3");
		}
		else if(evt.getSource()==fourButton)
		{
			String s=valueText.getText();
			//double d=Double.parseDouble(s);
			valueText.setText(s+"4");
		}
		else if(evt.getSource()==fiveButton)
		{
			String s=valueText.getText();
			valueText.setText(s+"5");
		}
	}
}
