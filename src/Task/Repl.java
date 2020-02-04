package Task;

public class Repl {
	
//num1=10
	void mult(int num1,int num2) {
	int a = num1*num2;	
	System.out.println("multiplication " +""+a);	
	}
    void sum(int num1,int num3) {
    	int b=num1+num3;
    System.out.println("Addition" +" "+b);	
    }
    void sub(int num1,int num4) {
    	int c=num1-num4;
    System.out.println("Subtraction" +" "+c);
    	
    }	
    
	public static void main(String[] args) {
	Repl obj=new Repl();
	obj.mult(10,3);
	obj.sum(10,20);
	obj.sub(30,10);

	}

}
