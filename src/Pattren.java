
public class Pattren {

	public static void main(String[] args) {
		int h=4;
		int w=4;
		for (int i = 0; i < h; i++) 
        { 
            System.out.println(); 
            for (int j = 0; j < w; j++) 
            { 
                // Print @ if this is first  
                // row or last row. Or this 
                // column is first or last. 
                if (i == 0 || i == h-1 || 
                    j== 0 || j == w-1) 
                   System.out.print("*"); 
                else
                   System.out.print(" "); 
            } 
		}
}}