package com.iks.education.calculator.auxiliary;

public enum Operator {
	ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/"), INVERSE("1/x", "1/", true), 
	SQUARE_ROOT("sqrt", "sqrt", true), SQUARE("sqr", "sqr", true), PERCENT("%");

	public final String symbol;
	public final String representation;
	public final boolean isUnary;

	Operator(String symbol) {
		this.symbol = symbol;
		this.representation = symbol;
		this.isUnary = false;
	}

	Operator(String symbol, String representation) {
		this.symbol = symbol;
		this.representation = representation;
		this.isUnary = false;
	}

	Operator(String symbol, String representation, boolean unary) {
		this.symbol = symbol;
		this.representation = representation;
		this.isUnary = unary;
	}

	@Override
	public String toString() {
		return representation;
	}

	public String toString(String operand) {
		if (isUnary) {
			return representation + "(" + operand + ")";
		}
		return toString();
	}
}
