
public class OddNumber2Way {

	public static void main(String[] args) {
// print odd number from 20-50 in 2 ways
for(int i =21;i<=50;i++) {
	//if(i%2!=0) {
	System.out.println(i);

	//another way
	for (int j=20;j<=50;j++) {
		if(j%2==1) {
			System.out.println(j);		
		}
	}
}
	}

}
