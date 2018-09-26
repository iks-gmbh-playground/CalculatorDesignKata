package com.iks.education.calculator.gui.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.iks.education.calculator.controller.CalculatorController;
import com.iks.education.calculator.gui.CalculatorGUI;

@SuppressWarnings("serial")
public class DELButton extends JButton {

	public DELButton() {
		super();
		setText("DEL");
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String displayText = CalculatorController.getInstance().deleteLastElement();
				
				CalculatorGUI.inputField.setText(displayText);
			}
		});
	}

}
