
public class TasksNested {
	public static void main(String []args) {
	/* we need to check it student completed the quiz
	 * if yes-- good gob, if not-- not good
	 * *if they completed we will check score:
	 * *if more then 90	-- you get an A
	 * *if more then 80	-- you get an B
	 * anything below-- you should studay more*/
		
	boolean quiz=false;
	int score=89;
	if(quiz) {
	System.out.println("Good job!!!");
	if( score>90) {
		System.out.println("You got an A");
	}else if (score>80) {
		System.out.println("You got an B");
	}else {
		System.out.println("You should studay more");
	}
	}else {
		System.out.println("not good!!!");	
	}
	}
	
	}


