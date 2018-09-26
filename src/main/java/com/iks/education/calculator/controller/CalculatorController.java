package com.iks.education.calculator.controller;

import com.iks.education.calculator.model.NumberModel;

public class CalculatorController {

	private NumberModel numberModel = new NumberModel("0");
	private static CalculatorController instance;
	
	private CalculatorController() {
		
	}
	
	public static CalculatorController getInstance() {
		if (instance == null) {
			instance = new CalculatorController();
		}
		return instance;
	}
	
	public String appendDigit(String digit) {
		return numberModel.appendDigit(digit);
	}

	public String appendComma() {
		return numberModel.appendComma();
	}

	public String cleanInput() {
		return numberModel.cleanInput();
	}

	NumberModel getNumberModel() {
		return numberModel;
	}

	public String toggleSign() {
		return numberModel.toggleSign();
	}

	public String deleteLastElement() {
		
		return numberModel.deleteLastElement();
	}

	public String appendOperator(String operator) {
		return numberModel.getValue() + operator;
	}

}
