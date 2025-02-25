import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] result = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i]==p1[i%5]){
                result[0]++;
            }
            if(answers[i]==p2[i%8]){
                result[1]++;
            }
            if(answers[i]==p3[i%10]){
                result[2]++;
            }
        }
        
        int max = Math.max(result[0], Math.max(result[1], result[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<result.length; i++){
            if(result[i]==max){
                list.add(i+1);
            }
        }
        
        return list; 
    }
}