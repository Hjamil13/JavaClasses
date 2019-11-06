
public class HomeWorkG {

	public static void main(String[] args) {
	char[]grades= {'A','B','C','D','E','F'};
	System.out.println(grades[1]);

//	2Way
char[]scores=new char[6];
	scores[0]='A';
	scores[1]='B';
	scores[2]='C';
	scores[3]='D';
	scores[4]='E';
	scores[5]='F';
	//System.out.println();
	System.out.println(scores[1]);
	System.out.println("************************");
	
	double []value= {0.1,0.2,0.3,0.4,0.5};
	for(int i=0;i<value.length;i++) {
	System.out.print(value[i]+" ");
	System.out.println("******************************");
	
	String[] Countries= {"Iraq", "USA", "Jordan","France","Turkey"};
	for(int y=0;y<Countries.length;y++) {
		if(Countries[y].equals("Iraq")) {
			System.out.println("Bagdad");
		}else if(Countries[y].equals("USA")) {
			System.out.println("DC");
		}else if(Countries[y].equals("Jordan")) {	
			System.out.println("Amman");
		}else if(Countries[y].equals("France")) {
			System.out.println("Paris");
		}else if(Countries[y].equals("Turkey")) {
			System.out.println("Ankara");	
		}
	}
	}
	}

}
