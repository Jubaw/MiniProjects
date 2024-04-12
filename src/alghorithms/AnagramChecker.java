package alghorithms;

import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {
        String[] strs = {"Flower", "flow", "flight"};

        //find the longest common prefix among 3

        System.out.println(longestCommonPrefix(strs));

    }


    public static String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v, String.CASE_INSENSITIVE_ORDER);
        String first = v[0].toLowerCase();
        String last = v[v.length - 1].toLowerCase();
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
