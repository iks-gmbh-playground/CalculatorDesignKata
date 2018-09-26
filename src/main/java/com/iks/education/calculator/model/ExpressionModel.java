package com.iks.education.calculator.model;

public class ExpressionModel {
	private String expression = "";
	private int result = 0;
	
	public String appendExpression(NumberModel value, String operator) {
		expression += value.getValue() + operator;
		return expression;
	}
}
