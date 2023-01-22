package dsa.binarySearch;

/**
 * 
 * Binary Search various DSA problems 
 *
 */
public class BinarySearchProblems {

	public static void main(String[] args) {
			
	
			//floorSquareRootOfInt(20);
			//findFirstAndLastIndexOfKey();
			//findKeyInInfiniteSortedArray();
		int a = 10;
		int divideBy2 = a >> 1;
		 System.out.println("10 >> 1"+ divideBy2);
		}

	private static void findKeyInInfiniteSortedArray() {
		
		int[] array = {10,22,27,33,38,47,49,55,59,63,72,80,88,92,99,101,155};
		
		int key=101;
		System.err.println("seraching key in infinte sorted array:"+key);
		
		int low=0, high=1;
		
		while(array[high] < key) {
			System.out.println("Low="+low +" high="+high);
			low = high;
			high = 2* high; //increase pair search exponentially causing time to reduce 
		}
		
		int indexofKey=binarySerach(array,low,high,key);
		
		System.out.println("Key index in infinite sorted array:"+indexofKey);
		
	}

	private static int binarySerach(int[] array, int low, int high, int key) {
		
		System.out.println("Low="+low +" high="+high);
		int ans=-1;
		while (low<=high) {
			int mid = low + (high-low)/2;
			System.out.println("low: "+low + " high: "+high + " mid:"+mid);
			if(array[mid] == key) {
				ans=mid;break;
			}else if ( array[mid]< key) {
				low = mid+1;
			}else if (array[mid] > key) {
				high = mid-1;
			}
		}
		return ans;
	}

	private static void	findFirstAndLastIndexOfKey(){
		//modify inputs and key manually for playaround 
		
		int[] array = {1,1,1,2,2,5,5,5,6,7,8,8,9};
		
		int key=9;
		System.err.println("Finding first last index of key:"+key);
		System.err.println("first index of key: "+ key +" at array location:"+ helperBinarySearch(array,key,true));
		
		System.err.println("last index of key: "+ key +" at array location:"+ helperBinarySearch(array,key,false));

		
	}
	
	private static int helperBinarySearch(int[] array, int key, boolean isfirst) {
		int low=0, high=array.length-1;
		int ans=-1;
		if(isfirst)
			System.out.println("finding first index of key:"+key);
		else System.out.println("finding last index of key:"+key);
		
		
		while (low<=high) {
			
			int mid= low+(high-low)/2;
			System.out.println("low: "+low + " high: "+high + " mid:"+mid);
			if(array[mid] > key) {
				high = mid-1;
			}else if (array[mid] < key) {
				low = mid+1;
			}else {
				// store index in ans then check if isfirst or not then move low or high accordingly
				System.out.println("key found at :"+mid);
				ans = mid;
				if(isfirst) {
					high=mid-1;
					System.out.println("high = mid-1");
				}else {
					low = mid+1;
					System.out.println("low=mid+1");
				}
					
				
			}
			
		}
		
		return ans;
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
