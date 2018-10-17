package com.iks.education.calculator.gui.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.iks.education.calculator.controller.CalculatorController;

@SuppressWarnings("serial")
public class CEButton extends JButton {

	public CEButton() {
		super();
		setText("CE");
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CalculatorController.getInstance().cleanInput();
			}
		});
	}

}
