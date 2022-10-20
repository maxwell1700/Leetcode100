package PlusOne;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
    int [] ans = {9,9};

        System.out.println(Arrays.toString(plusOne(ans)));
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length - 1;

        for (int i = n; i >= 0 ; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int [] newDigits = new int[digits.length + 1]; // populates empty spaces with 0's
        newDigits[0] = 1;


        return newDigits;
    }
}
