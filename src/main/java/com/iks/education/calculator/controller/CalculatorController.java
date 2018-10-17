package com.iks.education.calculator.controller;

import com.iks.education.calculator.model.CalculatorModel;

public class CalculatorController {

	private CalculatorModel numberModel = new CalculatorModel("0");
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
		return numberModel.clearValue();
	}

	public CalculatorModel getNumberModel() {
		return numberModel;
	}

	public String toggleSign() {
		return numberModel.toggleSign();
	}

	public String deleteLastElement() {
		
		return numberModel.deleteLastDigit();
	}

	public String appendOperator(String operator) {
		numberModel.calculateIntermediateResult(numberModel, operator);
		numberModel.clearValue();
		return numberModel.getLog();
	}

}
