package alghorithms;

import java.util.HashMap;

public class FindRepeatedWords {
    public static void main(String[] args) {

        findRepeatedWords("What are we if we are not we");

    }
    public static void findRepeatedWords(String word){

        String[] wordArray = word.toLowerCase().replaceAll("\\p{Punct}","").split(" ");

        HashMap<String, Integer> stringHash = new HashMap<>();

        for (String w : wordArray){
            Integer numOfOccurance = stringHash.get(w);
            if (numOfOccurance == null){
                stringHash.put(w,1);
            }else{
                stringHash.replace(w,numOfOccurance+1);
            }
        }
        System.out.println(stringHash);
    }
}
