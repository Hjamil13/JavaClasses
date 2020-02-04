
public class ObjectCarClass {

	public static void main(String[] args) {
	    // To create an object syntax is:

        //ClassName variableName=new ClassName();

        //Scanner scan=new Scanner(System.in);

        //String str=new String();

        //new keyword creates new object

        

        Car car1=new Car();  //car1 is a variable of type car cant be duplicated

        car1.make="Tesla";

        car1.model="S";

        car1.color="Black";

        car1.year=2020;

        car1.wheels=4;

        car1.windows=5;

        car1.speed=200;
        //accessing behavior for 1 object
        car1.start();// calling method start from class car
        car1.drive();
        car1.accelerate();
        

        Car car2=new Car();

        car2.make="BMW";

        car2.model="i8";

        car2.color="Purple";

        car2.year=2019;

        car2.wheels=4;

        car2.windows=6;

        car2.speed=200;
        car2.start();
        car2.drive();
       car2.accelerate();
        

        //print features of the car

        //I have black Tesla

        System.out.println("I have "+ car1.color+" "+car1.make);

        //I drive bmw  2019

        System.out.println("I drive "+car2.make+" "+car2.year);

        //I drive bmw but i want tesla

        System.out.println("I drive "+car2.make+" but i want "+car1.make);

        

        

        

    }

	

	}

//value of variable can change.
