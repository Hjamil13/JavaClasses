
public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=5;a--) {
		
			System.out.print(" *");
		}
		System.out.println();
		{
		for(int b=1;b<=a;b++)
			System.out.print(" *");
	}

}}
