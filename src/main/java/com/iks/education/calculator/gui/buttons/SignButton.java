package com.iks.education.calculator.gui.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.iks.education.calculator.controller.CalculatorController;
import com.iks.education.calculator.gui.CalculatorGUI;

@SuppressWarnings("serial")
public class SignButton extends JButton {

	public SignButton() {
		super("+-");
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String displayText = CalculatorController.getInstance().toggleSign();
				
				CalculatorGUI.inputField.setText(displayText);
			}
		});
	}

}
