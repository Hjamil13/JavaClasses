
public class publicRegularExpressions {

	public static void main(String[] args) {
		//Remove everything except text and numbers
		String str = "hello1234&*$*%";
		System.out.println(str.replaceAll("[^A-z-0-9]", ""));
		

	}

}
