package com.iks.education.calculator.model;

public class ExpressionModel {
	private double intermediateResult = 0.0;
	private String operator = "+";

	public double getIntermediateResult() {
		return intermediateResult;
	}

	public String getOperator() {
		return operator;
	}
	
	public void calculatePrepareExpression(NumberModel value, String operator) {
		this.intermediateResult = evaluate(value.getValueAsDouble());
		this.operator = operator;
	}
	
	private double evaluate(double valueAsDouble) {
		/* ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine se = sem.getEngineByName("JS");
		String value = "8.0-5"; // <- Expression
		try {
			Double ergebnis = (Double) se.eval(value);
			return ergebnis.doubleValue(); 
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		return 0.0; */
		
		switch(operator) {
		case "+" :
			return intermediateResult + valueAsDouble;
		case "-" :
			return intermediateResult - valueAsDouble;
		case "/" :
			return intermediateResult / valueAsDouble;
		case "*" :
			return intermediateResult * valueAsDouble;
		default:
			return intermediateResult;
		}
			
	}

	public String getIntermediateResultAsString() {
		return Double.toString(this.intermediateResult);
	}

}
