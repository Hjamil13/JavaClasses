package Class20Modifires;

public class Task {
//Create a method that will take 1 parameter as a String and return reversed String.
	//Method should be visibly only within same package.
	
	String reverseString(String name){
		String reverse ="";
		for (int i=name.length()-1;i>=0;i--) {
		reverse=reverse+name.charAt(i);
		
		}
		return reverse;}	
		public static void main(String[] args) {
			
	Task obj=new Task();
	String reverse=(obj.reverseString("hello"));
	System.out.println(reverse);
			
			
		
		
	


	
	

	}

}
