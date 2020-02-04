package lesson;

public class student {          //(METHODS)
// this class contain variables.
	int age;
	int id;
	String name;
	
	//now we will set values to out methods. 
	//by click source and choose getters and setters ,first click on one variable and go to source again and then click selectAll, now java will creat 
	//getters and setters for our values
	//int id;
	public int getId() {    //get value of id use getId
		return id;
	}
	public void setId(int id) { //assign value to id use setId
		this.id = id;
	}//String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}//int age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
