class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n 이하의 합성수(약수의 개수가 3개 이상인 수) 개수
        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            
            if(count>=3){
                answer++;
            }
            
        }
        
        return answer;
    }
}