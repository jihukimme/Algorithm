import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for(int s=start-1; s<end-1; s++){
                int tmp = arr[s];
                arr[s] = arr[end-1];
                arr[end-1] = tmp;
                end--;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int value : arr){
            sb.append(value).append(" ");
        }

        System.out.println(sb);
    }
}