package junit;

import java.util.Arrays;

public class Calculator {
	public int divide(int n1, int n2) {
		return n1 / n2;
	}
	
	public int[] sortingArray(int[] array) {
		for(int i = 0; i < 1000000; i++) {
			Arrays.sort(array);
		}
		return array;
	}
}
