package Part3_MerageSort;

import java.util.Collection;


/**
 * Demo MergeSort
 *
 * @author sunlianyu
 * @date 2021/8/12 17:46
 */
public class MergeSort {

	public static void process(int[] arr, int L, int R) {
		if (L == R) {
			return;
		}
		int mid = L + ((R - L) >> 2);
		process(arr, L, mid + 1);
		process(arr, mid + 1, L);
		merge(arr, L, mid, R);
	}

	public static void merge(int[] arr, int l, int mid, int r) {
		int[] help = new int[r - l + 1];
		int i = 0;
		int p1 = l;
		int p2 = mid + 1;
		while (p1 <= mid && p2 <= r) {
			help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
		}
		while (p1 <= mid) {
			help[i++] = arr[p1++];
		}
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
	}

	public static void mergeSort2(int[] arr, int L, int R){



	}

}
