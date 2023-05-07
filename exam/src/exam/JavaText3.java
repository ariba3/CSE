package exam;

import java.awt.GridLayout;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaText3 extends JPanel {
	JFrame f = new JFrame("trinaaaaa");
	JPanel panel2 = new JPanel();
	
	char[] c = {'0','1','2','3','k'};
	String  s = String.valueOf(c);
    
	
    JButton btn[] = new JButton [6] ;
     {for (int i=0; i<12 ; i++) 
    {
   	//btn[i] = new JButton(s[i]);
   	panel2.add (btn[i]);
    }
    f.add(panel2);
	f.setSize(350,200);
	f.setLayout(null);
    panel2.setLayout(new GridLayout (4,3,3,3)) ;
    f.add (panel2);
   
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
    
}
