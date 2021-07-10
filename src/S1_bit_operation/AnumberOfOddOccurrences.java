
package S1_bit_operation;

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
    public static void findTwoOddOccurrencesNumber(int[] arr){

        int res = 0; //所有数亦或之后的结果即两个结果的亦或

        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }

        int tmp = res&(-res);

    }
    public static void main(String[] args) {

        int[] arr1 = {1,1,56,56,48,18,18,23,23};

        System.out.println(findOddOccurrencesNumber(arr1));

    }
}
