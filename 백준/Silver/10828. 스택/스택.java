import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");

            String order = st.nextToken();

            if(order.equals("push")){
                int number = Integer.parseInt(st.nextToken());

                stack.push(number);
            }
            else if(order.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.pop());
                }
            }
            else if(order.equals("size")){
                System.out.println(stack.size());
            }
            else if(order.equals("empty")){
                System.out.println(stack.isEmpty() ? 1 : 0);
            }
            else if(order.equals("top")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.peek());
                }
            }
        }

    }
}
