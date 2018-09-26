package com.iks.education.calculator.gui.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.iks.education.calculator.auxiliary.Operator;
import com.iks.education.calculator.controller.CalculatorController;
import com.iks.education.calculator.gui.CalculatorGUI;

@SuppressWarnings("serial")
public class OperatorButton extends JButton {

	public OperatorButton(Operator operator) {
		super();
		setBackground(Color.lightGray);
		setText(operator.symbol);
		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String displayText = CalculatorController.getInstance().appendOperator(operator.symbol);

				CalculatorGUI.termDisplayField.setText(displayText);
			}
		});
	}

}
