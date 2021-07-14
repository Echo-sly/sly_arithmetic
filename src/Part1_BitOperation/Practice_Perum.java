package Part1_BitOperation;

public class Practice_Perum {
	public void pringArray(int [] arr,int n){
		// 打印数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public void swap(int [] arr,int i,int j){
		// 交换函数
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	// 对数组arr进行全排列
	public void perum(int [] arr,int p,int q ){
		// for循环将数组中所有的元素和第一个元素进行交换。然后进行全排列。
		// 递归结束条件
		if(p == q){
			//  一次递归结束。将整个数组打印出来
			pringArray( arr,q+1);
		}
		for(int i =p ;i <= q;i++){
			swap(arr,i,p);
			// 把剩下的元素都做全排列。

			perum(arr,p+1,q);
			// 然后再交换回去，数组还原，保证下一次不会有重复交换。
			swap(arr,i,p);
		}
	}

	public static void main(String[] args) {

		int arr[] ={1,2,3,4,5,6,7,8};
		Practice_Perum practice_perum = new Practice_Perum();
		practice_perum.perum(arr,0,arr.length-1);
	}
}