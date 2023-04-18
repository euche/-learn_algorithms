package others;

import java.util.*;

public class MinGen {

    // Problem statement
//    A gene string can be represented by an 8-character long string, with choices from 'A', 'C', 'G', and 'T'.
//
//    Suppose we need to investigate a mutation from a gene string startGene to a gene string endGene where one mutation is defined as one single character changed in the gene string.
//
//    For example, "AACCGGTT" --> "AACCGGTA" is one mutation.
//    There is also a gene bank bank that records all the valid gene mutations. A gene must be in bank to make it a valid gene string.
//
//    Given the two gene strings startGene and endGene and the gene bank bank, return the minimum number of mutations needed to mutate from startGene to endGene. If there is no such a mutation, return -1.
//
//    Note that the starting point is assumed to be valid, so it might not be included in the bank.

    public int minMutation(String startGene, String endGene, String[] bank) {

        if (startGene.equals(endGene)) {
            return 0;
        }

        Set<String> bankSet = new HashSet<>(Arrays.asList(bank)); // hashset ,useful tool that allows you to store unique items and access in constant time, No duplicates values allowed
        char[] charSet = {'A', 'C', 'G', 'T'};
        int currLevel = 0;
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(startGene);
        visited.add(startGene);

        while(!queue.isEmpty()){   //while queue is not empty
            int size = queue.size();
            while(size-- > 0){   //while value from decreasing queue size is greater than 0
                String curr = queue.remove();  // get current value from queue
                if (curr.equals(endGene)) {
                    return currLevel;
                }

                char[] currCharArr = curr.toCharArray();   // convert current String to character array
                for (int i = 0; i < currCharArr.length; i++){
                    char old = currCharArr[i];
                    for (char c : charSet) {
                        currCharArr[i] = c;
                        String newGene = String.valueOf(currCharArr);
                        if(!visited.contains(newGene)&& bankSet.contains(newGene)){ // newGene is not present in visited and bankset contains newGene
                            queue.add(newGene);
                            visited.add(newGene);
                        }
                    }
                    currCharArr[i] = old;
                }
            }

            currLevel++;

        }

       return -1;
    }



}
//  int index1=0;
//        int size = bank.length;
//
//        if(index1 ==  startGene.length() ||index1 == endGene.length()){
//             return 0;
//        }
//
//        int count =0;
//        int iteration = 0;
//
//        while (iteration < size){
//
//            if(startGene.charAt(index1) == bank[iteration].charAt(index1)){
//
//                llloop(startGene,bank[iteration],index1,index1);
//            }else{
//
//                count++;
//            }
//
//
//
//
//
//
//        }
//
//
//
//
//
//
//
//    }
//
//    private int llloop(String s1,String s2,int index1,int index2){
//
//        return  llloop(s1,s2,index1+1,index2+1);
//    }