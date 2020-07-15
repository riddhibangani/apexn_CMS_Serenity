package utilities;

import java.util.Date;

import com.github.javafaker.Faker;

public class DateAndTime {
	
	static Faker faker = new Faker();
	static Date now = new Date();
    static Date then = new Date(now.getTime() + 1000);
	
	String name = faker.name().fullName();
	
	
//	Date date = faker.date().between(now, then);
	
	public static void main(String[] args) {
		
		DateAndTime date = new DateAndTime();
		
		Date date1 = faker.date().between(now, then);
		
		for (int i =0; i< 1000; i++)
		{
		System.out.println(date1);
		}
	}
	
}
	

    