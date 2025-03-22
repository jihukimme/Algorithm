import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int line = 0;
        int seq = 0;
        
        // 몇번째 대각선의 몇번째인지
        while(cnt<n){
            line++;
            seq = 0;

            for(int i=0; i<line; i++){
                cnt++;
                seq++;

                if(cnt==n){
                    break;
                }
            }
        }

        int first = 0;
        int last = 0;

        for(int i=0; i<seq; i++){
            if(line%2 == 0){
                first = i+1;
                last = line-i;
            }
            else{
                first=line-i;
                last=i+1;
            }
        }

        System.out.println(first + "/" + last);

    }
}
