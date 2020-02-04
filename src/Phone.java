
public class Phone {
//iphone,Android,Nokia;	
	String name, brand;
	int memory;

	void playGame() {
		System.out.println("I can play game on my" + name);
	}

	void watchMovie() {
		System.out.println("I can watch movie on my" + name);
	}

	void typing() {
		System.out.println("I can typing on my" + name);
	
	}
// object1
	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.name = "iphone";
		ph.brand = "Android";
		ph.memory = 200;
		 System.out.println("I have "+ph.name+" "+ph.brand);
		// behavior.
		ph.playGame();
		ph.watchMovie();
		ph.typing();
        
		Phone ph2 = new Phone();
		ph2.name = "Nokia";
		ph2.brand = "xs";
		ph2.memory = 250;
		 System.out.println("I have "+ph.name+" "+ph.brand);
		// behavior.
		ph2.playGame();
		ph2.watchMovie();
		ph2.typing();
		System.out.println("-------------------");
		Phone ph3=new Phone();
		ph3.name="samsong";
		ph3.brand = "x7";
		ph3.memory=550;
		System.out.println("I have"+ph3.name+" "+ph3.brand);
		//behavior
		ph3.playGame();
		ph3.watchMovie();
		ph3.typing();
        System.out.println("--------------");
	}

}
