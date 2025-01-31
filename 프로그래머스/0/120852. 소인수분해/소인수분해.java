import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        int i = 2;
        
        while(n>1){
            if(n%i==0){
                set.add(i);
                n = n/i;
            }
            else{
                i++;
            }
        }
        
        System.out.println(set);
        
        // ArrayList<Integer> list = new ArrayList<>(set);
        // list.sort();
        
        int[] answer = new int[set.size()];
        int idx = 0;
        for(int num : set){
            answer[idx++] = num;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}