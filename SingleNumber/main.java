package SingleNumber;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,2,7};

        System.out.println(nonDuplicate(arr));
    }

    static int nonDuplicate(int[]nums){ // wrong: if duplicate at the end ? and having issues returning answer
        /*if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }

        int ans = 0;
        for(int i = 0; i < nums.length; i++){
                ans = nums[i];
            for (int j = i +1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    break;
                }
            }
            return nums[i];
        }
        return -1;*/
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        HashMap<Integer, Integer>map = new HashMap<>();

        for(int n : nums){
            if(!map.containsKey(n)){
                map.put(n, 1);
            }else{
                map.put(n,map.get(n)+1);
            }
        }

        for(int n : nums){
            if(map.get(n) == 1){
                return n;
            }
        }

        return -1;
    }
}
