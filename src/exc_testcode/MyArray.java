package exc_testcode;

public class MyArray {

	private int[] array;
	private static int numOfArrays = 0;
	
	public MyArray(int size) {
		this.array = new int[size];
		numOfArrays++;
	}
	
	public MyArray(int[] elements) {
        this.array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            this.array[i] = elements[i];
        }
        numOfArrays++;
	}
	

    public int getElement(int index) {
        return array[index];
    }

    public int[] getArray() {
        return array;
    }

    public boolean equals(MyArray otherArray) {
        if (this.array.length != otherArray.array.length) {
            return false;
        }
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != otherArray.array[i]) {
                return false;
            }
        }
        return true;
    }

    public int maxI(int from, int to) {
        int maxIndex = from;
        for (int i = from + 1; i <= to; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int max() {
        return array[maxI(0, array.length - 1)];
    }

    public static int numOfArrayCreated() {
        return numOfArrays;
    }
}
