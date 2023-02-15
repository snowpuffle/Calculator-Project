package Calculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	double firstNumber;
	double secondNumber;
	double result;

	String operation;
	String answer = "0";

	// Driver Main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Class Constructor
	public Calculator() {
		initialize();
	}

	// JFrame
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 305, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// Button Backspace
		JButton btn_BackSpace = new JButton("\uF0E7");
		btn_BackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 1) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btn_BackSpace.setFont(new Font("Wingdings", Font.BOLD, 22));
		btn_BackSpace.setBounds(10, 82, 60, 60);
		frame.getContentPane().add(btn_BackSpace);

		// Button Clear
		JButton btn_Clear = new JButton("C");
		btn_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		});
		btn_Clear.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn_Clear.setBounds(80, 82, 60, 60);
		frame.getContentPane().add(btn_Clear);

		// Button 0
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempNum = textField.getText();
				String number = null;

				if (tempNum.equals(answer) || tempNum.equals("0")) {
					number = btn_0.getText();
					textField.setText(number);
				} else {
					number = textField.getText() + btn_0.getText();
				}
				textField.setText(number);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_0.setBounds(10, 366, 60, 60);
		frame.getContentPane().add(btn_0);

		// Button 1
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String tempNum = textField.getText();
				String number = null;

				if (tempNum.equals(answer) || tempNum.equals("0")) {
					number = btn_1.getText();
					textField.setText(number);
				} else {
					number = textField.getText() + btn_1.getText();
				}
				textField.setText(number);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_1.setBounds(10, 295, 60, 60);
		frame.getContentPane().add(btn_1);

		// Button 2
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempNum = textField.getText();
				String number = null;

				if (tempNum.equals(answer) || tempNum.equals("0")) {
					number = btn_2.getText();
					textField.setText(number);
				} else {
					number = textField.getText() + btn_2.getText();
				}
				textField.setText(number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_2.setBounds(80, 295, 60, 60);
		frame.getContentPane().add(btn_2);

		// Button 3
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempNum = textField.getText();
				String number = null;

				if (tempNum.equals(answer) || tempNum.equals("0")) {
					number = btn_3.getText();
					textField.setText(number);
				} else {
					number = textField.getText() + btn_3.getText();
				}
				textField.setText(number);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_3.setBounds(150, 295, 60, 60);
		frame.getContentPane().add(btn_3);

		// Button 4
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempNum = textField.getText();
				String number = null;

				if (tempNum.equals(answer) || tempNum.equals("0")) {
					number = btn_4.getText();
					textField.setText(number);
				} else {
					number = textField.getText() + btn_4.getText();
				}
				textField.setText(number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_4.setBounds(10, 224, 60, 60);
		frame.getContentPane().add(btn_4);

		// Button 5
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempNum = textField.getText();
				String number = null;

				if (tempNum.equals(answer) || tempNum.equals("0")) {
					number = btn_5.getText();
					textField.setText(number);
				} else {
					number = textField.getText() + btn_5.getText();
				}
				textField.setText(number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_5.setBounds(80, 224, 60, 60);
		frame.getContentPane().add(btn_5);

		// Button 6
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempNum = textField.getText();
				String number = null;

				if (tempNum.equals(answer) || tempNum.equals("0")) {
					number = btn_6.getText();
					textField.setText(number);
				} else {
					number = textField.getText() + btn_6.getText();
				}
				textField.setText(number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_6.setBounds(150, 224, 60, 60);
		frame.getContentPane().add(btn_6);

		// Button 7
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempNum = textField.getText();
				String number = null;

				if (tempNum.equals(answer) || tempNum.equals("0")) {
					number = btn_7.getText();
					textField.setText(number);
				} else {
					number = textField.getText() + btn_7.getText();
				}
				textField.setText(number);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_7.setBounds(10, 153, 60, 60);
		frame.getContentPane().add(btn_7);

		// Button 8
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempNum = textField.getText();
				String number = null;

				if (tempNum.equals(answer) || tempNum.equals("0")) {
					number = btn_8.getText();
					textField.setText(number);
				} else {
					number = textField.getText() + btn_8.getText();
				}
				textField.setText(number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_8.setBounds(80, 153, 60, 60);
		frame.getContentPane().add(btn_8);

		// Button 9
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempNum = textField.getText();
				String number = null;

				if (tempNum.equals(answer) || tempNum.equals("0")) {
					number = btn_9.getText();
					textField.setText(number);
				} else {
					number = textField.getText() + btn_9.getText();
				}
				textField.setText(number);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_9.setBounds(150, 153, 60, 60);
		frame.getContentPane().add(btn_9);

		// Button 00
		JButton btn_00 = new JButton("00");
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_00.getText();
				textField.setText(number);
			}
		});
		btn_00.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_00.setBounds(150, 82, 60, 60);
		frame.getContentPane().add(btn_00);

		// Add Button
		JButton btn_Add = new JButton("+");
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("0");
				operation = "+";
			}
		});
		btn_Add.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_Add.setBounds(220, 153, 60, 60);
		frame.getContentPane().add(btn_Add);

		// Subtract Button
		JButton btn_Subtract = new JButton("-");
		btn_Subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("0");
				operation = "-";
			}
		});
		btn_Subtract.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_Subtract.setBounds(220, 224, 60, 60);
		frame.getContentPane().add(btn_Subtract);

		// Multiply Button
		JButton btn_Multiply = new JButton("*");
		btn_Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("0");
				operation = "*";
			}
		});
		btn_Multiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_Multiply.setBounds(220, 295, 60, 60);
		frame.getContentPane().add(btn_Multiply);

		// Divide Button
		JButton btn_Divide = new JButton("/");
		btn_Divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("0");
				operation = "/";
			}
		});
		btn_Divide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_Divide.setBounds(220, 366, 60, 60);
		frame.getContentPane().add(btn_Divide);

		// Decimal Button: Only Add a Decimal if Decimal is not Present Yet
		JButton btn_Decimal = new JButton(".");
		btn_Decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().contains(".")) {
					String number = textField.getText() + btn_Decimal.getText();
					textField.setText(number);
				}

			}
		});
		btn_Decimal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_Decimal.setBounds(80, 366, 60, 60);
		frame.getContentPane().add(btn_Decimal);

		// Equals Button
		JButton btn_Equals = new JButton("=");
		btn_Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNumber = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "-") {
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "*") {
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "/") {
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "%") {
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btn_Equals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_Equals.setBounds(150, 366, 60, 60);
		frame.getContentPane().add(btn_Equals);

		// Plus/Minus Button
		JButton btn_PlusMinus = new JButton("±");
		btn_PlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tempNum = Double.parseDouble(String.valueOf(textField.getText()));
				tempNum = tempNum * (-1);
				textField.setText(String.valueOf(tempNum));
			}
		});
		btn_PlusMinus.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn_PlusMinus.setBounds(220, 83, 60, 60);
		frame.getContentPane().add(btn_PlusMinus);

		// Display Field
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(10, 11, 270, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
