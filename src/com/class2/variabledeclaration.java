package com.class2;

public class variabledeclaration {

	public static void main(String []args) {
		int num1=123;
		int num2=6767;
		long num3=78684888;
		char num4='A';
		
		//2. declare variable first and then assign value
		int n1;
		int n2;
		int n3;
		n1=5;
		n2=6767;
		n3=767;
		
		//3. declare all variable together and then assign value 
		int number1,number2,number3;
		number1=12;
		number2=15;
		number3=676;
		
		System.out.println(n1);
		
		boolean var=true;
		System.out.println(var);
		
		char myvariable;
		myvariable='*';
		System.out.println(myvariable);
		
		number2=number1;//12
		System.out.println(number2);
		
		// number2=fails;-->compile time error asking to change datatype of
		//variable number 2 to boolean
		
		
		boolean isRain=fales;
		boolean isSnow;
		isSnow=isRain;//isSnow=false
		System.out.println();
		
		
		
		
		
		
		
		System.out.println();
		
		
	}
}