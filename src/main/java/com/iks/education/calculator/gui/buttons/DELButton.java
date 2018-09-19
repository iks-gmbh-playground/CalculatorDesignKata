package com.iks.education.calculator.gui.buttons;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class DELButton extends JButton {

	public DELButton() {
		super();
		setText("DEL");
		addActionListener(event -> System.out.println("DELButton clicked"));
	}

}
