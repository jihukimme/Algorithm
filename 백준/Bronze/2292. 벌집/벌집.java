import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        // 1=1 / 2=2~7 : 6 / 3=8~19 : 12 / 4=20~37 : 18 / 5=38~61 : 24

        int n = Integer.parseInt(st.nextToken());

        int count = 1;
        int i = 2;

        if(n == 1) {
            sb.append(count);
            System.out.println(sb);
        }
        else {
            while(i <= n){
                i = i + count * 6;
                count = count + 1;
            }

            sb.append(count);
            System.out.println(sb);
        }


    }
}