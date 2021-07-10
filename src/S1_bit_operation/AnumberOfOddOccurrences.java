
package S1_bit_operation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AnumberOfOddOccurrences {

	//在一个数组中，只有一个数字出现奇数次，其余都出现偶数次，找到他！
	public static int findOddOccurrencesNumber(int[] arr) {

		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res ^= arr[i];
		}
		return res;
	}

	//在一个数组中，只有两个数字出现奇数次，其余都出现偶数次，找到他们！
	public static void findTwoOddOccurrencesNumber(int[] arr) {

		int res = 0; //所有数亦或之后的结果即两个结果的亦或

		for (int i = 0; i < arr.length; i++) {
			res ^= arr[i];
		}

		int tmp = res & (-res);//找到最后面一位的“1”

		int res1 = 0;
		//把整组数分成了两类
		for (int i = 0; i < arr.length; i++) {
			if ((tmp & arr[i]) == 0)
				res1 ^= arr[i];
		}

		System.out.println(res1);

		System.out.println(res ^ res1);
	}

	//哈希表方法------时间复杂度较差！
	public static void findOddOccurrencesNumberUseMap(int[] arr) {

		Map<Integer, Integer> amap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int count = amap.containsKey(arr[i]) ? amap.get(arr[i]) : 0;
			amap.put(arr[i], count + 1);
		}

		Iterator<Map.Entry<Integer, Integer>> it = amap.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, Integer> a = it.next();
			if (a.getValue() == 1)
				System.out.println(a.getKey());
		}
	}

	public static void main(String[] args) {

		int[] arr1 = {1, 1, 56, 56, 48, 18, 18, 23, 23};

		int[] arr2 = {1, 1, 56, 56, 48, 48, 48, 23, 23, 23, 18, 18, 49, 49, 49, 49};

		System.out.println(findOddOccurrencesNumber(arr1));

		findTwoOddOccurrencesNumber(arr2);

		findOddOccurrencesNumberUseMap(arr1);
	}
}
