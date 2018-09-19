package com.iks.education.calculator.gui.buttons;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class ExecuteButton extends JButton {

	public ExecuteButton() {
		super();
		setText("=");
		addActionListener(event -> System.out.println("Execute button clicked"));
	}

}
