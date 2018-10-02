package com.iks.education.calculator.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpressionModelTest {

	@Test
	void initialIntermediateResultShouldBeFive() {
		double expected = 5;
		ExpressionModel expr = new ExpressionModel();
		expr.calculatePrepareExpression(new NumberModel("5"), "+");
		
		double actual = expr.getIntermediateResult();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void show3AfterSubstract5From8() {
		double expected = 3;
		
		ExpressionModel expr = new ExpressionModel();
		expr.calculatePrepareExpression(new NumberModel("8"), "-");
		expr.calculatePrepareExpression(new NumberModel("5"), "-");

		double actual = expr.getIntermediateResult();
		
		assertEquals(expected, actual);
	}

}
