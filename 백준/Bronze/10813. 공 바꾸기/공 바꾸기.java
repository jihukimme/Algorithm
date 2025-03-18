import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // n개 바구니(1~n번의 번호를 가진 바구니)
        // m번 공을 바꿀거
        // 공을 서로 바꿀 바구니 2개 선택
        // 처음에는 바구니에 적힌 번호와 같은 번호가 적힌 공이 들어있음

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

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // a와 b에 들어있는 공을 바꿀거
            int tmp = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = tmp;
        }

        StringBuilder sb = new StringBuilder();

        for(int i : arr){
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}