package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comparing_Triplets {
 
	public static void main(String[] args) throws IOException { 
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		 
		 
				   String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" "); 
				   
				   
				   List<Integer> a = new ArrayList<>();  
				   
				   
				   for (int i = 0; i < 3; i++) {
			            int aItem = Integer.parseInt(aItems[i]);
			            a.add(aItem);
			        } 
				    
				   
				   a.forEach(System.out::print);
				   String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
				   
				   List<Integer> b = new ArrayList<>();

			        for (int i = 0; i < 3; i++) {
			            int bItem = Integer.parseInt(bItems[i]);
			            b.add(bItem);
			        } 
			        
			        b.forEach(System.out::print); 
			        
			        int bob=0;
		        	int Alice=0; 
			        for (int i = 0; i < b.size() && i<a.size(); i++) { 
			        	  
			        	
			        	
			        	
			        	if(a.get(i)> b.get(i)) {
			        		Alice +=1;
			        		
			        	} 
			        	else {
			        		bob +=1;
			        	}
			        	
			        
			        
	}   
			        System.out.println(Alice + " ---"+ bob);   
			      List<Integer> a1 =   compareTriplets(a, b);
 
			      a1.forEach(System.out::print);
			        
			        
			      
	}

	private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) { 
		
		int Alicepoints= ((a.get(0)>=b.get(0)?0:1)+(a.get(1)>=b.get(1)?0:1)+(a.get(2)>b.get(2)?0:1)); 
		int Bobpoints= ((a.get(0)<b.get(0)?0:1)+(a.get(1)<b.get(1)?0:1)+(a.get(2)<b.get(2)?0:1));
		 
	        System.out.println(Alicepoints+" is " +Bobpoints); 
	        
		   
		return Arrays.asList(Alicepoints,Bobpoints) ;
	}
}
