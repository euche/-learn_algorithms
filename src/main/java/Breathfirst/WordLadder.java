package Breathfirst;

import java.util.*;

public class WordLadder {

//    A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:
//
//    Every adjacent pair of words differs by a single letter.
//    Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
//    sk == endWord
//    Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.



//    Example 1:
//
//    Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
//    Output: 5
//    Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.

    // TAG Should ne under tree of string


    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int l = beginWord.length();
        Map<String, List<String>> map = new HashMap<>();
        for (String word : wordList) {
            for (int i = 0; i < l; i++) {
                String wildCard = word.substring(0, i) + "*" + word.substring(i + 1, l);
                map.computeIfAbsent(wildCard, k -> new ArrayList<>()).add(word);    //  computeIfAbsent for Map/hashmap  is used to compute value for a given key using the given mapping function, if key is not already associated with a value
                                                                                    // in this case, the arrow function check example here https://www.geeksforgeeks.org/hashmap-computeifabsent-method-in-java-with-examples/
            }
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(beginWord, 1));
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        while (!queue.isEmpty()) {
            Node removed = queue.remove();
            String word = removed.word;
            int currLevel = removed.level;
            for (int i = 0; i < l; i++) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1);
                for (String wildCard : map.getOrDefault(newWord, new ArrayList<>())) { //The getOrDefault(key, defaultValue) method of Properties class is used to get the value mapped to this key, passed as the parameter, in this Properties object. This method will fetch the corresponding value to this key, if present, and return it. If there is no such mapping, then it returns the defaultValue.
                    if (wildCard.equals(endWord)) {
                        return currLevel + 1;
                    }
                    if (!visited.contains(wildCard)) {
                        visited.add(wildCard);
                        queue.add(new Node(wildCard, currLevel + 1));
                    }
                }
            }
        }
        return 0;



    }








}
class Node {
    String word;
    int level;

    public Node(String word, int level) {
        this.word = word;
        this.level = level;
    }
}