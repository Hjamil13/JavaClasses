package Repl;

public class Main {
String makeCapital(String word) {
//String str="";
word=word.toUpperCase();
//str=word;
return word;
}
	public static void main(String[] args) {
	Main obj=new Main()	;
	
	String str=obj.makeCapital("test");
	System.out.println(str);
		

	}

}
