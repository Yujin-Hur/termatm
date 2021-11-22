package keypad;


// Keypad.java

import java.util.Scanner;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class keypad 
{
   private Scanner input; 
   private String userinput;
   public static JButton B1;
   public static JButton B2;
   public static JButton B3;
   public static JButton B4;
   public static JButton B5;
   public JButton B6;
   public JButton B7;
   public JButton B8;
   public JButton B9;
   public JButton B0;
   public JButton BClear;
   public JButton BEnter;

   public keypad(){
      input = new Scanner(System.in);    
   } 

   public void setbuttons(){	   
	   B1 = new JButton("1");
	//    B1.setText("1");
	   B2 = new JButton("2");
	   B3 = new JButton("3");
	   B4 = new JButton("4");
	   B5 = new JButton("5");
	   B6 = new JButton("6");
	   B7 = new JButton("7");
	   B8 = new JButton("8");
	   B9 = new JButton("9");
	   B0 = new JButton("0");
	   BClear = new JButton("Clear");
	   BEnter = new JButton("Enter");			   
   }
   
   public JPanel addkeypad(){
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(180, 160));
		panel.setBackground(Color.gray);
		panel.setLayout(new FlowLayout()); 
		panel.add(B1);
		panel.add(B2);
		panel.add(B3);
		panel.add(B4);
		panel.add(B5);
		panel.add(B6);
		panel.add(B7);
	    panel.add(B8);
	    panel.add(B9);
	    panel.add(BClear);
	    panel.add(B0);
	    panel.add(BEnter);
	    return panel;
   }
   
   
   public void addkeypadlisteners(){
		BCheck BC = new BCheck();
		BClear BC1 = new BClear();
		BEnter BC2 = new BEnter();

		B1.addActionListener(BC);
	  	B2.addActionListener(BC);
	  	B3.addActionListener(BC);
	  	B4.addActionListener(BC);
	  	B5.addActionListener(BC);
	  	B6.addActionListener(BC);
	  	B7.addActionListener(BC);
	  	B8.addActionListener(BC);
	  	B9.addActionListener(BC);
	  	B0.addActionListener(BC);
	  	BClear.addActionListener(BC1);
      	BEnter.addActionListener(BC2);
   }

   public class BCheck implements ActionListener {
      public void actionPerformed(ActionEvent e){
    	   JButton b = (JButton)e.getSource();
		   String label = b.getLabel();
         if (userinput == null){
            userinput = "";
         }
         userinput = userinput + label;
         screen.Inputfield1.setText(userinput);
        }
   }


   public class BClear implements ActionListener{
      public void actionPerformed( ActionEvent e){
    	  userinput = "";
    	  screen.Inputfield1.setText(userinput);
      }
   }

   private class BEnter implements ActionListener{
	   public void actionPerformed( ActionEvent e ){
	        int inputnum = Integer.parseInt(screen.Inputfield1.getText());
			System.out.println(inputnum);
	      }
	   }
   
} 