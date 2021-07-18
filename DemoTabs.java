import javax.swing.*;

public class DemoTabs 
{
	JFrame frame;
	JTabbedPane tabs;
	FirstTabClass firstTab;
	SecondTabClass secondTab;
	public DemoTabs() 
	{
		frame=new JFrame("My Frame");
		
		tabs=new JTabbedPane();

		firstTab=new FirstTabClass();
		secondTab=new SecondTabClass();

		tabs.addTab("First", firstTab.getTab());
		tabs.addTab("Second", secondTab.getTab());
		
		frame.add(tabs);
		
		frame.setSize(500,500);
		frame.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoTabs();
	}

}
