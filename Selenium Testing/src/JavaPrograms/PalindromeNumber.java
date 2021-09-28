package JavaPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		int Org_num = num;
		
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(Org_num == rev)
		{
			System.out.println("The Number is Palindrome");
		}
		else
		{
			System.out.println("The Number is NOT Palindrome");
		}

	}

}
