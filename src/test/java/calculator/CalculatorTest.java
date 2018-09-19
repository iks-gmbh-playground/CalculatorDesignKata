package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iks.education.calculator.controller.CalculatorController;

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
		calc.appendDigit(",");
		
		//Act
		String actual = calc.appendDigit(",");
		
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
		String actual = calc.appendDigit(",");
		
		//Assert
		assertEquals("0,", actual);
	}
	
	@Test
	void displayZeroCommaThreeWhenCommaIsClickedBeforeAnyNumberAndThenThreeIsClicked() {
		//Arrange
		calc.appendDigit(",");
		
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
		String actual = calc.appendDigit("+-");
		
		//Assert
		assertEquals("-1", actual);
		
		actual = calc.appendDigit("+-");
		
		assertEquals("1", actual);
	}
	
	@Test
	void testCleanInput() {
		//Arrange
		calc.appendDigit("1");
		
		//Act
		String actual = calc.cleanInput();
		
		//Assert
		assertEquals("", actual);
	}
	
	@AfterEach
	void cleanUp() {
		calc.cleanInput();
	}

}
