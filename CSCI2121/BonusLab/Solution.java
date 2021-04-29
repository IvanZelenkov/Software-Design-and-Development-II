import java.util.Arrays;

/**
 * Do not copy your answers from online sources.
 * Doing so will have consequences on rest of your courseworks.
 */
 public class Solution {
    /**
     * Given a signed x, return x with its digits reversed. Example: 321 => 123
     * Example: -3210 => -123
     */
    public int reverseInt(int x) {
        int num = 0;
        while (x != 0) {
            num = num * 10 + x % 10;
            x = x / 10;

            // for example -7305

            // 1) num = (0 * 10) + (-7305 % 10) = 0 - 5 = -5
            //   x = -7305 / 10 = -730

            // 2) num = (-5 * 10) + (-730 % 10) = -50 + 0 = -50
            //   x = -730 / 10 = -73

            // 3) num = (-50 * 10) + (-73 % 10) = -500 - 3 = -503
            //   x = -73 / 10 = -7

            // 4) num = (-503 * 10) + (-7 % 10) = -5030 - 7 = -5037 <--- Answer
            //   x = -7 / 10 = 0

            //System.out.println(new StringBuffer(String.valueOf(x)).reverse());
        }
        return num;
    }

    /**
     * Given a non-empty array of decimal digits representing a non-negative
     * integer, increment one to the integer.
     *
     * Example: Input: digits = [1,2,3] Output: [1,2,4]
     *
     * Example: Input: digits = [1,2,9] Output: [1,3,0]
     */

    public int[] plusOne(int[] digits) {
        int element = digits.length - 1;
        int carryFlag = 1;

        if (digits[0] == 9) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            return newArray;
        } else {
            do {
                digits[element] += carryFlag;
                if (digits[element] >= 10) {
                    digits[element] -= 10;
                } else {
                    carryFlag = 0;
                }
                element--;
            } while ((carryFlag != 0) && (element >= 0));
            return digits;
        }
    }
}