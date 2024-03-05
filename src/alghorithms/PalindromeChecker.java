package alghorithms;

public class PalindromeChecker {
    public static void main(String[] args) {
        palindrome("Aka");

    }

    public static void palindrome(String word) {
        String convertToOnlyWord = word.toLowerCase().replaceAll("[0-9\\p{Punct}]", "");
        boolean isPalindrome = true;
        for (int i = 0; i < convertToOnlyWord.length() /2; i++) {
            if (convertToOnlyWord.charAt(i) != convertToOnlyWord.charAt(convertToOnlyWord.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }

        }

        if (isPalindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
