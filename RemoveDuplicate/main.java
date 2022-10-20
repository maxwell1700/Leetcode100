package RemoveDuplicate;

public class main {
    public static void main(String[] args) {

    }

    static int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int res = 1;
        for (int i = 1; i < nums.length ; i++) { // clean solution
            if(nums[i] != nums[i - 1]){
                nums[res] = nums[i];
                res++;
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length ; i++) { // doesnt remove duplicates
            for (int j = i + 1; j < nums.length ; j++) {
                if(nums[i] < nums[j] && nums[i] != nums[j]){
                    nums[i + 1] = nums[j];
                    count ++;
                    break;
                }
            }

        }
      return count;
    }
}
