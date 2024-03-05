package alghorithms;

public class NonRepeatedCharFinder {

    public static void main(String[] args) {

        findFirstNonRepetitiveChar("aaaka");
    }


    public static void findFirstNonRepetitiveChar(String words) {
        for (int i = 0; i < words.length() - 1; i++) {
            if (words.charAt(i) != words.charAt(i + 1)) {
                System.out.println(words.charAt(i + 1));
                break;
            }
        }
    }
}