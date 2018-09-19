package com.iks.education.calculator.controller;

public class CalculatorController {

	private String term = "";
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
		if ("+-".equals(digit)) {
			if (term.contains("-")) {
				term = term.replace("-", "");
			} else {
				term = "-" + term;
			}
		} else if (!appendComma(digit)) {
			term += digit;	
		}
		return term;
	}

	private boolean appendComma(String digit) {
		if (",".equals(digit)) {
			if (term.length() < 1) {
				term = "0,";
			} else if (!term.contains(",")) {
				term += ",";
			}
			return true;
		}
		return false;
	}

	public String cleanInput() {
		term = "";
		return term;
	}

}
