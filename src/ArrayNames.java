
public class ArrayNames {

	public static void main(String[] args) {
		String[] names = { "ALI", "SARA", "HELEN" };
		System.out.println(names[2]);

		//String k = "*";

		// 2WAY
		String[] name = new String[3];
		name[0] = "ALI";
		name[1] = "SARA";
		name[2] = "HELEN";
		System.out.println(names[2]);
		System.out.println("**********************************");

		String[] words = { "Java", "Saturday", "day", "coding","is" };
		System.out.println(words [1]+" "+ words[4]+" "+ words[0]+" "+words[3]+" "+words[2]);
	}

}
