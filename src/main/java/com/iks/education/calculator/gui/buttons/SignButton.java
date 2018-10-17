package com.iks.education.calculator.gui.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.iks.education.calculator.controller.CalculatorController;

@SuppressWarnings("serial")
public class SignButton extends JButton {

	public SignButton() {
		super("+-");
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 CalculatorController.getInstance().toggleSign();
			}
		});
	}

}
