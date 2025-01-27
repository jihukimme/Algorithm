import java.util.*;

class Solution {
    public int solution(int a, int b) {        
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
                
        for(int i=1; i<=a; i++){
            if(a%i == 0){
                listA.add(i);
            }
        }
        
        for(int i=1; i<=b; i++){
            if(b%i == 0){
                listB.add(i);
            }
        }
        
        int max = 0;
        for(int j=listB.size()-1; j>=0; j--){
            if(listA.contains(listB.get(j))){
                max = listB.get(j);
                break;
            }
        }
        
        b/=max;
                        
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        
        return (b==1)?1:2;
    }
}