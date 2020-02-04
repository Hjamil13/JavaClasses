package IQ;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello world";
        System.out.println(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }

	}

}
