package dsa.bitwiseManupulation;

public class BitsManupulation {

	public static void main(String[] args) {

		//bitsOperatorPlay();
		bitMaskingAndProblems();

}

	private static void bitMaskingAndProblems() {
		/**
		 * BIt masking usually ANDing or ORing 1 bit to existing bits 
		 * used in INSTA filters pixel masking 
		 */
		
		
		//find ith bit 
		
		int n=85;//      110110
		int i=5;
		
		int mask = 1 << i; //0000100000 = left shifting till ith position then do & if non zero then its 1 else 0
		
		System.out.println("Int to Bits n="+n+"/"+Integer.toBinaryString(n));
		System.out.println("mask n="+Integer.toBinaryString(mask));
		System.out.println("mask after ith left shift:"+mask);
		
		if( (n & mask)!=0) {
			System.out.println("5th bit is=1");
		}else System.out.println("5th bit is 0");
		
		
		// set ith bit means set 1 at ith location , we can do using OR and left shift masking
		int ans = (n| mask);
		
		System.out.println("5th location set to 1 ans ="+Integer.toBinaryString(ans));
		
		// clear ith bit  mask with left shift by i , then invert then anding.
		//Clear bit mean 1 to 0 and if 0 no change
		
		n=87; i=4;
		mask = ~(1<<i);
		ans = n & mask;
		
		System.out.println("Int to Bits n="+n+"/"+Integer.toBinaryString(n));
		System.out.println("mask n="+Integer.toBinaryString(mask));
		
		System.out.println(" ans="+ans + " in bit :"+Integer.toBinaryString(ans));
		
	}

	private static void bitsOperatorPlay() {
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
        
        
        
        // Initial values
         a = 5;
         b = 7;
 
        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));
 
        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));
 
        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println("~a = " + ~a);
 
        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
}
		
	}
