package Part1_BitOperation;

import java.util.HashMap;

/**
 * Author:sunlianyu
 * 2021/7/14 19:49
 * 在一个数组中，只有一种树出现了 K次，其他数都出现了M次
 */

public class KM {
	//需保证arr中，只有一种数出现了K次，其他数都出现了 M次  && K<M,k>1
	public static int onlyKTimes(int[] arr, int k, int m) {
		int[] t = new int[32];
		for (int num : arr) {
			for (int i = 0; i < 32; i++) {
				t[i] += (num >> i) & 1;
			}
		}

		int ans = 0;
		for (int i = 0; i < 31; i++) {
			if (t[i] % m != 0) {
				ans |= (1 << i);
			}
		}
		return ans;
	}

	public static Integer onlyKTimesUsingHashMap(int[] arr, int k, int m) {
		HashMap<Integer, Integer> aHashMap = new HashMap<Integer, Integer>();

		for (int num : arr) {
			if (aHashMap.containsKey(num)) {
				aHashMap.replace(num, aHashMap.get(num) + 1);
			} else {
				aHashMap.put(num, 1);
			}
		}

		Integer ans = null;
		for (Integer ans1 :
				aHashMap.keySet()) {
			if (aHashMap.get(ans1).equals(new Integer(k))) {
				ans = ans1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {16, 16, 16, 9, 9, 9, 9, 1, 1, 1, 1, 5, 5, 5, 5, 23, 23, 23, 23};
		for (int j : arr) {
		}
		System.out.println(onlyKTimes(arr, 3, 4));
		System.out.println(onlyKTimesUsingHashMap(arr, 3, 4));
	}
}
