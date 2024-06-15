//Jay Sompalli 
//CSC 1302 
//Lab 12

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanelMath extends JPanel
{
private int num = 50;  
private JButton push;
private JButton push2;
private JLabel label = new JLabel("Value: " + num);


public PushCounterPanelMath()
{
push = new JButton("Increment"); //new button for inc
push2 = new JButton("Decrement"); //new button for dec

push.addActionListener(buttonlisten);
push2.addActionListener(buttonlisten);
add(push);
add(push2);

add(label);

setBackground(Color.cyan);
setPreferredSize(new Dimension(300, 40));
}

ActionListener buttonlisten = new ActionListener() {
	public void actionPerformed(ActionEvent event) 
	{
	 Object type = event.getSource();
	 
	 if(type == push) { //if statement to find which button is pressed and find appropriate action
		 num++;
		 label.setText("Value: " + num);
	 } 
	 else if(type == push2) {
		 num--;
		 label.setText("Value: " + num); 
	 }
		 
	 
		
	}
};


} 