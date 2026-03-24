import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] level = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            level[i] = Integer.parseInt(st.nextToken());
        }

        int q = Integer.parseInt(br.readLine());
        int[] prefixSum = new int[n];

        for(int i=1; i<n; i++){
            int mistake = level[i-1]>level[i] ? 1:0;

            prefixSum[i]=prefixSum[i-1]+mistake;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<q; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            sb.append(prefixSum[y-1]-prefixSum[x-1]).append("\n");

//            int mistake = 0;
//
//            for(int j=x-1; j<y-1; j++){
//                if(j==level.length-1){
//                    break;
//                }
//
//                if(level[j]>level[j+1]){
//                    mistake++;
//                }
//            }
//
//            sb.append(mistake).append("\n");
        }

        System.out.println(sb);
    }
}
