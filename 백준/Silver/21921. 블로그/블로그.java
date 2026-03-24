import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] prefixSum = new int[n];
        int sum = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            sum += Integer.parseInt(st.nextToken());
            prefixSum[i] = sum;
        }

        int max = prefixSum[x - 1]; 
        int cnt = 1;

        for(int i=x; i<n; i++){
            sum = prefixSum[i] - prefixSum[i-x];

            if (max < sum) {
                max = sum;
                cnt = 1;
            }
            else if(max==sum){
                cnt++;
            }
        }

        StringBuilder sb = new StringBuilder();

        if(max==0){
            sb.append("SAD");
        }
        else{
            sb.append(max).append("\n").append(cnt);
        }

        System.out.println(sb);
    }
}
