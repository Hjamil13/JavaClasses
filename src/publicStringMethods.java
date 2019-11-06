import java.util.Scanner;

public class publicStringMethods {

	//private static final String Systim = null;

	public static void main(String[] args) {
		
		//Mom’s first name? Mary
				//Dad’s first name? Daniel
				//Boy or Girl? boy
				//Suggested baby name: DANRY
		Scanner sc=new Scanner(System.in);
		String momFirstName ="Mary";
		String dadFirstName = "Daniel";
		String babyBoy="DANRY";
		String babyGirl="MAIEL";
		System.out.println("plese enter baby gender");
		String babyGender=sc.nextLine();
		if(babyGender.equals("boy")) {
			System.out.println("DANRY");

		}else {
			System.out.println("MAIEL");
		}

	}

}
