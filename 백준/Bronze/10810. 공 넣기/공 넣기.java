
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

        // n개의 바구니, m번 공을 넣을거
        // 바구니에는 1개의 공만 들어감
        // 공이 들어있을 때는 공을 빼고 넣어야 함

        int[] arr = new int[n];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            // start 부터 end까지 k번의 공을 넣을꺼

            for(int j=start-1; j<=end-1; j++){
                arr[j] = k;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}
