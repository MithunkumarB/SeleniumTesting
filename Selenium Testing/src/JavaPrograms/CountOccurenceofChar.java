package JavaPrograms;

public class CountOccurenceofChar {

	public static void main(String[] args) {
		
		// COUNT HOW MANY TIME a PRESENT IN THIS STRING
		
		String str = "Java Programming Selenium automation";
		
		int totallength = str.length();
		
		int afterremove_a = str.replace("m", "").length();
		
		System.out.println("Count Occurence of Char:" + (totallength-afterremove_a));
		
		

	}

}
