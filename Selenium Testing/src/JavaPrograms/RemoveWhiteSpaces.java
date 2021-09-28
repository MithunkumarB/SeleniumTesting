package JavaPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str = "Java       Programming          Selenium     automation";
		
		String str1 = str.replaceAll("\\s", "");
		
		System.out.println(str1);
		

	}

}
