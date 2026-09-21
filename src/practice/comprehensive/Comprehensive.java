package practice.comprehensive;

import java.util.Arrays;
import java.util.List;

public class Comprehensive {

    public static void main(String[] args) {
        // Stream 3 題
        System.out.println("1. " + sumEven(Arrays.asList(1, 2, 3, 4, 5, 6)));            // 12
        System.out.println("2. " + toUpperList(Arrays.asList("duke", "levi", "amy")));  // [DUKE, LEVI, AMY]
        System.out.println("3. " + countLongerThan(Arrays.asList("a", "bb", "ccc"), 1)); // 2

        // String 3 題
        System.out.println("4. " + reverse("duke"));                 // ekud
        System.out.println("5. " + isPalindrome("level"));           // true
        System.out.println("6. " + countChar("banana", 'a'));        // 3

        // Regex 4 題
        System.out.println("7. " + isEmail("duke@gmail.com"));       // true
        System.out.println("8. " + isPhone("0912345678"));           // true
        System.out.println("9. " + extractNumbers("a1b2c3"));        // [1, 2, 3]
        System.out.println("10. " + maskEmail("duke@gmail.com"));    // d***@gmail.com
    }

    // 1. 回傳串列中所有偶數的和
    static int sumEven(List<Integer> nums) {
        // TODO
        return 0;
    }

    // 2. 把所有字串轉成大寫，回傳 List
    static List<String> toUpperList(List<String> strs) {
        // TODO
        return null;
    }

    // 3. 回傳長度大於 n 的字串數量
    static long countLongerThan(List<String> strs, int n) {
        // TODO
        return 0;
    }

    // 4. 反轉字串
    static String reverse(String s) {
        // TODO
        return null;
    }

    // 5. 判斷是否為迴文
    static boolean isPalindrome(String s) {
        // TODO
        return false;
    }

    // 6. 計算字元 c 在字串 s 中出現幾次
    static int countChar(String s, char c) {
        // TODO
        return 0;
    }

    // 7. 驗證 email 格式
    static boolean isEmail(String email) {
        // TODO
        return false;
    }

    // 8. 驗證台灣手機格式（09 開頭 + 8 碼數字）
    static boolean isPhone(String phone) {
        // TODO
        return false;
    }

    // 9. 從字串中抽出所有數字，回傳 List<Integer>
    //    例如 "a1b2c3" → [1, 2, 3]
    static List<Integer> extractNumbers(String s) {
        // TODO
        return null;
    }

    // 10. 把 email 的 @ 前面部分，除了第一個字元外，全部變成 *
    //     例如 "duke@gmail.com" → "d***@gmail.com"
    static String maskEmail(String email) {
        // TODO
        return null;
    }
}
