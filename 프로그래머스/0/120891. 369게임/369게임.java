class Solution {
    public int solution(int order) {
        int answer = 0;
        
//         String[] arr = Integer.toString(order).split("");
        
//         for(int i=0; i<arr.length; i++){
//             if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")){
//                 answer++;
//             }
//         }
        
        while(order>0){
            int num = order%10;
            if(num == 3 || num == 6 || num == 9){
                answer++;
            }
            order /= 10;
        }
        
        return answer;
    }
}