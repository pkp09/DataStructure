package com.prashant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;

public class CalculatingAge {
	public static Date StringToDate(String dob) throws ParseException {
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date = formatter.parse(dob);
		System.out.println("Date object value: " + date);
		return date;
	}

	public static void main(String args[]) throws ParseException {
		// Reading name and date of birth from the user

		Scanner sc = new Scanner(System.in);
		boolean conti = true;
		while(conti) {
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your date of birth (dd-MM-yyyy): ");
		String dob = sc.next();
		// Converting String to Date
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = formatter.parse(dob);
		// Converting obtained Date object to LocalDate object
		Instant instant = date.toInstant();
		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
		LocalDate givenDate = zone.toLocalDate();
		// Calculating the difference between given date to current date.
		Period period = Period.between(givenDate, LocalDate.now());
		System.out.print("Hello " + name + " your current age is: ");
		System.out.println(
				period.getYears() + " years " + period.getMonths() + " Months and " + period.getDays() + " days");
		System.out.println("Do u want to continue : ");
		String st = sc.next();
		if(st.equals("Y"))
			conti = true;
		else
			conti = false;
		}
		sc.close();
	}
}