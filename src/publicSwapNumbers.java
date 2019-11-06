
public class publicSwapNumbers {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		System.out.println("before swapping");
		System.out.println("value of num1 is : "+num1);
        System.out.println("value of num2 is :"+num2);
        
        //swap the value(num1,num2)
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swapping");
        System.out.println("value of num1 is :"+num1);
        System.out.println("value of num2 is :"+num2);
        
	}

}
