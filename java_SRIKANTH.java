
// A Java program to find the distinct substring of a string 
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class java_SRIKANTH {

	public static void main(String[] args) {
		
		String N = "a!2a!2";		//given string
		NABTest(N);					//calling NABTest() 
		
	}

	// implementation of NABTest() method 
	//passing the given String 
	public static void NABTest(String N) {
		
		int count = 1;							//To count number of substrings
		Set<String> words = new TreeSet<>();	//Set to store the unique substrings

		for (int lengthOfN = 1; lengthOfN < N.length(); lengthOfN++) {
			
			count++;
			int i = 0, j = i + lengthOfN;
			
			Set<String> tempSet = new HashSet<>();		

			while (j <= N.length()) {
				
				if (!tempSet.add(N.substring(i, j))) {	//checks the string 
					words.add(N.substring(i, j));		// add each substring to set
				}
				i++;
				j = i + lengthOfN;
			}	//end of while loop
		}		//end of for loop
		
		System.out.println(count + " Distinct Substrings in String "+N);	//prints the Distinct Substrings
		System.out.print("Substrings are: ");	
		
		for (Object obj : words) {
			System.out.print(obj + ", ");
		}	//end of for loop
		
	}		//end of main
	
}			//end of class java_SRIKANTH