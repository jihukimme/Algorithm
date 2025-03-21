import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        // b진법인 수 n

        long sum = 0;
        int tmp = 1;

        // string의 인덱스는 왼쪽부터 0임..!
        for(int i=n.length()-1; i>=0; i--){
            char c = n.charAt(i);
            int num = 0;

            if('0'<=c && c<='9'){
                num = c-'0';
            }
            else {
                num = c - 'A' + 10;
            }

            sum += (long) num *tmp;
            tmp *= b;
        }

        System.out.println(sum);
    }
}