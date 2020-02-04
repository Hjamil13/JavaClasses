
public class DArray {

	public static void main(String[] args) {
		
//int[]numberlist= {2,3,5,7};
//for(int elemn:numberlist) {
	//System.out.println(elemn);
//}
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.Create an array on integers and calculate the sum of all elements in an array.Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
String[] cars= {"car1", "car2", "car3", "car4", "car5", "car6"};
        
        for (int a=0; a<cars.length; a++) {
            System.out.println(cars[a]);
        }
        for (String b:cars) {
            System.out.println(b);
        }
        System.out.println("********************************");
}




	int [] num= {4,5,9};
    int sum=0;
    for (int i=0; i<num.length; i++) {
        sum=sum+num[i];
        System.out.println(sum);	
        System.out.println("*************************");	
}
}

	
public class CapitalCountry {   
	public static void main(String[] args) {
}
        
        String [] country= {"Turkey", "USA", "Germany"};
        
        for(int i=0; i<country.length; i++) {
            
            switch(country[i]) {
            case "Turkey":
            System.out.println("Ankara");
            break;
            case "USA":
            System.out.println("Washington DC");
            break;
            case "Germany":
            System.out.println("Berlin");
            break;
            }
            System.out.println("********");
            
        for(String cap:country) {
            switch(country[i]) {
            case "Turkey":
            System.out.println("Ankara");
            break;
            case "USA":
            System.out.println("Washington DC");
            break;
            case "Germany":
            System.out.println("Berlin");
            break;
            }
            System.out.println(cap);
        }}
}  } 
        