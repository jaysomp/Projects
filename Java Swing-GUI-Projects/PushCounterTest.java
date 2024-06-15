//Jay Sompalli
//CSC 1302
//Lab 12 Question 1

import javax.swing.JFrame;

public class PushCounterTest //class for running counters commented out the code to run each of them sorter running by defult
{

public static void main(String[] args)
{
/* JFrame frame = new JFrame("Incrementing/Decrementing");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
PushCounterPanelMath panel = new PushCounterPanelMath();
frame.getContentPane().add(panel);
frame.pack();
frame.setVisible(true); */

/* JFrame frame1 = new JFrame("Random Number");
frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
PushCounterPanel panel1 = new PushCounterPanel();
frame1.getContentPane().add(panel1);
frame1.pack();
frame1.setVisible(true); */

JFrame frame2 = new JFrame("Number Sort");
frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
PushCounterPanelSorter panel2 = new PushCounterPanelSorter();
frame2.getContentPane().add(panel2);
frame2.pack();
frame2.setVisible(true); 

}
} //end of PushCounter.java