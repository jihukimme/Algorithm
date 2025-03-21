import java.io.*;



public class Main {
    public static void main(String[] args) throws IOException {

        // 대소문자 단어 -> 가장 많이 사용된 알파벳 알아내기(대문자와 소문자를 구분하지 않는다.)
        // 대문자 아스키코드 + 32 = 소문자 아스키코드

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        char[] val= br.readLine().toLowerCase().toCharArray();

        StringBuilder sb = new StringBuilder();


        // a b c d e f g
        // 0 1 2 3 4 5 6
        // 'a' - 'a'
        int[] count = new int[26];
        for(int i = 0; i < val.length; i++){
            count[val[i] - 'a']++;
        }

        int max = 0;
        char answer = '?';

        for(int i=0; i<count.length; i++){
           if(max<count[i]) {
               max = count[i];
               answer = (char)(i + 'A');
           }
           else if(max == count[i])
               answer = '?';
        }

        sb.append(answer);
        System.out.println(sb);


    }
}