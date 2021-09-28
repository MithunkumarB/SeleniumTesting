package JavaPrograms;

public class RemoveJunkandSpecialchar {

	public static void main(String[] args) {
		
		String str = "@#$!%&*%$#Java!@#$%$ Programming";
		
		// USING REGULAR EXPRESSION
		
		String str1 = str.replaceAll("[^a-zA-Z0-9]", ""); // ^char function(other then this a-zA-Z0-9)
		
		System.out.println("After remove junk and Specialchar:" + str1);
		
		
		

	}

}
