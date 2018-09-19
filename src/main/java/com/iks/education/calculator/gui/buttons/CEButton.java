package com.iks.education.calculator.gui.buttons;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class CEButton extends JButton {

	public CEButton() {
		super();
		setText("CE");
		addActionListener(event -> System.out.println("CEButton clicked"));
	}

}
