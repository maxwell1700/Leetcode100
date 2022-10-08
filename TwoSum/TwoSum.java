package TwoSum;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        int [] input = {-1,-2,-3,-5,-10};
        System.out.println(Arrays.toString(optTwoSum(-8,input)));
    }

    static int[] twoSum(int[] nums, int target) {
       // int [] ans = new int [2];
       // Stack<Integer> stack = new Stack<>();
        //Queue<Integer> q1 = new ArrayDeque<>();
        for(int i = 0; i < nums.length; i ++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){

                    return new int[] {i,j};
                   // ans[0] = i;
                   // ans[1] = j;
                   // return ans;

                }
            }
        }

        return null;
    }


    static int [] optTwoSum(int target, int [] arr){
        HashMap<Integer, Integer>map = new HashMap<>();

        for (int i = 0; i < arr.length -1 ; i++) {
            int diff = target - arr[i];
            map.put(diff,i);

            if(map.containsKey(arr[i])){

                return new int[]{map.get(arr[i]), i};
            }
        }
       return null;
    }
}
