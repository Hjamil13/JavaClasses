
public class clasForLoop {

	public static void main(String[] args) {
	int sum=0;	
	
	for(int i=0;i<=20;i+=5)	{//0,5,10,15,20
	sum=sum+i;//sum--0,5,15,30,50

	System.out.println(sum);

	}
System.out.println("-------------------------");
int total=2;
for(int y=1;y<=3;y++) { //1,2,3---+1
	total=total*y;
//  total=2*1=2
//	total=2*2=4
	//total=4*3=12---now total=12		
	System.out.println(total);
}System.out.println("------------------------");

//write code to print even and odd number frome 1-20 with 2 output
int sumEven=0;
int sumOdd=0;
for(int j=1;j<=20;j++) {
	if(j%2==0) {
	sumEven=sumEven+j;	
	}else {
	sumOdd=sumOdd+j;	
	}
}System.out.println("total of even"+sumEven);
System.out.println("total of odd"+sumOdd);
}}

