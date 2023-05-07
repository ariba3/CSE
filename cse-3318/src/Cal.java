import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cal extends JFrame{
	JPanel panel1,panel2,panel3;
	JTextField txt;
	JButton btn1, btn2, btn3, btn4,
	btn5,btn6,btn7,btn8,btn9,btn0,btnDot,
	btnEqual,btnClr,btnAdd,btnSub,btnMul,btnDiv;
	Cal(){
		setSize(500,550);
		setDefaultCloseOperation(3);
		setLayout(null);
		setTitle("Calculator");
		setLocationRelativeTo(null);
		
		Font font = new Font("Arial",Font.BOLD,30);
		
		panel1 = new JPanel();
		panel1.setBounds(0,0,500,80);
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setLayout(null);
		
		add(panel1);
		
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4,3,2,2));
		panel2.setBounds(0,80,300,470);
		panel2.setBackground(Color.GRAY);
		
		add(panel2);
		
		panel3 = new JPanel();
		panel3.setLayout(new GridLayout(5,1,1,1));
		panel3.setBounds(300,80,200,470);
		panel3.setBackground(Color.LIGHT_GRAY);
		
		add(panel3);
		
		txt = new JTextField();
		//txt.setEditable(false);
		txt.setBounds(5,5,375,70);
		txt.setFont(font);
		panel1.add(txt);
		
		btn1 = new JButton("1");btn1.setFont(font);panel2.add(btn1);
		btn2 = new JButton("2");btn2.setFont(font);panel2.add(btn2);
		btn3 = new JButton("3");btn3.setFont(font);panel2.add(btn3);
		btn4 = new JButton("4");btn4.setFont(font);panel2.add(btn4);
		btn5 = new JButton("5");btn5.setFont(font);panel2.add(btn5);
		btn6 = new JButton("6");btn6.setFont(font);panel2.add(btn6);
		btn7 = new JButton("7");btn7.setFont(font);panel2.add(btn7);
		btn8 = new JButton("8");btn8.setFont(font);panel2.add(btn8);
		btn9 = new JButton("9");btn9.setFont(font);panel2.add(btn9);
		btn0 = new JButton("0");btn0.setFont(font);panel2.add(btn0);
		btnDot = new JButton(".");btnDot.setFont(font);panel2.add(btnDot);
		btnEqual = new JButton("=");btnEqual.setFont(font);panel2.add(btnEqual);
		//btnClr = new JButton("C");btnClr.setFont(font);panel2.add(btnClr);
		
		btnAdd = new JButton("+");btnAdd.setFont(font);panel3.add(btnAdd);
		btnSub = new JButton("-");btnSub.setFont(font);panel3.add(btnSub);
		btnMul = new JButton("*");btnMul.setFont(font);panel3.add(btnMul);
		btnDiv = new JButton("/");btnDiv.setFont(font);panel3.add(btnDiv);
		btnClr = new JButton("C");btnClr.setFont(font);panel3.add(btnClr);
		
		
		
		setVisible(true);
		
		
	}
}
