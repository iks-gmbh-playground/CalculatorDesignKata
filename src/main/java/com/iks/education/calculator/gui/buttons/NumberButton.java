package com.iks.education.calculator.gui.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.iks.education.calculator.controller.CalculatorController;
import com.iks.education.calculator.gui.CalculatorGUI;

@SuppressWarnings("serial")
public class NumberButton extends JButton {

	public NumberButton(String text) {
		super();
		setText(text);
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String displayText = CalculatorController.getInstance().appendDigit(text);
				
				CalculatorGUI.inputField.setText(displayText);
			}
		});
	}

}
