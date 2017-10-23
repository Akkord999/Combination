package combination;

public class Combination_lib {
     public int getFactorial(int n) {
    	 int result = 1;
    	 int f;
    	 for (f = 1; f <= n ;f++) { 
    		 result *= f; 
    	 }
    	 return result;
     }
}
