
public class Computer1 {
	String name, brand;
	int memory, ram;
	boolean keyboard;

	// define behavior , actions
	void playGame() {
		// method body
		System.out.println("I can play on my +name");
	}

	void javaCoding() {
		System.out.println("I can do javaCoding on my" + name);
	}

	void watchMovie() {
		System.out.println("I can watch movie on my" + name);
	}

	// Use main method for code execution.
	public static void main(String[] args) {

// if we want to execute write our Object below

		Computer1 comp1 = new Computer1();
		comp1.name = "Apple";
		comp1.brand = "MacBook Pro";
		comp1.memory = 250;
//accessing behavior for 1 object
		comp1.javaCoding();
		comp1.watchMovie();
		comp1.playGame();

		System.out.println("I have" + comp1.brand + " " + comp1.name);

		System.out.println("creating 2 object of computer type-----");
		// execution always start from main method
		Computer1 com2 = new Computer1();
		
		com2.name = "Dell";
		com2.brand = "420";
		com2.memory = 125;
//accessing behavior for 2 object		
		com2.javaCoding();
		com2.watchMovie();
		com2.playGame();
	}
}
