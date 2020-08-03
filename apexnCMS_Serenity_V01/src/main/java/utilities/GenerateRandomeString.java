package utilities;

import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;

import com.github.javafaker.Faker;

public class GenerateRandomeString {

	public static String InstName = null;
	public static String InstBio = null;
	public static String InstName1 = null;
	public static String InstBio1 = null;
	
	public static String MscTitle = null;
	public static String MscTitle1 = null;
	
	public static String date = null;
	public static String time = null;

	
	public static String WrkTitle = null;
	public static String WrkDesc = null;
	public static String WrkTitle1 = null;
	public static String WrkDesc1 = null;

	public static int randomeInst = 0;
	public static int wrkduration = 0;
	
	public static Faker faker = new Faker();

	//Created for generating randome string for name and bio of instructor which is unique

	public static void randomestring()
	{

		InstName = faker.name().firstName();
		InstName1 = faker.name().firstName();
		
		InstBio = faker.expression("Description for the instructor " + InstName);
		InstBio1 = RandomStringUtils.randomAlphanumeric(20);
		
		MscTitle =faker.music().genre();
		MscTitle1 =faker.music().genre();
		
		WrkTitle = faker.harryPotter().character();
		WrkTitle1 = faker.harryPotter().character();
		
		wrkduration = faker.number().numberBetween(0, 4000);
		
		WrkDesc = faker.expression("Description for the workout " + WrkTitle);
		WrkDesc1 = faker.expression("Description for the workout " + WrkTitle1);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		date = sdf.format(faker.date().future(89, TimeUnit.DAYS));
		System.out.println(date);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
		time = sdf1.format(faker.date().future(500, TimeUnit.MINUTES));
		System.out.println(time);



	}

	public static int randomenumbers(int max)
	{

		randomeInst = faker.number(). numberBetween(0, max);
		return randomeInst;
	}
}
