package com.iks.education.calculator.gui.buttons;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class CButton extends JButton {

	public CButton() {
		super();
		setText("C");
		addActionListener(event -> System.out.println("CButton clicked"));
	}

}
