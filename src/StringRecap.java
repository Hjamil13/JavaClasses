
public class StringRecap {

	public static void main(String[] args) {
		String str="Hello world";
		
		
		System.out.print(str.replaceAll(" ",""));

	
	System.out.println("---------------------");
	String str1="12he$#*&34";
	String  b=str1.replaceAll("[^A-z]", "");
	System.out.println(b);
	
	System.out.println(b.length());

	System.out.println("----------------------");
 String a="Is it saturday? Is it raining? Do we have a Java Class today?";
//” How would you find out how many sentences are in that String?
	String []array=str.split("",3);
	for(int i=0;i<array.length;i++);
	System.out.println(array[i]);
	}}