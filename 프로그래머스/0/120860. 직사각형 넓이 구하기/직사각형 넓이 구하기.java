import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int x = 0;
        int y = 0;
        
        System.out.println(Arrays.deepToString(dots));

        Arrays.sort(dots, (o1, o2) -> o1[0] - o2[0]);
        
        System.out.println(Arrays.deepToString(dots));
        
        y = Math.abs(dots[0][1] - dots[1][1]);
        x = Math.abs(dots[1][0] - dots[2][0]);
        
        answer = x*y;
        
        return answer;
    }
}