import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class MeraNotu implements ActionListener
{
	JFrame frame;
	JScrollPane textScroll;
	JTextArea text;
	JMenuBar menuBar;
	JMenu fileMenu, editMenu, formatMenu, viewMenu, helpMenu;
	JMenuItem newItem, openItem, saveItem, saveAsItem, closeItem, cutItem, copyItem, pasteItem;
	public MeraNotu()
	{
		frame=new JFrame("Untitled - Mera Notu");
		
		text=new JTextArea();

		textScroll=new JScrollPane(text);

		menuBar=new JMenuBar();

		fileMenu=new JMenu("File");
		editMenu=new JMenu("Edit");
		formatMenu=new JMenu("Format");
		viewMenu=new JMenu("View");
		helpMenu=new JMenu("Help");

		newItem=new JMenuItem("New");
		openItem=new JMenuItem("Open");
		saveItem=new JMenuItem("Save");
		saveAsItem=new JMenuItem("Save As..");
		closeItem=new JMenuItem("Close");
		cutItem=new JMenuItem("Cut");
		copyItem=new JMenuItem("Copy");
		pasteItem=new JMenuItem("Paste");

		frame.add(textScroll);
	
		frame.setJMenuBar(menuBar);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(formatMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);

		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(saveAsItem);
		fileMenu.add(closeItem);
		
		editMenu.add(cutItem);
		editMenu.add(copyItem);
		editMenu.add(pasteItem);

		newItem.addActionListener(this);
		openItem.addActionListener(this);
		saveItem.addActionListener(this);
		saveAsItem.addActionListener(this);
		closeItem.addActionListener(this);
		cutItem.addActionListener(this);
		copyItem.addActionListener(this);
		pasteItem.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(600,400);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==newItem)
		{}
		else if(evt.getSource()==openItem)
		{
			JFileChooser fileChooser=new JFileChooser();
			int res=fileChooser.showOpenDialog(frame);
			if(res==JFileChooser.APPROVE_OPTION)
			{
				try
				{
					File f=fileChooser.getSelectedFile();
					String s=f.getName();
					frame.setTitle("Mera Notu - "+s);
					FileInputStream fis=new FileInputStream(f);
					byte arr[]=new byte[8024];
					int i=0; 
					while(i<1024)
					{
						i=fis.read(arr, i, 8024);
					}
					
					String s1=new String(arr);
					text.setText(s1);
				}
				catch(Exception ee)
				{
					System.out.println(ee);
					
				}
			}
		}
		else if(evt.getSource()==saveItem)
		{

			JFileChooser fileChooser=new JFileChooser();
			int res=fileChooser.showSaveDialog(frame);
			if(res==JFileChooser.APPROVE_OPTION)
			{
				try
				{
					File f=fileChooser.getSelectedFile();
					String s=f.getName();
					frame.setTitle("Mera Notu - "+s);
					FileOutputStream fos=new FileOutputStream(f);
					
					byte arr[]=text.getText().getBytes();
					fos.write(arr);
				}
				catch(Exception ee)
				{
					System.out.println(ee);
					
				}
			}
		}
		else if(evt.getSource()==saveAsItem)
		{
			JFileChooser fileChooser=new JFileChooser();
			int res=fileChooser.showSaveDialog(frame);
			if(res==JFileChooser.APPROVE_OPTION)
			{
				//To Save the code in file.
			}
		}
		else if(evt.getSource()==closeItem)
		{
			System.exit(0);
			
		}
		else if(evt.getSource()==cutItem)
		{}
		else if(evt.getSource()==copyItem)
		{}
		else if(evt.getSource()==pasteItem)
		{}
	}
	public static void main(String arg[])
	{
		new MeraNotu();
	}
}