package lesson;

public class myClass {

	//create  method in Class, and then create an object in Main and call this methods
	public static void main(String[] args) {
  student mark=new student();//----->object or instance
  // here we create an instance or object call mark for our class student.
  mark.setAge(15);        //mark.age=15;
  mark.setId(1);         //mark.id=1;
  mark.setName("mark"); //mark.name="mark";
 // System.out.println(mark.name+" "+"is"+" "+mark.age+" "+"years old");
  // now after change to get this value will change to bellow.
  System.out.println(mark.getName()+" "+"is"+" "+mark.getAge()+" "+"years old");
  
  student tom=new student();  //-----> 2 /second object or instance
  // here we create second 2 instance or object call tom for our class student.
  tom.setAge(14);           //tom.age=14;
  tom.setId(2);            //tom.id=2;
  tom.setName("tom");     //tom.name="tom";
 // System.out.println(tom.name+" "+"is"+" "+tom.age+" "+"years old");
  System.out.println(tom.getName()+" "+"is"+" "+tom.getAge()+" "+"years old");
	}

}
