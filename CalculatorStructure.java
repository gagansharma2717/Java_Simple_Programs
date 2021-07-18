import java.awt.*;
import javax.swing.*;
import javax.swing.text.Caret;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorStructure implements ActionListener
{
	JFrame frame;
	JPanel panel, buttonpanel, textpanel;
	JButton button[];
	JTextField calactext;
	int a;
	public CalculatorStructure()
	{
		frame = new JFrame("Calculator");

		panel = new JPanel();
		buttonpanel = new JPanel();
		textpanel = new JPanel();
		
		calactext = new JTextField(5);
		
		textpanel.setBackground(Color.white);
		textpanel.setLayout(null);
		button = new JButton[16];
		
		calactext.setFont(new Font("Courier New", Font.PLAIN, 50));
		for(a=0; a<16; a++)
		{
			button[a] = new JButton();
			buttonpanel.add(button[a]);
			button[a].setFont(new Font("Courier New", Font.BOLD+Font.ITALIC, 20));
			button[a].setFocusable(false);
			button[a].setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		
		
		button[0].setText("1");
		button[1].setText("2");
		button[2].setText("3");
		button[3].setText("+");
		button[4].setText("4");
		button[5].setText("5");
		button[6].setText("6");
		button[7].setText("-");
		button[8].setText("7");
		button[9].setText("8");
		button[10].setText("9");
		button[11].setText("*");
		button[12].setText(".");
		button[13].setText("0");
		button[14].setText("=");
		button[15].setText("/");
		
		buttonpanel.setLayout(new GridLayout(4, 4));

		buttonpanel.setBounds(5, 166, 585, 200);
		textpanel.setBounds(5, 5, 580, 155);
		
		calactext.setBounds(0, 0, 580, 155);
		textpanel.add(calactext);
		
		panel.setLayout(null);
		
		panel.add(buttonpanel);
		panel.add(textpanel);
		
		button[0].addActionListener(this);
		button[1].addActionListener(this);
		button[2].addActionListener(this);
		button[3].addActionListener(this);
		button[4].addActionListener(this);
		button[5].addActionListener(this);
		button[6].addActionListener(this);
		button[7].addActionListener(this);
		button[8].addActionListener(this);
		button[9].addActionListener(this);
		button[10].addActionListener(this);
		button[11].addActionListener(this);
		button[12].addActionListener(this);
		button[13].addActionListener(this);
		button[14].addActionListener(this);
		button[15].addActionListener(this);
		
		frame.add(panel);
		
		
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	public static void main(String Arg[])
	{
		new CalculatorStructure();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}