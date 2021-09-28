package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
/*		String str = "Selenium";
		StringBuffer sb = new StringBuffer();
		StringBuffer rev = sb.append(str).reverse();
		System.out.println(rev);                       */
		
		String str = "Selenium";
		
		int len = str.length();
		
		String rev = "";
		
		for(int i=len-1; i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}

		System.out.println(rev); 
		
	}

}
