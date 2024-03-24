package alghorithms;

public class PalindromeChecker {
    public static void main(String[] args) {
        ispalindrome("Aka");
        System.out.println(isPalindrome(121));


    }


    public static boolean isPalindrome(Integer x) {
        int reverse = 0;
        int temp = x;
        if (x < 0) {
            return false;
        }
        while (temp > 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;

        }
        return reverse == x;


    }


    public static void ispalindrome(String word) {
        String convertToOnlyWord = word.toLowerCase().replaceAll("[0-9\\p{Punct}]", "");
        boolean isPalindrome = true;
        for (int i = 0; i < convertToOnlyWord.length() / 2; i++) {
            if (convertToOnlyWord.charAt(i) != convertToOnlyWord.charAt(convertToOnlyWord.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }

        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
