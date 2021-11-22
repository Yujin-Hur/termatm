package keypad;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test {

    static private screen screen;
    static private keypad keypad;
    public static void main(String[] args){
        screen = new screen();
        keypad = new keypad(); 

        // create gui
        screen.createframe();
         
        //create keyboard
        keypad.setbuttons();
        keypad.addkeypadlisteners();
        screen.Mainframe.add(keypad.addkeypad(), BorderLayout.CENTER);
        // screen.Mainframe.revalidate();

        screen.Mainframe.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        screen.Mainframe.setSize( 400, 280 ); 
        screen.Mainframe.setVisible( true );
    }

    
}


