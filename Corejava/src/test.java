
class test {
    public static void main(String args[]) {
        test test1 = new test();
            System.out.println(test1.xyz(5));    
    }
    public int xyz(int num) {
        if(num == 1) {
        	 System.out.println(" a"); 
        	
        	 
        	return 1;  
        	
        }
        else return(xyz(num-1) + num);
    }
}