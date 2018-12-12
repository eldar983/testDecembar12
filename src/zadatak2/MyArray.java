package zadatak2;

public class MyArray {
	
	private int[] array;

	public MyArray() {

	}

	public MyArray(int[] niz) {
		this.array = niz;
	}

	public int getSmallestElement() {
		int smallestElement = array[0];
		for(int i = 1; i < array.length; i++) {
			if(smallestElement > array[i]) {
				smallestElement = array[i];
			}
		}
		return smallestElement;

	}

	public int getLargestElemet() {
		int LargestElemet = array[0];
		for(int i = 1; i < array.length; i++) {
			if(LargestElemet < array[i]) {
				LargestElemet = array[i];
			}
		}
		return LargestElemet;

	}

	public int sumAllElements() {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public void printAllElements() {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}

