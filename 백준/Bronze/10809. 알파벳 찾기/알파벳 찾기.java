import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] arr = new int[26];

        // 배열 초기화 (모든 값이 -1로 초기화)
        Arrays.fill(arr, -1);

        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


        for(int i=s.length()-1; i>=0; i--){
            for(int j=0; j<alphabet.length; j++){
                if(s.charAt(i) == alphabet[j]){
                    arr[j] = i;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int j : arr) {
            sb.append(j).append(" ");
        }

        System.out.println(sb);
    }
}
