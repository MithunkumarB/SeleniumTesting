package JavaPrograms;

public class ReverseEachWordofStrig {

	public static void main(String[] args) {
		
		String str = "Java Programming Application";
	
		String[] words = str.split(" "); // SPLIT STRING TO WORDS
		
		String reverse= "";
		
		for(String w:words)
		{
			String reverseword = "";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword = reverseword + w.charAt(i);
			}
			
			reverse = reverse+reverseword+" ";
		}
		
		System.out.println(reverse);
	}

}
