
public class Qutions {

	private static String o;

	public static void main(String[] args) {

		String str = "Hello world";
		System.out.println(str.length());
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println("---------------------");

		String str1 = "Dad";
		String reverse = "";
		for (int a = str1.length()- 1;a>=0;a--) {
			reverse =reverse + str1.charAt(a);
		}
		if(str1.equals(reverse)) {
			System.out.println( "true");
		}else {
			System.out.println("fales");
		}
	

System.out.println("-----------------");
String st="hello";
String st1="world";
String st2 = st.concat(st1);
System.out.println(st2);

System.out.println("----------------------");
String m="hello world";
System.out.println(m.indexOf('o'));

System.out.println(m.charAt(1));

System.out.println("--------------");
String g="Hello world";
System.out.println(g.compareTo("hELLO"));
System.out.println("--------------------");
String k="hello world";
System.out.println(k.contains("el"));
System.out.println("--------------");
System.out.println(k.endsWith("l"));
System.out.println("---------------");
String n="hello world";
System.out.println(k.toUpperCase());
}}