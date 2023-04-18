package String;

import java.util.*;

public class lettetCom {

    //Problem Statement :::Letter Combinations leetcode

//    Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//
//    A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


    static Map<Character,String> map = new HashMap<>();
    static{
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<String>();
        }
        List<String> result = new ArrayList<>();
        if (digits.length() == 1) {
            String s = map.get(digits.charAt(0));
            for (int i = 0; i < s.length(); i++) {
                result.add(s.charAt(i) + "");
            }
            return result;
        }
        List<String> list = letterCombinations(digits.substring(1, digits.length()));
        String s = map.get(digits.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < list.size(); j++) {
                result.add(s.charAt(i) + list.get(j));
            }
        }
        return result;
    }

 public List<String> letterCombinationss(String digits){   //submitted answer

     LinkedList<String> ans = new LinkedList<String>();
     if(digits.isEmpty()) return ans;
     String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
     ans.add("");
     while(ans.peek().length()!=digits.length()){
         String remove = ans.remove();
         String map = mapping[digits.charAt(remove.length())-'0']; //'0' in this case is has a unicode value of 48
         for(char c: map.toCharArray()){
             ans.addLast(remove+c);
         }
     }
     return ans;


 }









}
