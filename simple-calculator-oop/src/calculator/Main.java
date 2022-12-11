package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener  {

	JFrame frame;
	JTextField textField;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[8];
	JButton addButton;
	JButton subButton;
	JButton mulButton;
	JButton divButton;
	
	JButton decButton;
	JButton equButton;
	JButton delButton;
	JButton crlButton;
	
	JPanel panel;
	
	Font myFont = new Font("TimesRoman", Font.BOLD,30);
	
	double num1 = 0;
	double num2 = 0;
	double result = 0;
	char operator;
	
	Main(){
		
		frame = new JFrame("DiegoDEV");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(50,30, 300, 40);
		textField.setFont(myFont);
		textField.setEditable(false);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		crlButton = new JButton("Clear");
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = crlButton;

		
		
		frame.add(textField);
		frame.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
	

		Main calculadora = new Main();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
