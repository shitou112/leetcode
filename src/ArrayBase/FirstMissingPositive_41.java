package ArrayBase;

/**
 * @author Qian Shaofeng
 *         created on 2017/12/1.
 */
public class FirstMissingPositive_41 {
    public int firstMissingPositive(int[] nums) {
        for (int i=0; i < nums.length; ++i){
            if (nums[i] > 0 && nums[i] < nums.length && nums[nums[i]-1]!=nums[i]){
                int tmp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tmp;
                --i;
            }
        }

        for (int i=0; i < nums.length; ++i){
            if (nums[i]!=i+1)
                return i+1;
        }

        return nums.length+1;
    }

    public static void main(String[] args) {
        FirstMissingPositive_41 fmp = new FirstMissingPositive_41();
        int[] nums = {};
        System.out.println(fmp.firstMissingPositive(nums));
    }
}
