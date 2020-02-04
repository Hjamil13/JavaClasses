package Objects;

//Create a Class Main that should be a template for the DogClass. 
//In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
//Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
class Main{
	//attributes
	String breed,name,color;
	//behaviors
	 void bark(){
	 
	 }
	 void run(){
	 }	 
	 void play(){
		 
	 }
	 
	 public static void main(String[]arge) {
	Main Husky=new Main();
	Husky.breed="Husky";
	Husky.name="Tiger";
	Husky.color="White";
	
	Husky.bark();
	Husky.run();
	Husky.play();
	System.out.println(Husky.breed +" "+"can bark");
	System.out.println(Husky.breed +" "+"can run");
	System.out.println(Husky.breed +" "+"can play");
	//2 Object
	Main Bulldog=new Main();
	Bulldog.breed="Bulldog";
	Bulldog.name="Tom";
	Bulldog.color="black";
	
	Bulldog.bark();
	Bulldog.run();
	Bulldog.play();
	System.out.println(Bulldog.breed +" "+"can bark");
	System.out.println(Bulldog.breed +" "+"can run");
	System.out.println(Bulldog.breed +"can play");
	
	Main Labrador=new Main();
	Labrador.breed="Labrador";
	Labrador.name="max";
	Labrador.color="brown";
	
	Labrador.bark();
	Labrador.run();
	Labrador.play();
	System.out.println(Labrador.breed +"can bark");
	System.out.println(Labrador.breed +"can run");
	System.out.println(Labrador.breed +"can play");
	 }
	 
}