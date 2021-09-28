package JavaPrograms;

import java.util.Random;

import org.apache.commons.exec.util.StringUtils;

import net.bytebuddy.utility.RandomString;

public class GenerateRandomNumberandString {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int random_int = rand.nextInt(1000); // UPTO 999 ONLY GENERATE
		System.out.println(random_int);
		
		//Approach-II
		
		double random_double = rand.nextDouble(); // UPTO 999 ONLY GENERATE
		System.out.println(random_double);
		
		
		
		String random_str =  RandomStringUtils.randomAlphabetic(10);
		System.out.println(random_str);

	}

}
