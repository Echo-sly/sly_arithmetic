package leetCode;

/**
 * Demo demo0413numberOfArithmeticSlices
 *
 * @author sunlianyu
 * @date 10月06日 22:11
 */
public class demo0413numberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) {
            return 0;
        }
        int len = nums.length;
        int dp = 0;
        int sum = 0;
        int decrease = nums[1]-nums[0];
        int d2 = 0;
        for(int i = 2; i < nums.length ; ++i ){
            d2 = nums[i] - nums[i-1];
            if( d2 == decrease){
                sum += ++dp;
            }else{
                dp=0;
            }
            decrease=d2;
        }
        return sum;
    }
}
