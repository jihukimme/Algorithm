import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        
        ArrayList<Double> list = new ArrayList<>();
        
        for(int i=0; i<dots.length; i++){
            int x1 = dots[i][0];
            int y1 = dots[i][1];
            
            for(int j=i+1; j<dots.length; j++){
                int x2 = dots[j][0];
                int y2 = dots[j][1];
                
                double p = (double)(y2 - y1)/(double)(x2 - x1);
                list.add(p);
            }
        }
        
        System.out.println(list);
        // 0,1  0,2  0,3  1,2  1,3  2,3
        // 
                
        double line1 = list.get(0);
        double line2 = list.get(1);
        double line3 = list.get(2);
        double line4 = list.get(3);
        double line5 = list.get(4);
        double line6 = list.get(5);
        
        if(line1 == line6){
            return 1;
        }
        else if(line2 == line5){
            return 1;
        }
        else if(line3 == line4){
            return 1;
        }
        
        return 0;
    }
}