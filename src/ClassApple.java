import java.util.Scanner;

public class ClassApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

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
					
				return;
					//System.out.println(season);
					//System.out.println("you were born in" +month);
				}
			
			

		System.out.println(season);
		System.out.println("you were born in " +month);


		}

		}


