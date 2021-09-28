package JavaPrograms;

import java.util.HashSet;

public class FindDuplicatesinArray {

	public static void main(String[] args) {
		
		String str[] = {"java","C","C++","Python","java"};
		
		boolean flag = false;
		
		for(int i=0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length; j++) // i+1 FOR found next value of 0th position
			{
				if(str[i] == str[j])
				{
					System.out.println("Duplicate Elements is Found:"+str[i]);
					flag = true;
				}
				
			}
				
		}
		if(flag == false)	
		{
			System.out.println("No Duplicates Found");
		}
		
//APPROCH-II
		
		String str1[] = {"java","C","C++","Python","java"};
		
		HashSet <String> lang = new HashSet<String>(); //HASHSET RETURN BOOLEAN VALUES (DUPLICATES AVAILABLE MEANS RETURN FALSE VALUSE)
		
		for(String datas:str1)
		{
			if(lang.add(datas)==false);
		}
		
		System.out.println("Duplicates Found");
	}

}
