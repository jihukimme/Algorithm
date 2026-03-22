import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        
        int[] a1 = {1, 2, 3, 4, 5}; // 5
        int[] a2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
        int[] a3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
        
        int[] score = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i]==a1[i%5]){
                    score[0]++;
                }
            
            if(answers[i]==a2[i%8]){
                    score[1]++;
                }
        
            if(answers[i]==a3[i%10]){
                    score[2]++;
                }

        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int max = 0;
        
        for(int i=0; i<score.length; i++) {
            if(max<score[i]){
                max=score[i];
            }
        }
        
        for(int i=0; i<score.length; i++) {
            if(max==score[i]){
                list.add(i+1);
            }
        }
        
        
        return list;
        
//         int[] p1 = {1,2,3,4,5};
//         int[] p2 = {2,1,2,3,2,4,2,5};
//         int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        
//         int[] scores = new int[3];
        
//         for(int i=0; i<answers.length; i++){
//             if(answers[i] == p1[i%5]){
//                 scores[0]++;
//             }
            
//             if(answers[i] == p2[i%8]){
//                 scores[1]++;
//             }
            
//             if(answers[i] == p3[i%10]){
//                 scores[2]++;
//             }
//         }
                
//         int bestScore = scores[0];
//         for(int i=1; i<scores.length; i++){
//             if(bestScore < scores[i]){
//                 bestScore = scores[i];
//             }
//         }
        
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int i=0; i<scores.length; i++){
//             if(bestScore == scores[i]){
//                 list.add(i+1);
//             }
//         }
        
//         Collections.sort(list, Collections.reverseOrder());
        
//         return list;
       
    }
}


