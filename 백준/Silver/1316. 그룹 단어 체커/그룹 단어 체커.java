import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = n;

        // 연속해서 같은 문자, 연속해서 서로 다른 문자일 경우 그룹 단어
        // 다른 문자 등장했을 때 등장한 문자가 있으면 그룹문자가 아님
        // 그룹 단어 개수 return
        for(int i=0; i<n; i++){
            String s = br.readLine();

            boolean[] visited = new boolean[26];

            for(int j=0; j<s.length()-1; j++){
                Character current = s.charAt(j);
                Character next = s.charAt(j+1);

                if(current != next && visited[next-'a']){
                    count--;
                    break;
                }
                visited[current-'a'] = true;
            }
            
        }

        System.out.println(count);
    }
}