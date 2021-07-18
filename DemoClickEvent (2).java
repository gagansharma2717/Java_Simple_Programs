import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DemoClickEvent implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JLabel displayLabel;
	JButton firstButton, secondButton;
	public DemoClickEvent()
	{
		frame=new JFrame("Demo Click Event");

		panel=new JPanel();
		
		displayLabel=new JLabel("Look at me!");

		firstButton=new JButton("Click Me!");
		secondButton=new JButton("Click Me too!");

		panel.add(displayLabel);

		panel.add(firstButton);
		panel.add(secondButton);

		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		
		frame.add(panel);

		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	public static void main(String arg[])
	{
		DemoClickEvent ob=new DemoClickEvent();
	}

	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()==firstButton)
		{
			displayLabel.setText("First Button Clicked");
		}
		else if(evt.getSource()==secondButton)
		{
			displayLabel.setText("Second Button Clicked");
		}
		
	}
}