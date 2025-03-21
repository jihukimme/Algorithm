import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        // 입력 받은 문자열을 모두 대문자로 바꾼다.
        // 사용된 알파벳의 개수를 센다.
        // 알파벳 개수는 .. 알파벳 개수만큼의 1차원 정수 배열을 만들어서 체크하는게 빠르겠다..

        s = s.toUpperCase();

        int[] count = new int[26];
        int maxIndex = 0;

        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i) - 'A';

            count[c]++;
        }

        for(int i=0; i<count.length; i++){
            if(count[i]>count[maxIndex]){
                maxIndex = i;
            }
        }

        int maxCount = 0;
        for(int i=0; i<count.length; i++){
            if(count[i]==count[maxIndex]){
                maxCount++;
            }
        }

        if(maxCount>=2){
            System.out.println("?");
        }
        else {
            System.out.println((char)(maxIndex+'A'));
        }

    }
}
