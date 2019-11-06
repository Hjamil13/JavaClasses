import java.util.Scanner;

public class PublicClassApple2 {
	public static void main(String[] args) {
	int day=6;
	if(day>=1 && day<=5){
		System.out.println("it is a weekday");	
	} else if (day>=6 && day<=7) {	
		System.out.println("it is weekend");
	} else {
		System.out.println("Invalid day");	
	}
	
	int height =5;
	if (height>5&&height==5) {
	System.out.println("short");
	} else if(height>5&&height<6) {
		System.out.println("medium");
	} else {
		System.out.println("The person i tall");	
	}
	
	System.out.println("enter age" );
	Scanner scan=new Scanner(System.in);
	int age=scan.nextInt();
	
	
	if(age>=1&&age<3) {
	System.out.println("you are a baby");
	}else if(age>=3&&age<=5) {
		System.out.println("you are a toddler");
	}else if(age>5&&age<=12) {
		System.out.println("you are a kid");
	}else if(age>12&&age<=19) {	
		System.out.println("you are a teenager");
	}else if(age>19) {
		System.out.println("you are adult");
		
	}else {
		System.out.println("i dont know");	
	}
	
System.out.println("please enter score");
Scanner Scan1=new Scanner(System.in);
int score=Scan1.nextInt();

if(score>=90) {
System.out.println("grade=A");
}else if(score>=70&&score<90) {
System.out.println("grade=B");
}else if(score>=50&&score<70) {
System.out.println("grade=C");
}else if(score<50) {
System.out.println("grade=F");
}else {
System.out.println("no score");	
}
		
boolean isRain=false;
if(!isRain) {
System.out.println("in class");
}else {
System.out.println("online");	
}
	
		
	}}



