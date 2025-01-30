import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        Arrays.sort(spell);
        System.out.println("spell : " + spell);
        
        for(int i=0; i<dic.length; i++){
            String[] arr = dic[i].split("");
            
            Arrays.sort(arr);
            System.out.println("arr : " + arr);
            
            if(Arrays.equals(arr, spell)){
                return 1;
            }
        }
        
        return 2;
    }
}