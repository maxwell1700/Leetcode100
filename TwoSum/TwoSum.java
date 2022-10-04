package TwoSum;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int [] input = {-1,-2,-3,-5,-10};
        System.out.println(Arrays.toString(twoSum(input,-8)));
    }

    static int[] twoSum(int[] nums, int target) {
        int [] ans = new int [2];

        for(int i = 0; i < nums.length; i ++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;

                }
            }
        }

        return ans;
    }
}
