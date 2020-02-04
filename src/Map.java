import java.util.HashMap;
//task class 35
public class Map {

	public static void main(String[] args) {
HashMap<Integer,String>	map=new HashMap<Integer,String>();
map.put(1, "Google");
map.put(2, "Syntax");
map.put(3, "Google");
map.put(4, "Apple");
map.put(5, "Facebook");
map.put(6, "Apple");
map.put(7, "Instgram");
map.size();
System.out.println(map.size());
System.out.println(map);
map.replace(3, "Facebook");
System.out.println(map);
map.remove(7, "Instgram");
System.out.println(map);



	}

}
