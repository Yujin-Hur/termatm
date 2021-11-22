package keypad;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JButton;

public class screen extends JFrame{
    
    public JFrame Mainframe;
    public static JTextField Inputfield1;
    public static JTextField Inputfield2;
    public JLabel messageJLabel; 
    public JLabel messageJLabel2; 
    public JLabel messageJLabel3;
    public JLabel messageJLabel4;
    public JLabel messageJLabel5;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    
    public void createframe(){
        Mainframe = new JFrame("ATM");
        messageJLabel = new JLabel("input number: ");
        Inputfield1 = new JTextField( 10 );
        Mainframe.add(messageJLabel);
        Mainframe.add( Inputfield1 );
        Mainframe.setLayout( new FlowLayout() ); 
        Mainframe.repaint();
    }

    // public void createmenu() {
    //     Mainframe = new JFrame("ATM");
    //     Mainframe.getContentPane().removeAll();
    //     messageJLabel = new JLabel("Welcome");
	//     messageJLabel2 = new JLabel("1 - Balance");
	//     messageJLabel3 = new JLabel("2 - Withdrawal");
	//     messageJLabel4 = new JLabel("3 - Deposit");
	//     messageJLabel5 = new JLabel("4 - Exit");
    //     Mainframe.setLayout( new FlowLayout() ); 
    //     Mainframe.add(messageJLabel);
	//     Mainframe.add( messageJLabel2 ); 
	//     Mainframe.add( messageJLabel3 );
	//     Mainframe.add( messageJLabel4 ); 
	//     Mainframe.add( messageJLabel5 );
	//     Mainframe.repaint();
    // }

}
