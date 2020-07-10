package utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomeString {

	public static String InstName = null;
	public static String InstBio = null;
	public static String MscTitle = null;
	
	public static String InstName1 = null;
	public static String InstBio1 = null;
	public static String MscTitle1 = null;
	
	
	
	
	//Created for generating randome string for name and bio of instructor which is unique

			public static void randomestring()
			{
				InstName = RandomStringUtils.randomAlphanumeric(5);
				 InstBio = RandomStringUtils.randomAlphanumeric(20);
				 MscTitle = RandomStringUtils.randomAlphanumeric(6);
				 
				 InstName1 = RandomStringUtils.randomAlphanumeric(5);
				 InstBio1 = RandomStringUtils.randomAlphanumeric(20);
				 MscTitle1 = RandomStringUtils.randomAlphanumeric(10);
				 
				 
			}
}
