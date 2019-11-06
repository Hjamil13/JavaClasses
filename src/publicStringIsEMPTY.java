
public class publicStringIsEMPTY {

	public static void main(String[] args) {
	// Create a String and if the String is not empty perform the following: 
		// if the String has an odd number of characters and has 3 or more characters,
		//print the character in the middle of the String.
		String str="hello";
		System.out.println(!str.isEmpty());
		int length=str.length();
		if(str.length() %2!=0 && str.length() >=3);
		System.out.println(str.substring(2));
		
		}

	}

//String str1="Hellourwewr";
//int lenght=str1.length();
//int middle=str1.length()/2;
//System.out.println();
//if(!str1.isEmpty()) {
//if(lenght%2!=0 && lenght>=3) {
//System.out.println(str1.charAt(middle));
