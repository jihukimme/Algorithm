import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while(n!=0){
            int x = n%b;
            n/=b;

            char c;
            if(x>9){
                c = (char)(x - 10 + 'A');
            }
            else{
                c = (char)(x + '0');
            }

            sb.append(c);
        }

        sb.reverse();

        System.out.println(sb);
    }
}