package main;

public class Calendar {

	int year;

	public Calendar(double year) {
		if (year!=(int) year)
			throw new IllegalArgumentException("YearMakesNoSense");
		this.year = (int) year;
	}

	public boolean isLeapYear() {
		if (year>=Integer.MAX_VALUE || year <=Integer.MIN_VALUE || year<0)
			throw new IllegalArgumentException("YearMakesNoSense");
		return (this.year > 0 && this.year % 4 == 0) && (this.year % 100 != 0 || this.year % 400 == 0);
	}
	
	
	
	
	
	
}
