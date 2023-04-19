package org.example;

import java.util.*;

public class FindingAnagrams {
    public static List<List<String>> getSearchResults(List<String> words, List<String> queries) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String word : words) {
            String sortedWord = sortString(word);
            List<String> anagramList = anagramMap.getOrDefault(sortedWord, new ArrayList<>());
            anagramList.add(word);
            anagramMap.put(sortedWord, anagramList);
        }

        List<List<String>> anagrams = new ArrayList<>();
        for (String query : queries) {
            String sortedQuery = sortString(query);
            List<String> queryAnagrams = anagramMap.getOrDefault(sortedQuery, new ArrayList<>());
            Collections.sort(queryAnagrams);
            anagrams.add(queryAnagrams);
        }
        return anagrams;
    }

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("duel", "speed", "dule", "cars", "lued", "elud");
        List<String> queries = Arrays.asList("spede", "deul");
        List<List<String>> result = getSearchResults(words, queries);
        System.out.println(result);
    }
}
