
public class PublicClassHomeWork {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Do you  have credit card? true or fale");

		boolean cc = input.nextInt();
		if (cc) {
			System.out.print("What is the balance on your card?");
			int balance = Input.nextInt();
			if (balance > 1000) {
				System.out.print("Please pay off your balace");
			} else {
				System.out.print("you can spend more mony");
			}
		} else {
			System.out.print("Woud you like to apply for credit card");
		}
	}

}
