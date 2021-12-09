package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = { 4, 40, 80, 2000, 2004 })
	public void Should_return_true(int year) {
		Calendar c = new Calendar(year);
		assertTrue(c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = { 3, 45, 346, 2001, 2345 })
	public void Should_return_false(int year) {
		Calendar c = new Calendar(year);
		assertFalse(c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = { 4, 40, 80, 2000, 2004 })
	public void Should_return_if_year_is_leap(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		assertTrue(gc.isLeapYear(year));
	}

	@ParameterizedTest
	@ValueSource()
	public void boundary_test(int lowest, int highest) {
		
	}
}
