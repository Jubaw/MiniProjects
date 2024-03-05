package alghorithms;

import java.util.HashMap;

public class FindRepeatedChars{
    public static void main(String[] args) {
        findRepeatedChars("Aka");


    }

    public static void findRepeatedChars(String word){

        word = word.replaceAll("[0-9]","").replaceAll("\\p{Punct}", "").replaceAll(" ", "").toLowerCase();
        char[] chars = word.toCharArray();
        HashMap<Character, Integer> charHash = new HashMap<>();

        for (Character w : chars){
            Integer numOfOccurance = charHash.get(w);
            if (numOfOccurance == null){
                charHash.put(w,1);
            }else{
                charHash.replace(w,numOfOccurance+1);
            }
        }
        System.out.println(charHash);
    }
}

