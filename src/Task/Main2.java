package Task;

public class Main2 {

	public static void main(String[] args) {
Main2 obj=new Main2();
String str= obj.makeThreeSubstr("Syntax",0,3);
System.out.println(str);


	}
	String makeThreeSubstr(String word,int startIndex,int endIndex ){
		 
	String str="";
	word=(word.substring( startIndex, endIndex ));
		  for(int i=1;i<=3;i++) {
			str=str.concat(word);  
		  }
		 return str;
		  
}}
