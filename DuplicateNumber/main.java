package DuplicateNumber;

import java.util.Arrays;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,1};
        System.out.println((duplicateNumber(nums)));

    }

    static boolean duplicateNumber(int [] nums){

        HashMap<Integer, Integer> map = new HashMap<>();
              for(int n : nums){
           if(map.containsKey(n)){
              if(map.get(n)+ 1 >= 2){
                     return true;
                 }
                 map.put(n, map.get(n) + 1);
             }

             map.put(n,1);
         }

         return false;
    }
}
