package AVLtree;

import java.util.List;

public class WordBreak {

    // Algorithm Question....Solved using trie....Perusal down below
    //but the answer pasted her first uses Dynamic-programming

    //Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
    //
    //Note that the same word in the dictionary may be reused multiple times in the segmentation.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "leetcode", wordDict = ["leet","code"]
    //Output: true
    //Explanation: Return true because "leetcode" can be segmented as "leet code".
    //Example 2:
    //
    //Input: s = "applepenapple", wordDict = ["apple","pen"]
    //Output: true
    //Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
    //Note that you are allowed to reuse a dictionary word.
    //Example 3:
    //
    //Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
    //Output: false
    //
    //
    //Constraints:
    //
    //1 <= s.length <= 300
    //1 <= wordDict.length <= 1000
    //1 <= wordDict[i].length <= 20
    //s and wordDict[i] consist of only lowercase English letters.
    //All the strings of wordDict are unique.




    public boolean wordBreak(String s, List<String> wordDict) {  //Verified answer
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }


    public boolean wordBreakI(String s, List<String> wordDict) {
        Trie trie = new Trie();
        for (String word : wordDict) {
            trie.insert(word);
        }
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            TrieNode node = trie.root;
            for (int j = i; j >= 1; j--) {
                char c = s.charAt(j - 1);
                int idx = c - 'a';
                if (node.children[idx] == null) {
                    break;
                }
                node = node.children[idx];
                if (node.isWord && dp[j - 1]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }





    class Trie {
        TrieNode root;
        public Trie() {
            root = new TrieNode();
        }
        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                if (node.children[idx] == null) {
                    node.children[idx] = new TrieNode();
                }
                node = node.children[idx];
            }
            node.isWord = true;
        }
        public boolean search(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                if (node.children[idx] == null) {
                    return false;
                }
                node = node.children[idx];
            }
            return node.isWord;
        }
    }




    class TrieNode {
        TrieNode[] children;
        boolean isWord;
        public TrieNode() {
            children = new TrieNode[26];
            isWord = false;
        }
    }


}
