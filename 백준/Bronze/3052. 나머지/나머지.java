import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 서로 다른 값을 구하는 아이디어
        int[] arr = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<10; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        System.out.println(list.size());

    }
}