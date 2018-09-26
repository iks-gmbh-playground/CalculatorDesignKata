package com.iks.education.calculator.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.iks.education.calculator.controller.CalculatorController;
import com.iks.education.calculator.model.NumberModel;

class CalculatorTest {
	
	CalculatorController calc = CalculatorController.getInstance();

	@Test
	void displayOneInInputWhenOneIsClicked() {
		//Arrange
		
		//Act
		String actual = calc.appendDigit("1");
		
		//Assert
		assertEquals("1", actual);
	}
	
	@Test
	void justAcceptOneComma() {
		//Arrange
		calc.appendDigit("1");
		calc.appendComma();
		
		//Act
		String actual = calc.appendComma();
		
		//Assert
		assertEquals("1,", actual);
	}
	
	@Test
	void displayThierteenInInputWhenOneAndThreeIsClicked() {
		//Arrange
		calc.appendDigit("1");
		
		//Act
		String actual = calc.appendDigit("3");
		
		//Assert
		assertEquals("13", actual);
	}
	
	@Test
	void displayZeroCommaWhenCommaIsClickedBeforeAnyNumber() {
		//Arrange
		
		//Act
		String actual = calc.appendComma();
		
		//Assert
		assertEquals("0,", actual);
	}
	
	@Test
	void displayZeroCommaThreeWhenCommaIsClickedBeforeAnyNumberAndThenThreeIsClicked() {
		//Arrange
		calc.appendComma();
		
		//Act
		String actual = calc.appendDigit("3");
		
		//Assert
		assertEquals("0,3", actual);
	}
	
	@Test
	void displayTogglePlusMinus() {
		//Arrange
		calc.appendDigit("1");
		//Act
		String actual = calc.toggleSign();
		
		//Assert
		assertEquals("-1", actual);
		
		actual = calc.toggleSign();
		
		assertEquals("1", actual);
	}
	
	@Test
	void testCleanInput() {
		//Arrange
		calc.appendDigit("1");
		
		//Act
		String actual = calc.cleanInput();
		
		//Assert
		assertEquals("0", actual);
	}
	
	@Test 
	void isZeroAtInitialization() {
		//Assert
		assertEquals(new NumberModel("0"), calc.getNumberModel());
	}
	
	@Test
	void removeLastDigit () {
		//Arrange
		calc.appendDigit("1");
		calc.appendDigit("2");


		//Act
		String actual = calc.deleteLastElement();

		//Assert
		assertEquals("1", actual);
	}
	
	@Test
	void displayZeroWhenLastDigitIsDeleted () {
		//Arrange
		calc.appendDigit("1");
		String actual = calc.deleteLastElement();
		assertEquals("0", actual);

		//Act
		actual = calc.deleteLastElement();

		//Assert
		assertEquals("0", actual);
	}	
	
	@Test
	void avoidIndexOutOfBoundsExceptionWhenDeleting () {
		//Arrange
		calc.appendDigit("1");
		String actual = calc.deleteLastElement();

		//Act
		actual = calc.deleteLastElement();

		//Assert
		assertEquals("0", actual);
	}
	
	@Test
	void termDisplayFieldShouldDisplayValueAndOperator() {
		//Arrange
		calc.appendDigit("1");
		calc.appendDigit("2");
				
		//Act
		String actual = calc.appendOperator("+");

		//Assert
		assertEquals("12+", actual);
	}
	
	@AfterEach
	void cleanUp() {
		calc.cleanInput();
	}
	
	

}
