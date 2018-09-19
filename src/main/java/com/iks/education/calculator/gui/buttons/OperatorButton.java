package com.iks.education.calculator.gui.buttons;

import java.awt.Color;

import javax.swing.JButton;

import com.iks.education.calculator.auxiliary.Operator;

@SuppressWarnings("serial")
public class OperatorButton extends JButton {

	public OperatorButton(Operator operator) {
		super();
		setBackground(Color.lightGray);
		setText(operator.symbol);
		addActionListener(event -> System.out.println(operator.symbol + " button clicked"));
	}

}
