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
public class mulipleoffour {
    
    public static int solution(int[] A) {
    
    int sum = 0;
    
    for(int i = 0; i< A.length;i++){
    
           if(A[i]%4==0){
           
            sum = sum + A[i];
               
           }
    }
     return sum;
    }
    
    
    
    
    public static void main(String[] args){

    int[] y = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
    System.out.print(solution(y));


    }
    
}
