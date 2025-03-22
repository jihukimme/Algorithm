import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        // v미터, a미터 올라감, b미터 미끄러짐

//        int day = 1;
//        int position = 0;

//        while(true){
//            position += a;
//
//            if(position >= v){
//                System.out.println(day);
//                break;
//            }
//
//            position -= b;
//            day++;
//        }

        int day = (v-b)/(a-b);

        if((v-b)%(a-b) > 0){
            day++;
        }

        System.out.println(day);
    }
}
