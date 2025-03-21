import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 5개의 문자열을 받음
        // 5개의 문자열에서 같은 인덱스의 문자를 합침

        String[] arr = new String[5];
        int maxLength = 0;

        for(int i=0; i<5; i++){
            arr[i] = br.readLine();

            if(maxLength < arr[i].length()){
                maxLength = arr[i].length();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<maxLength; i++){
            for(int j=0; j<5; j++){
                if(i>=arr[j].length()) {
                    continue;
                }
                sb.append(arr[j].charAt(i));
            }
        }

        System.out.println(sb);

    }
}
