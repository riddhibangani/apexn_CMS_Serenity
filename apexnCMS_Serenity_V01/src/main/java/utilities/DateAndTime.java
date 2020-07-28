package utilities;



import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;

public class DateAndTime {

	static Faker faker = new Faker();




	public static void main(String[] args) 
	{


		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");

		String date1 = sdf.format(faker.date().future(89, TimeUnit.DAYS));

		System.out.println(date1);
		
		String date2  = sdf1.format(faker.date().future(500, TimeUnit.MINUTES));
		System.out.println(date2);

	}
}


