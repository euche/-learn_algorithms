/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.*;



/**
 *
 * @author Dell
 */
public class Groupanagrams {
    
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    
    static class Word{  // clss for dupilicate array...
       String anagramString;  //to store word itself
       int index;              //index of the word in the original array
       
       Word(String a, int b){// constructor
           this.anagramString = a;
           this.index = b;
       }
    }
    
    static class DupArray{
     Word[] array;  // Array of words
     int size; // size of Array
     
     //constructor
     public DupArray(String str[], int size){
         this.size = size;
         array = new Word[size];  //defining the array in hte constructor
         
         for(int i = 0;i < size; ++i){
         
             //copy each word from word to dup array in this constructor      
             array[i] = new Word(str[i],i); 
         } 
     }   
    }
    
    static class compareStrngs implements Comparator<Word>{
        @Override
        public int compare(Word o1, Word o2) {
         
            return o1.anagramString.compareTo(o2.anagramString);
            
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
    public static List<List<String>> groupAnagrams(String[] strs){
    
        List<List<String>> ews = new ArrayList<>();
        
        int size = strs.length;
        
     if(strs.length == 0){      // First Testcase
     
         return ews;
     }
     
     if(strs.length == 1){
     
         ews.add(Arrays.asList(strs[0]));   //Second Testcase
         
     return ews;
     }
     
     //SOLUTION FROM GEEKSFROMGEEKS  Create Custom classes WORD, and DUPARRAY(Duplicate array)and CompStr(to compare Strings)
     
     DupArray dupArray = new DupArray(strs,size);  // 1-> this line creates a copy of words in strs, and their indexes

     for(int y = 0; y < size; ++y){
     
        char[] char_arr = dupArray.array[y].anagramString.toCharArray();
        
        Arrays.sort(char_arr);                                      // 2-> Iterate through all words in dupArray and Sort Words
        dupArray.array[y].anagramString = new String(char_arr);
     
     }

     for(int i =0; i < size; ++i){
     
         ews.add(Arrays.asList(strs[dupArray.array[i].index]));
         
     }
     
  
    return ews;
    }
    
    
    
    
    
    
    
    public static List<List<String>> groupAnagrams(String[] strs,int a){   ///The Upper Solution doesnt work well
        
        // O(NM) Solution OPTIMAL 
          HashMap<HashMap<Character, Integer>,
                ArrayList<String> >
            map = new HashMap<HashMap<Character, Integer>,
                              ArrayList<String> >();
        for (String str : strs) {
            HashMap<Character, Integer>
                tempMap = new HashMap<Character, Integer>();
 
            // Counting the frequency of the
            // characters present in a string
            for (int i = 0; i < str.length(); i++) {
                if (tempMap.containsKey(str.charAt(i))) {
                    int x = tempMap.get(str.charAt(i));
                    tempMap.put(str.charAt(i), ++x);
                }
                else {
                    tempMap.put(str.charAt(i), 1);
                }
            }
 
            // If the same frequency of characters
            // are already present then add that
            // string into that arraylist otherwise
            // created a new arraylist and add that string
            if (map.containsKey(tempMap))
                map.get(tempMap).add(str);
            else {
                ArrayList<String>
                    tempList = new ArrayList<String>();
                tempList.add(str);
                map.put(tempMap, tempList);
            }
        }
 
        // Stores the result in a arraylist
        List<List<String> >
            result = new ArrayList<>();
        for (HashMap<Character, Integer>
                 temp : map.keySet())
            result.add(map.get(temp));
        
  
        
        return result;
        
        
    }
    
     public static List<List<String>> groupAnagramss(String[] strs){
     
         //MOST OPTIMAL SOLUTION
      List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char str[] = strs[i].toCharArray();
            // sort string
            Arrays.sort(str);
            String s = String.valueOf(str);
            
            
            
            if(map.get(s)!=null){
                List<String> a = map.get(s);
                a.add(strs[i]);
                map.put(s, a);
            }
            else{
                List<String> a = new ArrayList<>();
                a.add(strs[i]);
                map.put(s, a);
            }
        }
        for(Map.Entry<String, List<String>> en:map.entrySet()){
            res.add(en.getValue());
        }
        return res;
     
     
     
     
     
     }
    
    public static void main(String[] args){
        
        String wa[] = {"eat","tea","tan","ate","nat","bat"};
        groupAnagramss(wa);
        
    
    }
    
}
