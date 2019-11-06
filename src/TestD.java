import java.util.Scanner;

public class TestD {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
	  System.out.println("Enter the browser name to proceed further with execution");
	   String browser = sc.nextLine();
	   switch(browser){
	   case1 browser.equalsIgnoreCase "ChRoME" : System.out.println("Proceed with Chrome browser");break;
	    case2 browser.equalsIgnorCase"FireFOX": System.out.println("Proceed with Firefox browser"));break;
	    case3 "IE":  System.out.println("Proceed with IE browser");
	    break;
	    default: System.out.println("Invalid browser");
	   
	  }
	}

}
