package String;

import java.util.*;

public class WordBreakii {

    // Word Break II. Algorithm Question
// This problem is very similar to Word Break. Instead of using a boolean array to track
//the match positions, we need to track the actual words. Then we can use depth first
//search to get all the possible paths, i.e., the list of strings.
//The Following diagram shows the structure of the tracking array.

    public static void main(String[] args) throws Exception {

    }

    public static List<String> wordBreakii(String s, Set<String> dict){
    List<String> dp[] = new ArrayList[s.length()+1];
    dp[0] = new ArrayList<>();
      for(int i=0; i<s.length(); i++){
        if(dp[i] == null)
            continue;
        for(String word:dict){
            int leng = word.length();
            int end = i + leng;
            if (end > s.length()) {
                continue;
            }
            // comparision between s and word in the Set dictionary
            if(s.substring(i, end).equals(word)){
                if (dp[end] == null){
                    dp[end] = new ArrayList<String>();
                }
                dp[end].add(word); //inside the end Arraylist we are adding words into it.


            }
        }
    }
    List<String> result = new LinkedList<String>();


if(dp[s.length()] == null)  //arraylist for s.length()?
            return result;


    ArrayList<String> temp = new ArrayList<String>();
    dfs(dp, s.length(), result, temp);
      return result;
}


    // DEPTH-FIRST SEARCH Implementation.
    private static void dfs(List<String>[] dp, int end, List<String> result, ArrayList<String> tmp) {
        if(end <= 0){
            String path = tmp.get(tmp.size()-1);
            for(int i = tmp.size()-2; i >=0; i--){
                path += " " + tmp.get(i);  // algorithm to add space
            }
            result.add(path);
            return;
        }
        for(String str: dp[end]){
            tmp.add(str);
            dfs(dp, end-str.length(), result, tmp); //recursive code
            tmp.remove(tmp.size()-1);
        }
    }





}
