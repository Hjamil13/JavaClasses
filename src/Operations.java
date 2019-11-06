import java.util.Scanner;

public class Operations {
public static void main(String []args) {

System.out.println("please inter the month");
Scanner scan=new Scanner(System.in);
String month=scan.nextLine();
      

String season = "gggg";

if (month.equals("January") || month.equals("February") || month.equals("December")){
	season="winter";

	
}else if (month.equals("March")|| month.equals("April") || month.equals ("May")) {
	season=("spring");
	
	
}else if (month.equals ("June") ||month.equals("July")||month.equals("august")) {
		season=("summer");	
}else if (month.equals("September")|| month.equals("October")||month.equals("November")) {
			season=("fall");
		}else {
			System.out.println("unknown");			
			
		
			System.out.println(season);
			System.out.println("you were born in" +month);
		}
	
	




}

}
