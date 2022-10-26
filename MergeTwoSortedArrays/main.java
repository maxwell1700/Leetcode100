package MergeTwoSortedArrays;

public class main {
    public static void main(String[] args) {

    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        // m is the size of nums1 before merge
        //n is the size of nums2

        //currently leetcode says take nums1 size to be n + m to help with merge


        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
            while(j >=0){ // j is the smaller array so it would end first
                if(i >= 0 && nums1[i] >= nums2[j]){
                    nums1[k--] = nums1[i--]; // makes k = i first then shift both to the number on their left position
                }else{
                    nums1[k--] = nums2[j--];
                }
            }
    }

}
