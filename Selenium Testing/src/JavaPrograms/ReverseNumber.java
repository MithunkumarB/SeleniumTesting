package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("The Reverse Numver is:" + rev);  
		
		
		//Approach-II

	/*	StringBuffer sb = new StringBuffer(String.valueOf(num)); // convert number to string formet
		StringBuffer rev2 = sb.reverse();
		System.out.println("The Reverse Numver is:" + rev2);    */
		
		
		//Approach-III
	/*	StringBuilder sbuil = new StringBuilder();
		StringBuilder rev3 = sbuil.append(num).reverse();
		System.out.println("The Reverse Number is:" + rev3);   */
	}

}
