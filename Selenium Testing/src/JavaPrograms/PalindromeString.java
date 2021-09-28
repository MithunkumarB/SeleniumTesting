package JavaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
		
		String Org_str = str;
		
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(Org_str.equals(rev))
		{
			System.out.println("The String is Palindrome");
		}
		else
		{
			System.out.println("The String is NOT Palindrome");
		}

	}

	}


