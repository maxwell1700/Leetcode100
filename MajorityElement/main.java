package MajorityElement;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

    }

    public int majorityElement(int[] nums) { // for every number x there is a number y to cover it.. run loop to check which number isn't covered and return number i.e candidate
        int counter  = 1;
        int candidate = nums[0];

        for (int i = 1; i < nums.length ; i++) {
            if(counter == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                counter++;
            }else{
                counter--;
            }
        }
        return candidate;
    }
}
