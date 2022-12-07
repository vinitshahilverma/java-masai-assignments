
public class Main {
	
	public static int binarySearch(int low, int high,int k) {
		
		
		
		while(low<=high) {
			
			int mid = low +(high-low)/2;
			
			if(mid==k) {
				return 1;
			}
			else if(mid>k) {
				high=mid-1;
			}
			else {
				low = mid+1;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		
		int[] arr = {10,1,10,3,4};
		
		int low = 2;
		int high = 2;
		
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
		  count+=binarySearch(low,high,arr[i]);
		}
		System.out.println(count);
	}

}
