package com.iks.education.calculator.model;

import java.util.ArrayList;
import java.util.List;

public class CalculatorModel implements Observable {
	private String value = "";
	private List<Observer> observerList = new ArrayList<>();
	private double intermediateResult = 0.0;
	private String operator = "+";
	private String log = "";
	
	public CalculatorModel(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public String appendDigit(String digit) {
		value = ("0".equals(value)) ? digit : (value + digit); 
		notifyObservers();
		return value;
	}

	public String appendComma() {
		value = (value.contains(",")) ? value : value + ",";
		notifyObservers();
		return value;
	}

	public String clearValue() {
		value = "0";
		notifyObservers();
		return value;
	}

	public String toggleSign() {
		value = (value.charAt(0)=='-') ? value.substring(1) : "-" + value;
		notifyObservers();
		return value;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalculatorModel other = (CalculatorModel) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	public String deleteLastDigit() {
		if(value.length()>1)
			value = value.substring(0, value.length()-1);
		else
			value = "0";
		notifyObservers();
		return value;
	}

	double getValueAsDouble() {
		value = value.replace(',', '.');
		return Double.parseDouble(value);
	}

	
	public double getIntermediateResult() {
		return intermediateResult;
	}

	String getOperator() {
		return operator;
	}
	
	public void calculateIntermediateResult(CalculatorModel value, String operator) {
		this.log = this.log + value.getValue() + operator;
		this.intermediateResult = evaluate(value.getValueAsDouble());
		this.operator = operator;
	}
	
	private double evaluate(double valueAsDouble) {
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

	public String getLog() {
		return this.log ;
	}
	
	@Override
	public void register(Observer obs) {
		observerList.add(obs);
	}
	

	@Override
	public void unregister(Observer obs) {
		observerList.remove(obs);
	}
	
	private void notifyObservers() {
		for (Observer observer : observerList) 
			observer.notifyOfChange();
	}

}
