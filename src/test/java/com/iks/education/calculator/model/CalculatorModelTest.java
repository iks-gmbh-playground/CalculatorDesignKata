package com.iks.education.calculator.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorModelTest {

	@Test
	void testGetValueAsDoubleReturnStringAsDouble() {
		//Arrange
		String input = "3,14";
		double expected = 3.14;
		CalculatorModel calculatorModel = new CalculatorModel(input);
		
		//Act
		double actual = calculatorModel.getValueAsDouble();
		
		//Assert
		assertEquals(expected, actual);
	}

	@Test
	void initialIntermediateResultShouldBeFive() {
		double expected = 5;
		String expectedLog = "5+";
		CalculatorModel calculatorModel = new CalculatorModel("0");
		calculatorModel.calculateIntermediateResult(new CalculatorModel("5"), "+");
		
		double actual = calculatorModel.getIntermediateResult();
		String actualLog = calculatorModel.getLog();
		
		assertEquals(expected, actual);
		assertEquals(expectedLog, actualLog);
	}
	
	@Test
	void show3AfterSubstract5From8() {
		double expected = 3;
		
		CalculatorModel calculatorModel = new CalculatorModel("0");
		calculatorModel.calculateIntermediateResult(new CalculatorModel("8"), "-");
		calculatorModel.calculateIntermediateResult(new CalculatorModel("5"), "-");

		double actual = calculatorModel.getIntermediateResult();
		
		assertEquals(expected, actual);
	}
}
