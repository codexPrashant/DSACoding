
public class BinarySearchProblems {

	public static void main(String[] args) {
			
	
			floorSquareRootOfInt(20);
		}

	private static void floorSquareRootOfInt(int i) {
	
		/**
		 * concept is As number increases square root also increases.
		 *  Square root of any number X is always less than X/2 
		 *   is square root of any positive number from 1 to N is always positive and in ascending order (i.e sorted array) 
		 *  e.g 	1 4 9 16 25 36 49 64 81 100
		 			1 2 3 4  5  6  7  8  9  10
		 			
		 			Finding sqroot of x:25
					low: 1 high: 12
					mid: 6 square of mid: 36
					low: 1 high: 5
					mid: 3 square of mid: 9
					low: 4 high: 5
					mid: 4 square of mid: 16
					low: 5 high: 5
					mid: 5 square of mid: 25
					Square Root of X :25 is :5
		 			
		 			20
		 			l=1 h=10 mid=5 square=25
		 			l=1 h=4  mid=3 square=9
		 			l=4 h=4  mid=4 square=16
		 			l=5 h=4 loop break answer stored is 4 which is floor value for square root of 20
		 			
		 */
		
		int x = 99;
		
		System.out.println("Finding sqroot of x:"+x);
		
		int low =1, high=x/2;
		
		int answer = 1;
		
		if (x==1){//edge case 
			System.out.println("square root of 1 is 1");
		} else{
		
			while (low<=high){
				int mid = low + ((high-low)/2);
				int square = mid*mid;
				
				System.out.println("low: "+low + " high: "+high);
				System.out.println("mid: "+mid + " square of mid: "+square);
				
				if(square > x){
					high = mid-1;
				}else if(square < x){
					answer= mid;
					low = mid +1;
					
				}else{
					// square is equal to x 
					answer=mid;break;
				}
				
				
			}
			System.out.println("Square Root of X :"+x +" is :"+answer);
		}
		
		
	}

}
