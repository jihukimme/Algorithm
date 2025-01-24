import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        
        // 3명의 수포자, 수학문제를 찍는다
        // 가장 많은 문제를 맞춘 사람을 return
        
        // 1번 수포자 : {12345}12345
        // 2번 수포자 : {21232425}21232425
        // 3번 수포자 : {3311224455}3311224455
        
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] scores = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == p1[i%5]) scores[0]++;
            if(answers[i] == p2[i%8]) scores[1]++;
            if(answers[i] == p3[i%10]) scores[2]++;
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<scores.length; i++){
            if(maxScore == scores[i]){
                list.add(i+1);
            }    
        }
        
        return list;
    }
}