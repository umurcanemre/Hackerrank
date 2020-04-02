package minimumswaps;

public class Solution {

	static int minimumSwaps(int[] arr) {
		int counter =0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i] != i+1 ) {
				swap(i, arr);
				counter++;
			}
		}

		return counter;
    }
	
	private static void swap(int position, int[] arr) {
		int otherLocation = getLocation(position+1, arr);
		int temp = arr[position];
		arr[position] =  arr[otherLocation];
		arr[otherLocation] = temp;
	}

	private static int getLocation(int of, int[] arr) {
		for(int i=of; i< arr.length ; i++) {
			if(arr[i] == of) {
				return i;
			}
		}
		throw new IllegalStateException(of+" could not be found");
	}
}
