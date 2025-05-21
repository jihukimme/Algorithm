import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int count = getCount(arr);
            sb.append("#").append(test_case).append(" ").append(count).append("\n");
        }

        System.out.println(sb);
    }

    static int getCount(int[] arr){
        int count = 0;

        for(int i = 2; i < arr.length-2; i++){
            int left = i-2;
            int right = i+2;

            int maxHigh = 0;
            boolean isView = false;

            while(left < i && right > i){
                if(arr[i] <= arr[right] || arr[i] <= arr[left]){
                    maxHigh = 0;
                    isView = false;
                    break;
                }
                else {
                    isView = true;
                    maxHigh = Math.max(maxHigh, Math.max(arr[left], arr[right]));
                }

                left++;
                right--;
            }
            
            if(isView) {
                count += arr[i]-maxHigh;
            }
        }

        return count;
    }
}