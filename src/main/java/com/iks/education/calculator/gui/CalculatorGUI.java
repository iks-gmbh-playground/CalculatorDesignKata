package com.iks.education.calculator.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.iks.education.calculator.auxiliary.Operator;
import com.iks.education.calculator.gui.buttons.CButton;
import com.iks.education.calculator.gui.buttons.CEButton;
import com.iks.education.calculator.gui.buttons.DELButton;
import com.iks.education.calculator.gui.buttons.ExecuteButton;
import com.iks.education.calculator.gui.buttons.NumberButton;
import com.iks.education.calculator.gui.buttons.OperatorButton;
import com.iks.education.calculator.gui.display.InputField;
import com.iks.education.calculator.gui.display.TermDisplayField;

public class CalculatorGUI {

	private static final int WINODW_WIDTH = 400;
	private static final int WINODW_HEIGHT = 400;
	
	public static InputField inputField = new InputField();

	public void setupGUI() {
		JFrame window = new JFrame("Calculator");
		window.setSize(WINODW_WIDTH, WINODW_HEIGHT);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addDisplayArea(window.getContentPane(), BorderLayout.PAGE_START);
		addButtonArea(window.getContentPane(), BorderLayout.CENTER);

		window.pack();
		window.setVisible(true);
	}
	
	private void addButtonArea(Container contentPane, String position) {
		JPanel buttonPanel = new JPanel(new GridLayout(6, 4));
		buttonPanel.add(new OperatorButton(Operator.PERCENT));
		buttonPanel.add(new OperatorButton(Operator.SQUARE_ROOT));
		buttonPanel.add(new OperatorButton(Operator.SQUARE));
		buttonPanel.add(new OperatorButton(Operator.INVERSE));

		buttonPanel.add(new CEButton());
		buttonPanel.add(new CButton());
		buttonPanel.add(new DELButton());
		buttonPanel.add(new OperatorButton(Operator.DIVIDE));

		buttonPanel.add(new NumberButton("7"));
		buttonPanel.add(new NumberButton("8"));
		buttonPanel.add(new NumberButton("9"));
		buttonPanel.add(new OperatorButton(Operator.MULTIPLY));

		buttonPanel.add(new NumberButton("4"));
		buttonPanel.add(new NumberButton("5"));
		buttonPanel.add(new NumberButton("6"));
		buttonPanel.add(new OperatorButton(Operator.SUBTRACT));

		buttonPanel.add(new NumberButton("1"));
		buttonPanel.add(new NumberButton("2"));
		buttonPanel.add(new NumberButton("3"));
		buttonPanel.add(new OperatorButton(Operator.ADD));

		buttonPanel.add(new NumberButton("+-"));
		buttonPanel.add(new NumberButton("0"));
		buttonPanel.add(new NumberButton(","));
		buttonPanel.add(new ExecuteButton());

		contentPane.add(buttonPanel, position);
	}

	private void addDisplayArea(Container contentPane, String position) {
		JPanel displayPanel = new JPanel(new GridLayout(2, 1));
		displayPanel.add(new TermDisplayField());
		displayPanel.add(inputField);

		contentPane.add(displayPanel, position);
	}

}
