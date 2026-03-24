import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // int[] arr1 = new int[n];
        // int[] arr2 = new int[m];

        int[] answer = new int[n+m];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            // arr1[i] = Integer.parseInt(st.nextToken());
            answer[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<m; i++) {
            // arr2[i] = Integer.parseInt(st.nextToken());
            answer[n+i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(answer);
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n+m; i++){
            sb.append(answer[i]).append(" ");
        }

        System.out.println(sb);
    }
}
