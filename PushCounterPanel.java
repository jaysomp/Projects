//Jay Sompalli 
//CSC 1302 
//Lab 12 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PushCounterPanel extends JPanel
{
private int rand; //count to random to represent random numbers
private JButton push;
private JLabel label;

public PushCounterPanel()
{
rand = 0; //count to random to represent random numbers
push = new JButton("Push Me!");
label = new JLabel();
push.addActionListener(new ButtonListener());
add(push);
add(label);
setBackground(Color.cyan);
setPreferredSize(new Dimension(300, 40));
}

private class ButtonListener implements ActionListener
{
public void actionPerformed(ActionEvent event)
{
rand = (int) (Math.random() * (100 - 1)) + 1; 
label.setText("Number: " + rand);
}
}
} 