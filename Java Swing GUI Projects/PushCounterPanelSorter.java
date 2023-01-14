//Jay Sompalli 
//CSC 1302 
//Lab 12

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;

public class PushCounterPanelSorter extends JPanel{

	//text fields and buttons 
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	private JButton button;
	private JLabel label;

	public PushCounterPanelSorter()
	{
		label = new JLabel(); 
		button = new JButton("Sort");
		button.addActionListener(buttonlisten);
		text1 = new JTextField(16);
		text2 = new JTextField(16);
		text3 = new JTextField(16);
		text4 = new JTextField(16);
		text5 = new JTextField(16);

		add(text1); //adds elements 
		add(text2);
		add(text3);
		add(text4);
		add(text5);
		add(button);
		add(label);
	    setSize(300, 300);
	}

	
	ActionListener buttonlisten = new ActionListener() {
		public void actionPerformed(ActionEvent event) 
		{
		   //adds input into array and prints out as a string
		   int n1 = Integer.parseInt(text1.getText());
		   int n2 = Integer.parseInt(text2.getText());
		   int n3 = Integer.parseInt(text3.getText());
		   int n4 = Integer.parseInt(text4.getText());
		   int n5 = Integer.parseInt(text5.getText());
		  
		   int[] arr = { n1, n2, n3, n4, n5 };
		   
		   Arrays.sort(arr);
		   
		   String Sorted = Arrays.toString(arr); 
		   String SortedOut = Sorted.substring(1,Sorted.indexOf(']'));
		   
	     
		    
		   label.setText(SortedOut);

	}
 };
}
