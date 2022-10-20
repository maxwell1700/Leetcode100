package binarysearch;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        int [] ans = {1,3,5,6};



       // searchInsert(ans,5);
    }
     static int searchInsert(int[] nums, int target) {
        // binary search

        int start = 0;
        int end = nums.length -1;
        while(start < end){

            int mid = end + (start - end)/2;

            if(target == mid){
                return mid;

            }else if(target < mid){

                end = mid - 1;

            }else if (target > mid){
                start = mid + 1;
            }
        }

        return nums[start];
    }


    }






