
 publicClassApple {
	import java.util.Scanner;
	class Main {
	    public static void main(String[] args){
	    
	    System.out.print( "Please Enter First Name");
	    
	    Scanner scan =new Scanner(System.in);
	      
	       String FIRST_NAME =scan.nextLine();
	        
	       System.out.println("Please Enter Surname");
	       String LAST_NAME =scan.nextLine();
	      System.out.println(FIRST_NAME+' '+LAST_NAME);
}}
