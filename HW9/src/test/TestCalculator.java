package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
	    assertEquals(2, calculator.add(1, 1));
	}

	@ParameterizedTest
	@CsvSource(value = {"2,3" , "1,4"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		 assertEquals(5, calculator.add(valueOne, valueTwo));
		 
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		 assertEquals(2, calculator.sub(5, 3));
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		 assertEquals(6, calculator.multiply(2, 3));
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		 assertEquals(1, calculator.divide(1, 1));
		 
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		Throwable exception = assertThrows(ArithmeticException.class, () -> calculator.divide(0, 0) );
	}
}
