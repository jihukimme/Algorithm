import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 접근 방식을 다르게

        // 겹치는 부분을 뺄려고 하지 말고
        // 영역을 만들고 영역에 채워넣는 방식으로

        boolean[][] area = new boolean[100][100];
        int size = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    if(area[j][k] != true){
                        area[j][k] = true;
                        size++;
                    }
                }
            }

        }

        System.out.println(size);
    }
}