package faizal2;
import java.util.*;
public class SortArray {
	public static void main(String[] args) {
		// Initializing the array
        Integer array[] = { 1, 2, 3, 4, 5 };
        // Sorting the array in descending order using Arrays.sort() ||[import java.util.*;]
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
	}
}

