package com.iks.education.calculator.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberModelTest {

	@Test
	void testGetValueAsDoubleReturnStringAsDouble() {
		//Arrange
		String input = ""+Math.PI;
		double expected = Math.PI;
		NumberModel numberModel = new NumberModel(input);
		
		//Act
		double actual = numberModel.getValueAsDouble();
		
		//Assert
		assertEquals(expected, actual);
	}

}
