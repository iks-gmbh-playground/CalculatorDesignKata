package com.iks.education.calculator.gui.display;

import javax.swing.JTextField;

import com.iks.education.calculator.controller.CalculatorController;
import com.iks.education.calculator.model.CalculatorModel;
import com.iks.education.calculator.model.Observer;

@SuppressWarnings("serial")
public class TermDisplayField extends JTextField implements Observer {

	private CalculatorModel calculatorModel = null;
	
	public TermDisplayField() {
		calculatorModel = CalculatorController.getInstance().getNumberModel();
		calculatorModel.register(this);
		setEditable(false);
		setHorizontalAlignment(JTextField.RIGHT);
	}

	@Override
	public void notifyOfChange() {
		setText(calculatorModel.getLog());
	}

}
