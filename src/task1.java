import java.util.Scanner;

public class task1 {
	 
	public static void main(String[] args) {
		
		double price;
		double discount;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Is there is a sale or no sale");
	boolean sale=scan.nextBoolean();
	//boolean sale=true;
	if(!sale) {
	System.out.println("Iam not shopping");	
	}else {
	
	
	System.out.println("check the price of the item");
	price=scan.nextDouble();
	
	if (price<20){
		discount =price*0.10;	
		System.out.println("apply 0.10");
	if (price<=20&&price>100);
	discount =price*0.02;
	System.out.println("apply 0.02");
	if (price<=100&&price>500) {
		discount =price*0.30;
		System.out.println("apply 0.30");
	}else {
		System.out.println("apply 0.50");
		discount =price*0.50;
	} }
	
	}
	
	}}
		
	
	
	
	
	


