package dsa.binarySearch;

public class BitsManupulation {

	public static void main(String[] args) {

		//Right shift by 1 = divide by 2 to given int 
		
		
		    int number = 100;
	      
		    System.out.println("number :"+number);
	        int Ans = number >> 1;
	        System.out.println("divide by 2 using right shift single:"+Ans);
	        
	        
	        // left shift operator / multiple by 2 when shifted by 1 bit 
	        
	        Ans = number<<1;
	        System.out.println("multiply by 2 with one left shift :"+Ans);
	        
	        
	       // checking odd even without % operator using bitwise operator
	        int oddOrEven=36;
	        if( (oddOrEven& 1)==0) System.out.println("even number");
	        else System.out.println("odd number");
	        
	        //swap 2 numbers using bitwise operator 
	        
	        int a=5,b=7;
	        a = a^b; 
	        b = a^b;
	        a=  a^b;
	        
	        System.out.println("after swapping :a ="+a + " b="+b);
	}

}
