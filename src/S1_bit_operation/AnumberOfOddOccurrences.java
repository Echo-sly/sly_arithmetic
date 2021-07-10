package S1_bit_operation;

public class AnumberOfOddOccurrences {

    //在一个数组中，只有一个数字出现奇数次，其余都出现偶数次，找到他！
    public static int findOddOCcurrencesNumber(int[] arr) {

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,1,56,56,48,18,18,23,23};

        System.out.println(findOddOCcurrencesNumber(arr1));

    }
}
