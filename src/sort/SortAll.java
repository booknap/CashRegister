
package sort;

public class SortAll {
	public static void sort(Object[] a, Comparator cmp) {
		for (int i = 0; i < a.length - 1; i++) {
			int minPos = i;
			for (int j = i + 1; j < a.length; j++) {
				// Uses comparator interface to compare object arrays
				if (cmp.compare(a[j], a[minPos]) < 0) {
					minPos = j;
				}
			}
			Object temp = a[minPos];
			a[minPos] = a[i];
			a[i] = temp;
		}
	}
}