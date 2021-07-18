import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTreeActionListener extends JFrame {
		JButton addButton;
		JTree tree;
		DefaultMutableTreeNode root;
		DefaultMutableTreeNode child;
  public static void main(String[] av) {
		new JTreeActionListener();
  }
  
  public JTreeActionListener(){
		super("JTreeActionListener");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		root = new DefaultMutableTreeNode("root");
		child = new DefaultMutableTreeNode("Colors");
		root.add(child);
		child.add(new DefaultMutableTreeNode("Red"));
		child.add(new DefaultMutableTreeNode("Blue"));
		child.add(new DefaultMutableTreeNode("Orange"));
		child.add(new DefaultMutableTreeNode("Green"));
		child.add(new DefaultMutableTreeNode("Yellow"));
		tree = new JTree(root);
		JScrollPane scroller = new JScrollPane(tree);
		c.add(BorderLayout.CENTER, scroller);
		c.add(BorderLayout.NORTH, addButton = new JButton("Add"));
		addButton.addActionListener(new ActionListener(){

      public void actionPerformed(ActionEvent e){
        	child = new DefaultMutableTreeNode("Java Tutorial");
       		child.add(new DefaultMutableTreeNode("Java.Example"));
       		child.add(new DefaultMutableTreeNode("Java Awt"));
        	child.add(new DefaultMutableTreeNode("Java String"));
        	child.add(new DefaultMutableTreeNode("Java News"));
        	child.add(new DefaultMutableTreeNode("Java IO"));
	   	((DefaultTreeModel) tree.getModel()).insertNodeInto(child, root, 0);
		}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,300);
	}
}