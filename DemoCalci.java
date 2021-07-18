import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DemoCalci implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton backbutton,cbutton,zerobutton,onebutton,twobutton,threebutton,
	fourbutton,fivebutton,sixbutton,sevenbutton,eightbutton,
	ninebutton,dotbutton,plusbutton,minusbutton,mulbutton,divbutton,perbutton,equalbutton;
	JTextField textField1; 
	GridBagLayout grid;
	GridBagConstraints gbc;
	static double a=0,b=0,result=0;
    static int operator=0;
    
	public DemoCalci()
	{
		frame=new JFrame("Demo Calci!");
		
		panel=new JPanel();

		backbutton=new JButton("<-");
		cbutton=new JButton("Clr");
		zerobutton=new JButton("0");
		onebutton=new JButton("1");
		twobutton=new JButton("2");
		threebutton=new JButton("3");
		fourbutton=new JButton("4");
		fivebutton=new JButton("5");
		sixbutton=new JButton("6");
		sevenbutton=new JButton("7");
		eightbutton=new JButton("8");
		ninebutton=new JButton("9");
		dotbutton=new JButton(".");
		plusbutton=new JButton("+");
		minusbutton=new JButton("-");
		mulbutton=new JButton("*");
		divbutton=new JButton("/");
		perbutton=new JButton("%");
		equalbutton=new JButton("=");
		
		textField1=new JTextField();
		textField1.setFont(new Font("Courier New", Font.PLAIN, 40));
		
		grid=new GridBagLayout();
		gbc=new GridBagConstraints();
		
		frame.add(panel);
	
		panel.setLayout(grid);
		
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=5;
		gbc.ipady=10;
		grid.setConstraints(textField1, gbc);
		panel.add(textField1);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		grid.setConstraints(sevenbutton, gbc);
		panel.add(sevenbutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=1;
		gbc.gridy=1;
		grid.setConstraints(eightbutton, gbc);
		panel.add(eightbutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=2;
		gbc.gridy=1;
		grid.setConstraints(ninebutton, gbc);
		panel.add(ninebutton);
	
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=3;
		gbc.gridy=1;
		grid.setConstraints(divbutton, gbc);
		panel.add(divbutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=4;
		gbc.gridy=1;
		grid.setConstraints(cbutton, gbc);
		panel.add(cbutton);
				
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=0;
		gbc.gridy=2;
		grid.setConstraints(fourbutton, gbc);
		panel.add(fourbutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=1;
		gbc.gridy=2;
		grid.setConstraints(fivebutton, gbc);
		panel.add(fivebutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=2;
		gbc.gridy=2;
		grid.setConstraints(sixbutton, gbc);
		panel.add(sixbutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=3;
		gbc.gridy=2;
		grid.setConstraints(mulbutton, gbc);
		panel.add(mulbutton);
		

		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=4;
		gbc.gridy=2;
		grid.setConstraints(perbutton, gbc);
		panel.add(perbutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=0;
		gbc.gridy=3;
		grid.setConstraints(onebutton, gbc);
		panel.add(onebutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=1;
		gbc.gridy=3;
		grid.setConstraints(twobutton, gbc);
		panel.add(twobutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=2;
		gbc.gridy=3;
		grid.setConstraints(threebutton, gbc);
		panel.add(threebutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=3;
		gbc.gridy=3;
		grid.setConstraints(minusbutton, gbc);
		panel.add(minusbutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridheight=2;
		gbc.gridx=4;
		gbc.gridy=3;
		grid.setConstraints(equalbutton, gbc);
		panel.add(equalbutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridheight=1;
		grid.setConstraints(zerobutton, gbc);
		panel.add(zerobutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=2;
		gbc.gridy=4;
		grid.setConstraints(dotbutton, gbc);
		panel.add(dotbutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=1;
		gbc.gridy=4;
		grid.setConstraints(backbutton, gbc);
		panel.add(backbutton);
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(4,4,4,4);
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=3;
		gbc.gridy=4;
		grid.setConstraints(plusbutton, gbc);
		panel.add(plusbutton);
		
		backbutton.addActionListener(this);
		cbutton.addActionListener(this);
		zerobutton.addActionListener(this);
		onebutton.addActionListener(this);
		twobutton.addActionListener(this);
		threebutton.addActionListener(this);
		fourbutton.addActionListener(this);
		fivebutton.addActionListener(this);
		sixbutton.addActionListener(this);
		sevenbutton.addActionListener(this);
		eightbutton.addActionListener(this);
		ninebutton.addActionListener(this);
		dotbutton.addActionListener(this);
		plusbutton.addActionListener(this);
		minusbutton.addActionListener(this);
		mulbutton.addActionListener(this);
		divbutton.addActionListener(this);
		perbutton.addActionListener(this);
		equalbutton.addActionListener(this);
		
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoCalci();

	}
	public void actionPerformed(ActionEvent evt) {
		
		if(evt.getSource()==onebutton)
		{
			
			String s=textField1.getText();
			textField1.setText(s+"1");
			
		}
		else if(evt.getSource()==twobutton)
		{
			String s=textField1.getText();
			textField1.setText(s+"2");
			
		}
		else if(evt.getSource()==threebutton)
		{

			String s=textField1.getText();
			textField1.setText(s+"3");
			
		}
		else if(evt.getSource()==fourbutton)
		{
			String s=textField1.getText();
			//double d=Double.parseDouble(s);
			textField1.setText(s+"4");
			
		}
		else if(evt.getSource()==fivebutton)
		{
			String s=textField1.getText();
			textField1.setText(s+"5");
			
		}
		else if(evt.getSource()==sixbutton)
		{
			String s=textField1.getText();
			textField1.setText(s+"6");
			
		}
		else if(evt.getSource()==sevenbutton)
		{
			String s=textField1.getText();
			textField1.setText(s+"7");
			
		}
		else if(evt.getSource()==eightbutton)
		{
			String s=textField1.getText();
			textField1.setText(s+"8");
			
		}
		else if(evt.getSource()==ninebutton)
		{
			String s=textField1.getText();
			textField1.setText(s+"9");
			
		}
		else if(evt.getSource()==zerobutton)
		{
			String s=textField1.getText();
			textField1.setText(s+"0");
			
		}
		else if(evt.getSource()==cbutton)
		{	
			textField1.setText(" ");
			
		}
		else if(evt.getSource()==backbutton)
		{
		  String s=textField1.getText();
		  textField1.setText("");
          for(int i=0;i<s.length()-1;i++)
        	  textField1.setText(textField1.getText()+s.charAt(i));
		}
		else if(evt.getSource()==plusbutton)
        {
			a=Double.parseDouble(textField1.getText());
           operator=1;         
           textField1.setText("");
        } 
        
		else if(evt.getSource()==minusbutton)
        {
            a=Double.parseDouble(textField1.getText());
            operator=2;
            textField1.setText("");
        }
        
		else if(evt.getSource()==mulbutton)
        {
            a=Double.parseDouble(textField1.getText());
            operator=3;
            textField1.setText("");
        }
        else if(evt.getSource()==divbutton)
        {
            a=Double.parseDouble(textField1.getText());
            operator=4;
            textField1.setText("");
        }
		else if(evt.getSource()==perbutton)
        {
            a=Double.parseDouble(textField1.getText());
            operator=5;
            textField1.setText("");
        }
        else if(evt.getSource()==equalbutton)
        {
            b=Double.parseDouble(textField1.getText());
        
            switch(operator)
            {
                case 1: result=a+b;
                      	break;
        
                case 2: result=a-b;
                      	break;
        
                case 3: result=a*b;
                       	break;
                     
                case 4: result=a/b;
                    	break;
               
                case 5: result=a%b;
                		break;
                default: result=0;
            }
        
            textField1.setText(""+result);
        }
	}

}
