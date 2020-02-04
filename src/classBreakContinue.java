
public class classBreakContinue {

	public static void main(String[] args) {
		
		
		
		
		
		for (int i = 0; i <= 10; i++) {
			if (i == 2) {
				break; // ----->here break will stop the loop at this point if i==2
			}
			System.out.println(i);

		}
		System.out.println("-------------------");
			//if(i==3){
//continue ------->skip --print all numbers except 3(skip current iteration)

		System.out.println("---------------");
//print numbers from 1-20 except 5,6,7

		for (int j = 1; j <= 20; j++) {
			if (j == 5 || j == 6 || j == 7) {
				continue;
			}
			System.out.println(j);
		}
	}

}
