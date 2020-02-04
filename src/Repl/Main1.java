package Repl;

public class Main1 {
	//Return Type: char
	//Method Name: getChar
	//Parameters:
	// String called "word"
	// Integer called "index"
char getChar(String word,int index) {
char str=0;
str=word.charAt(index);
//str=word;
return str;
}

	public static void main(String[] args) {
	Main1 obj=new Main1();
	char str=obj.getChar("hello",1);
	System.out.println(str);

	
	System.out.println("-------------------------");
	
	//String getChar(String str){
		   
		//  char character =str.charAt(1);
		 //  return str;
		// }
		 //a.getChar("holla",4),'a');
		// public static void main(String[]args){
		  // Main obj=new Main();
		    // char character =str.charAt(1);
		   //String str=obj.getChar("world");
		  // System.out.println(str.charAt(2));
		   
		// }
		//}
	}

}
