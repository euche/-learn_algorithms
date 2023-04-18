/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

/**
 *
 * @author Dell
 */
public class DeleteN {
    
    // Codility Question: Largest possible number by deleting given digit in this case, S = 5

    public static int solutioni(int N){
    
        //Optimal Solution
    
    String newNum = String.valueOf(N);
char c = '5';
StringBuilder sb1 = new StringBuilder( newNum );
StringBuilder sb2 = new StringBuilder( newNum );

int newGuess1 = Integer.parseInt(sb1.deleteCharAt(newNum.indexOf(c)).toString());
int newGuess2 = Integer.parseInt(sb2.deleteCharAt(newNum.indexOf(c, newNum.indexOf(c)+1)).toString());
    
      
    return newGuess1 > newGuess2 ? newGuess1: newGuess2;
    
    }
    
      
      public static void main(String[] args){
         
             System.out.println(solutioni(15958));
         
         }
    
}
