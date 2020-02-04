package Class20Modifires;

public class Task2 {

	public static void main(String[] args) {
	Task2 obj=new Task2();
	System.out.println(obj.isPalindrome("Dad"));
	}
public boolean isPalindrome(String word) {
	boolean result=true;
String reverse="";
for (int i =word.length()-1;i>=0;i--) {


if(reverse.equalsIgnoreCase(word)) {
	result= true;
}else{
	result= false;
}

}
return result;
}}
