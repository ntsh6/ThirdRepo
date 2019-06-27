package loops;

public class ForLoop {

	public static void main(String[] args) {
	
		for (int i = 0; i < 5; i++) { 
			System.out.println(" value of i is" +"\t" +i);
			
		}
  
		System.out.println("----second loop ---"); 
		for (int i = 0; i <=5; i++) { 
			System.out.println(" value of i is" +"\t" +i);
			
		} 
		System.out.println("-------");
  String cities[]= {
		  "USA","FINLAND","DENMARK","AUSTRIA"};  
  for (int i = 0; i < cities.length; i++) { 
	  System.out.print(cities[i]+"\t");
	
} 
  System.out.println("en hanced for loop "); 
  for (String string : cities) { 
	  System.out.println(string);
	
}
  
  } 
	
		
	}


