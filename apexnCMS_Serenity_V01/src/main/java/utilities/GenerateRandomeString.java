package utilities;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;

import com.github.javafaker.Faker;

public class GenerateRandomeString {

	public static String InstName = null;
	public static String InstBio = null;
	public static String MscTitle = null;
	public static String Date = null;
	
	public static String InstName1 = null;
	public static String InstBio1 = null;
	public static String MscTitle1 = null;
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
				 MscTitle =faker.music().genre();
				 MscTitle1 =faker.music().genre();
				 WrkTitle = faker.harryPotter().character();
//				 WrkDesc = faker.leagueOfLegends().quote();
				 wrkduration = faker.number().numberBetween(0, 4000);
				 WrkDesc = faker.expression("Description for the workout " + WrkTitle);
				 
				 WrkTitle1 = faker.harryPotter().character();
				 WrkDesc1 = faker.expression("Description for the workout " + WrkTitle1);
				 
				 InstBio = RandomStringUtils.randomAlphanumeric(20);
				 InstBio1 = RandomStringUtils.randomAlphanumeric(20);
				 
				 

			}
			
			public static int randomenumbers(int max)
			{
				
				randomeInst = faker.number(). numberBetween(0, max);
				return randomeInst;
			}
}
