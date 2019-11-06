
public class d2aaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean isSquare=true;
		 
			int[][] a2d = {
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
			};
	 //should be true
		
	for(int row = 0; row < a2d.length; row++){
	for(int col = 0; col <a2d[row].length; col++) {
		if(a2d.length != a2d[row].length) {
		isSquare = false;
		
		}
		}
	    
	}
		
	System.out.println(isSquare);

	
	}

}
