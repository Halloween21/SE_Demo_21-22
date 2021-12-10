package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.GregorianCalendar;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.Test;
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

	@Test
	public void boundary_test() {
		
		//Abfangen der Fälle, dass das Jahr entweder eine Kommazahl ist oder zu groß/klein
		Calendar c1 = new Calendar(Integer.MAX_VALUE+1);
		Throwable e = assertThrows(IllegalArgumentException.class, () ->c1.isLeapYear() );
		Throwable e2 = assertThrows(IllegalArgumentException.class, () ->new Calendar(0.5) );
		
	}
}
