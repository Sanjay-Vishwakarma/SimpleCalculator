package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	private JButton btn8;
	private JButton btn9;
	private JButton btnPlus;

	/**
	 * Launch the application.
	 */
	double n1;
	double n2;
	double result;
	String answer;
	String operation;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
					window.frame.setLocation(400, 150);
					window.frame.setResizable(false);
					window.frame.setTitle("MyCalculator");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 280, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Dialog", Font.BOLD, 20));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(12, 12, 237, 45);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);

		// ----------------- Row 1 -----------------------------------

		JButton btnDelt = new JButton("<--");
		btnDelt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String Delete = null;

				if (txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					Delete = strB.toString();
					txtDisplay.setText(Delete);
				}

			}
		});
		btnDelt.setFont(new Font("Dialog", Font.BOLD, 10));
		btnDelt.setBounds(12, 75, 50, 50);
		frame.getContentPane().add(btnDelt);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(null);

			}
		});
		btnClear.setFont(new Font("Dialog", Font.BOLD, 14));
		btnClear.setBounds(74, 75, 50, 50);
		frame.getContentPane().add(btnClear);

		JButton btnNull = new JButton("%");
		btnNull.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNull.setBounds(136, 75, 50, 50);
		frame.getContentPane().add(btnNull);

		JButton btnExit = new JButton("EX");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Dialog", Font.BOLD, 10));
		btnExit.setBounds(198, 75, 50, 50);
		frame.getContentPane().add(btnExit);

		// ----------------- Row 2 -----------------------------------

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 20));
		btn7.setBounds(12, 135, 50, 50);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 20));
		btn8.setBounds(74, 135, 50, 50);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 20));
		btn9.setBounds(136, 135, 50, 50);
		frame.getContentPane().add(btn9);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPlus.setBounds(198, 135, 50, 50);
		frame.getContentPane().add(btnPlus);

		// ----------------- Row 3 -----------------------------------

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 20));
		btn4.setBounds(12, 195, 50, 50);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 20));
		btn5.setBounds(74, 195, 50, 50);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 20));
		btn6.setBounds(136, 195, 50, 50);
		frame.getContentPane().add(btn6);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Dialog", Font.BOLD, 18));
		btnSub.setBounds(198, 195, 50, 50);
		frame.getContentPane().add(btnSub);

		// ----------------- Row 4 -----------------------------------

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 20));
		btn1.setBounds(12, 255, 50, 50);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 20));
		btn2.setBounds(74, 255, 50, 50);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 20));
		btn3.setBounds(136, 255, 50, 50);
		frame.getContentPane().add(btn3);

		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "*";
			}
		});
		btnMulti.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMulti.setBounds(198, 255, 50, 50);
		frame.getContentPane().add(btnMulti);

		// ----------------- Row 5 -----------------------------------

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Dialog", Font.BOLD, 20));
		btn0.setBounds(12, 315, 50, 50);
		frame.getContentPane().add(btn0);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDot.setBounds(74, 315, 50, 50);
		frame.getContentPane().add(btnDot);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String answer;
				n2 = Double.parseDouble(txtDisplay.getText());
				if (operation == "+") {
					result = n1 + n2;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}

				else if (operation == "-") {
					result = n1 - n2;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}

				else if (operation == "*") {
					result = n1 * n2;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}

				else if (operation == "/") {
					result = n1 / n2;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}

			}
		});
		btnEqual.setFont(new Font("Dialog", Font.BOLD, 18));
		btnEqual.setBounds(136, 315, 50, 50);
		frame.getContentPane().add(btnEqual);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Dialog", Font.BOLD, 20));
		btnDiv.setBounds(198, 315, 50, 50);
		frame.getContentPane().add(btnDiv);

		JLabel lblCreatedBySj = new JLabel("Created By Sanjay");
		lblCreatedBySj.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCreatedBySj.setBounds(67, 364, 186, 32);
		frame.getContentPane().add(lblCreatedBySj);

	}
}
