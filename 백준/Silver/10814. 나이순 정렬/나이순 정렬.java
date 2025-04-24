import java.io.*;
import java.util.*;

//class IOControll {
//    //이놈들을 사용하는 이유 : 데이터를 buffer라는 임시 메모리에 저장한 후 한번에 읽어 속도가 빠름(성능이 개선 됨)
//
//    //read
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //scanner
//    //    BufferedReader br = new BufferedReader(new FileReader("input.txt")); 이런식으로 파일을 읽을 수 있음
//
//    //write
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //print
//    //    BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt")); 이런식으로 파일에 쓸 수 있음
//
//    //string tokenizer
//    String str = "java, python, arr[2]++";
//    StringTokenizer st = new StringTokenizer(str, ", "); //string tokenizer
//    String token = st.nextToken();


//    String token2 = st.nextToken();
//
//    //print예시
//    //System.out.println(str);을 쓰면 느리다.
//    //BufferedWriter 또는 StringBuilder를 사용하자.
//    //단 BufferedWriter는 flush()와 close()를 꼭 해주어야 하며, IOException을 처리해야 한다.
//
//    public void writeExample() throws IOException {
//        StringBuilder sb = new StringBuilder(); // make string
//        sb.append(str);
//        sb.append("\n");
//        sb.append(token);
//        sb.append("\n");
//        sb.append(token2);
//
//        // BufferedWriter로 출력
//        bw.write(str);
//        bw.newLine();
//        bw.write(token);
//        bw.newLine();
//        bw.write(token2);
//        bw.newLine();
//        bw.flush(); // 반드시 flush()를 호출해야 출력됨
//        bw.close(); // 작업이 끝나면 반드시 close() 호출
//    }
//
//}

//class sol23971 {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        StringBuilder sb = new StringBuilder();
//
//        double H, W, N, M;
//        H = Integer.parseInt(st.nextToken());
//        W = Integer.parseInt(st.nextToken());
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//
//        int height, width;
//
//        height = (int)Math.ceil(H / (N + 1));
//        width = (int)Math.ceil(W / (M + 1));
//
//        int result = height * width;
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(String.valueOf(result));
//        bw.flush();
//        bw.close();
//
////        sb.append(result);
////        System.out.println(sb);
//}

//class sol5073 {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
////        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//    StringBuilder sb = new StringBuilder();
//
//    // Equilateral, Isosceles, Scalene
//
//    int arr[] = new int[3];
//
//        do{
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//
//        arr[0] = Integer.parseInt(st.nextToken());
//        arr[1] = Integer.parseInt(st.nextToken());
//        arr[2] = Integer.parseInt(st.nextToken());
//
//        if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
//            break;
//        }
//
//        Arrays.sort(arr);
//
//        if(arr[2] >= arr[0] + arr[1]) {
//            sb.append("Invalid\n");
//        }
//        else if (arr[0] == arr[1] && arr[1] == arr[2]) {
//            sb.append("Equilateral\n");
//        }
//        else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
//            sb.append("Isosceles\n");
//        }
//        else {
//            sb.append("Scalene\n");
//        }
//
//
//    }while( arr[0] != 0 && arr[1] != 0 && arr[2] != 0);
//
//        System.out.println(sb);
//}

//class sol2292 {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//    StringBuilder sb = new StringBuilder();
//
//    // 1=1 / 2=2~7 : 6 / 3=8~19 : 12 / 4=20~37 : 18 / 5=38~61 : 24
//
//    int n = Integer.parseInt(st.nextToken());
//
//    int count = 1;
//    int i = 2;
//
//        if(n == 1) {
//        sb.append(count);
//        System.out.println(sb);
//    }
//        else {
//        while(i <= n){
//            i = i + count * 6;
//            count = count + 1;
//        }
//
//        sb.append(count);
//        System.out.println(sb);
//    }
//}

//class sol1157 {
//    // 대소문자 단어 -> 가장 많이 사용된 알파벳 알아내기(대문자와 소문자를 구분하지 않는다.)
//    // 대문자 아스키코드 + 32 = 소문자 아스키코드
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
////        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//    char[] val= br.readLine().toLowerCase().toCharArray();
//
//    StringBuilder sb = new StringBuilder();
//
//
//    // a b c d e f g
//    // 0 1 2 3 4 5 6
//    // 'a' - 'a'
//    int[] count = new int[26];
//        for(int i = 0; i < val.length; i++){
//        count[val[i] - 'a']++;
//    }
//
//    int max = 0;
//    char answer = '?';
//
//        for(int i=0; i<count.length; i++){
//        if(max<count[i]) {
//            max = count[i];
//            answer = (char)(i + 'A');
//        }
//        else if(max == count[i])
//            answer = '?';
//    }
//
//        sb.append(answer);
//        System.out.println(sb);
//}

//class sol11723 {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
////       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//    StringBuilder sb = new StringBuilder();
//
////       int[] s = new int[num];
//
//    int num = Integer.parseInt(br.readLine());
//
//    ArrayList<Integer> arrayList = new ArrayList<>();
//
//        while(num-- > 0){
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        String input = st.nextToken();
//        int value;
//
//        switch (input) {
//            case "add" :
//                value = Integer.parseInt(st.nextToken());
//                if(!arrayList.contains(value)) {
//                    arrayList.add(value);
//                }
//                break;
//            case "remove" :
//                value = Integer.parseInt(st.nextToken());
//                if(arrayList.contains(value)) {
//                    int index = arrayList.indexOf(value);
//                    arrayList.remove(index);
//                }
//                break;
//            case "check" :
//                value = Integer.parseInt(st.nextToken());
//                if(arrayList.contains(value)) {
//                    sb.append("1\n");
//                }
//                else {
//                    sb.append("0\n");
//                }
//                break;
//            case "toggle" :
//                value = Integer.parseInt(st.nextToken());
//                if(arrayList.contains(value)) {
//                    int index = arrayList.indexOf(value);
//                    arrayList.remove(index);
//                }
//                else {
//                    arrayList.add(value);
//                }
//                break;
//            case "all" :
//                arrayList = new ArrayList<>(Arrays.asList(
//                        1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
//                        11, 12, 13, 14, 15, 16, 17, 18, 19, 20
//                ));
//                break;
//            case "empty" :
//                arrayList.clear();
//                break;
//        }
//
////            System.out.println(sb);
//
//    }
//
//        System.out.println(sb);
//
//}

//class sol9655 {
//    // 돌 N개, 2명의 player, 턴을 돌아가며 1개 또는 3개의 돌을 가져감.
//    // 마지막 돌을 가져가는 사람이 승리
//
//    //5개
//    //3개 - sk승, 1개/1개/3개 - sk승, 1개/3개/1개 - sk승,
//
//    //4개
//    //3개/1개 - cy승, 1개/3개 - cy승, 1개/1개/1개/1개 - cy승
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    int n = Integer.parseInt(br.readLine());
//
//        if(n%2 == 0){
//        System.out.println("CY");
//    }
//        else {
//        System.out.println("SK");
//    }
//}

//class sol10431 {
//
//    // 키 순서로 번호 부여(작은 순으로), 항상 20명, 같은 키x,
//    // 정렬 방법 : 아무나 한명을 맨 앞에 세운다. -> 그 다음부터 학생을 계속 맨 뒤에 세운다. ->
//    // 만약 앞에 있는 학생이 키가 크다면, 그 학생 앞으로 선다.
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    StringBuilder sb = new StringBuilder();
//
//
//    int p = Integer.parseInt(br.readLine());
//    int num;
//    int[] arr = new int[20];
//    int[] count = new int[p];
//
//        while(p-- > 0){
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        num = Integer.parseInt(st.nextToken());
//
//        for(int i=0; i<20; i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for(int i=arr.length-1; i>=0; i--) {
//            for(int j=i-1; j>=0; j--) {
//                if(arr[i]<arr[j]){
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                    count[p] += 1;
//                }
//            }
//        }
//
//        sb.append(num + " ");
//        sb.append(count[p] + "\n");
//
//    }
//
//
//        System.out.println(sb);
//
//
////        // 기본적인 오름차순 구현
////        int[] arr1 = {900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919};
////        int[] arr2 = {919, 918, 917, 916, 915, 914, 913, 912, 911, 910, 909, 908,907, 906, 905, 904, 903, 902, 901, 900};
////        int[] arr3 = {901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 900};
////        int[] arr4 = {918, 917, 916, 915, 914, 913, 912, 911, 910, 909, 908, 907, 906, 905, 904, 903, 902, 901, 900, 919};
////
////        for(int i=0; i<arr.length; i++) {
////            for(int j=i+1; j<arr.length; j++) {
////                if(arr[i] > arr[j]) { //오름차순
////                    int tmp = arr[i];
////                    arr[i] = arr[j];
////                    arr[j] = tmp;
////                }
////            }
////        }
//
//}

//class sol8979 {
//    // 국가 : 1~n 사이 정수로 표현,
//    // 등수는 자신보다 더 잘한 나라수 + 1
//    // 금, 은, 동 메달 수 같다면 같은 등수
//
//    // 1. 금메달 수가 더 많은 나라
//    // 2. 금메달 수가 같으면, 은메달 수가 더 많은 나라
//    // 3. 금, 은메달 수가 모두 같으면, 동메달 수가 더 많은 나라
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//
//    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//    int n = Integer.parseInt(st.nextToken()); // 국가 수
//
//    int[][] medal = new int[n][3]; // 금:0, 은:1, 동:2
//
//    int m = Integer.parseInt(st.nextToken()); // 등수 알고싶은 나라 번호
//
//    int v;
//
//
//        for(int i=0; i<n; i++){
//        st = new StringTokenizer(br.readLine(), " ");
//        v = Integer.parseInt(st.nextToken());
//
//        for(int j=0; j<3; j++){
//            medal[v-1][j] = Integer.parseInt(st.nextToken());
//        }
//    }
//
//    int rank = 1;
//
//        for(int i=0; i<n; i++){
//        if(i==m-1){
//            continue;
//        }
//
//        if(medal[m-1][0] < medal[i][0]){
//            rank++;
//        }
//        else if(medal[m-1][0] < medal[i][0] && medal[m-1][1] < medal[i][1]){
//            rank++;
//        }
//        else if(medal[m-1][0] < medal[i][0] && medal[m-1][1] < medal[i][1] && medal[m-1][2] < medal[i][2]){
//            rank++;
//        }
//    }
//
//
//    StringBuilder sb = new StringBuilder();
//        sb.append(rank);
//
//        System.out.println(sb);
//
//
//}

//class sol7568 {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    StringBuilder sb = new StringBuilder();
//
//    int n = Integer.parseInt(br.readLine());
//
//    int[][] arr = new int[n][2];
//
//    int v;
//
//        for(int i=0; i<n; i++){
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        for(int j=0; j<2; j++){
//            v = Integer.parseInt(st.nextToken());
//            arr[i][j] = v;
//        }
//    }
//
//
//        for(int i=0; i<n; i++){
//        int rank = 1;
//
//        for(int j=0; j<n; j++){
//            if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
//                rank++;
//        }
//        sb.append(rank + " ");
//    }
//
//        System.out.println(sb);
//}

//class sol4659 {
//    // acceptable, not acceptable
//    // 모음(a,e,i,o,u) 중 하나를 반드시 포함
//    // 모음이 3개, 또는 자음이 3개 연속으로 오면 안된다.
//    // 같은 글자가 연속적으로 두번 오면 안되나, ee와 oo는 허용
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    StringBuilder sb = new StringBuilder();
//
//        while(true) {
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        String password = st.nextToken();
//
//        boolean acceptable = true;
//        int countM = 0;
//        int countJ = 0;
//        char before = '.';
//
//        if(password.equals("end")){
//            break;
//        }
//
//        // 모음(a,e,i,o,u) 중 하나를 반드시 포함
//        if(!password.contains("a") && !password.contains("e") && !password.contains("i") && !password.contains("o") && !password.contains("u")){
//            acceptable = false;
//        }
//
//        // 모음이 3개, 또는 자음이 3개 연속으로 오면 안된다.
//        for(int i=0; i<password.length(); i++) {
//            char now = password.charAt(i);
//
//            if(now == 'a' || now == 'e' || now == 'i' || now == 'o' || now == 'u'){
//                countM++;
//                countJ = 0;
//            }
//            else{
//                countJ++;
//                countM = 0;
//            }
//
//            if(countM==3 || countJ==3){
//                acceptable = false;
//            }
//
//            // 같은 글자가 연속적으로 두번 오면 안되나, ee와 oo는 허용
//            if(before == now && now != 'e' && now != 'o'){
//                acceptable = false;
//            }
//
//            before = now;
//        }
//
//        if(acceptable==false){
//            sb.append("<" + password + "> is not acceptable.\n");
//        }
//        else {
//            sb.append("<" + password + "> is acceptable.\n");
//        }
//
//    }
//
//
//        System.out.println(sb);
//}

//class sol25757 {
//// 윷놀이Y(2명), 그림찾기F(3명), 원카드O(4명)
//    //플레이 신청 횟수 N
//    //한번 같이 플레이한 사람과는 다시 플레이하지 않는다.
//    //동명이인 없다.
//
//    //나의 플레이 횟수를 출력한다.
//
//    HashSet<String> play = new HashSet<>();
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//    int playCount = 0;
//
//    int n = Integer.parseInt(st.nextToken());
//    String game = st.nextToken();
//
//        for(int i=0; i<n; i++){
//        String playerName = br.readLine();
//        play.add(playerName);
//    }
//
//        if(game.equals("Y")){
//        playCount = play.size();
//    }
//        else if(game.equals("F")){
//        playCount = play.size() / 2;
//    }
//        else{
//        playCount = play.size() / 3;
//    }
//
//        System.out.println(playCount);
//}

//class sol20125 {
//
//    public void solve() throws IOException {
//        //쿠키 신체 측정
//        //머리, 심장, 허리, 좌우 팔, 다리
//        //빨간 곳 = 심장
//        //머리는 심장 바로 윗칸
//        //팔은 심장에서 이어짐
//        //허리는 심장 아래쪽으로 이어짐
//        //다리는 허리의 왼쪽 오른쪽 바로 아랫칸에서 이어짐
//
//        // 출력1 : 쿠키의 심장위치
//        // 출력2 : 왼쪽 팔, 오른쪽 팔, 왼쪽 다리, 오른쪽 다리, 허리 길이
//
//
//        //판 크기 N*N
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(br.readLine());
//        int[][] arr = new int[n][n];
//
//        for(int i=0; i<n; i++){
//            String str = br.readLine();
////            StringTokenizer st = new StringTokenizer(str);
//
//            for(int j=0; j<n; j++){
////                String token = st.nextToken();
//                if(str.charAt(j) == '_'){
//                    arr[i][j] = 0;
//                }
//                else if(str.charAt(j) == '*'){
//                    arr[i][j] = 1;
//                }
//            }
//        }
//
//        int heartX = 0, heartY = 0;
//        int armL = 0, armR = 0, legL = 0, legR = 0, mid = 0;
//
//        // 심장 위치 찾기
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == 1 && arr[i + 1][j] == 1) {
//                    heartX = i + 1; // 심장은 첫 번째 '*' 아래
//                    heartY = j;
//                    break;
//                }
//            }
//            if (heartX != 0) break; // 심장 위치를 찾으면 외부 루프도 종료
//        }
//
//        // 왼팔 길이
//        for (int i = heartY - 1; i >= 0; i--) {
//            if (arr[heartX][i] == 1) {
//                armL++;
//            } else {
//                break;
//            }
//        }
//
//        // 오른팔 길이
//        for (int i = heartY + 1; i < n; i++) {
//            if (arr[heartX][i] == 1) {
//                armR++;
//            } else {
//                break;
//            }
//        }
//
//        // 허리 길이
//        for (int i = heartX + 1; i < n; i++) {
//            if (arr[i][heartY] == 1) {
//                mid++;
//            } else {
//                break;
//            }
//        }
//
//        // 왼다리 길이 (배열 범위를 벗어나지 않도록 조건 추가)
//        for (int i = heartX + mid + 1; i < n; i++) {
//            if (arr[i][heartY - 1] == 1) {
//                legL++;
//            } else {
//                break;
//            }
//        }
//
//        // 오른다리 길이 (배열 범위를 벗어나지 않도록 조건 추가)
//        for (int i = heartX + mid + 1; i < n; i++) {
//            if (arr[i][heartY + 1] == 1) {
//                legR++;
//            } else {
//                break;
//            }
//        }
//
//        // 결과 출력
//        sb.append(heartX + 1).append(" ").append(heartY + 1).append("\n"); // 심장 위치는 1-based로 출력
//        sb.append(armL).append(" ").append(armR).append(" ").append(mid).append(" ").append(legL).append(" ").append(legR);
//        System.out.println(sb);
//    }
//
//}

//class sol1205 {
//    // 등수 구하기
//    // 등수 : 위에서 볓 번째 점수인지(같은 점수 있으면 동점)
//    // 만약 점수가 리스트에 올라갈 수 없다면 -1을 출력
//
//    // 입력: N=리스트에 있는 점수개수, 태수의 새로운 점수, P=리스트에 올라갈 수 있는 점수 개수
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//    int n = Integer.parseInt(st.nextToken());
//    int newScore = Integer.parseInt(st.nextToken());
//    int p = Integer.parseInt(st.nextToken());
//
//        if(n == 0){
//        System.out.println(1);
//        return;
//    }
//
//    ArrayList<Integer> scores = new ArrayList<>();
//
//    st = new StringTokenizer(br.readLine(), " ");
//        for(int i=0; i<n; i++) {
//        scores.add(Integer.parseInt(st.nextToken()));
//    }
//
//    int rank = 1;
//
//    // -1을 출력하는 경우
//        if(n==p && scores.get(scores.size()-1) >= newScore) {
//        rank = -1;
//    }
//        else {
//        if(n==p){
//            scores.add(newScore);
//            scores.remove(p);
//        }
//        else {
//            scores.add(newScore);
//        }
//        Collections.sort(scores, Collections.reverseOrder()); // 내림차순
//        // Collections.sort(scores); // 오름차순
//
//        for(int i=0; i<scores.size(); i++){
//            if(scores.get(i) > newScore) {
//                rank++;
//            }
//            else {
//                break;
//            }
//        }
//    }
//
//
//
//        System.out.println(rank);
//
//}


//class sol1244 {
//    // 스위치 켜고 끄기
//    // 스위치 개수
//    // 1은 켜짐, 0은 꺼짐
//    // 남학생 : 자기가 부여 받은 수의 배수면 스위치 상태를 바꾼다
//    // 여학생은 자기가 받은 수와 같은 번호가 붙은 스위치를 중심으로 좌우가 대칭이면서 가장 많은 스위치를 포함하는 구간을 찾아서, 그 구간에 속한 스위치의 상태를 모두 바꾼다. 이때 구간에 속한 스위치 개수는 항상 홀수가 된다.
//
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    int n = Integer.parseInt(br.readLine()); // 스위치 개수
//
//        if(n==0){
//        return;
//    }
//
//    int[] state = new int[n];
//
//    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        for(int i=0; i<n; i++){
//        state[i] = Integer.parseInt(st.nextToken());
//    }
//
//    int studentNum = Integer.parseInt(br.readLine());
//
//        for(int i=0; i<studentNum; i++) {
//        st = new StringTokenizer(br.readLine(), " ");
//        int gender = Integer.parseInt(st.nextToken());
//        int num = Integer.parseInt(st.nextToken());
//
//        // 남학생
//        if (gender == 1) {
//            for (int j = num - 1; j < n; j += num) {
//                state[j] = state[j] == 0 ? 1 : 0;
//            }
//        }
//        // 여학생
//        else {
//            int index = num-1;
//            int j = 0;
//            while(index-j>=0 && index+j<n){
//                if(state[index-j] != state[index+j]){
//                    break;
//                }
//                j++;
//            }
//
//            j--;
//
//            for(int z=index-j; z<=index+j; z++){
//                if(state[z]==0){
//                    state[z]=1;
//                }
//                else{
//                    state[z]=0;
//                }
//            }
//        }
//    }
//
//    StringBuilder sb = new StringBuilder();
//        for(int i=1; i<=n; i++){
//        sb.append(state[i-1]).append(" ");
//        if(i%20==0){
//            sb.append("\n");
//        }
//    }
//
//        System.out.println(sb);
//}

//class sol18870 {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    int n = Integer.parseInt(br.readLine());
//
////        if(n==0){
////            return;
////        }
//
//    int[] arr = new int[n];
//    int[] sortArr = new int[n];
//
//    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        for(int i=0; i<n; i++){
//        arr[i] = sortArr[i] = Integer.parseInt(st.nextToken());
//    }
//
//        Arrays.sort(sortArr);
//
//    HashMap<Integer, Integer> rankMap = new HashMap<>();
//    int num = 0;
//        for(int i=0; i<n; i++){
//        if(!rankMap.containsKey(sortArr[i])){
//            rankMap.put(sortArr[i], num++);
//        }
//    }
//
//    StringBuilder sb = new StringBuilder();
//        for(int i=0; i<n; i++){
//        sb.append(rankMap.get(arr[i])).append(" ");
//    }
//
//        System.out.println(sb);
//}

//class sol2167{
//    public void solution() throws IOException {
//        //n행 m열의 2차원 배열
//        //2차원 배열을 입력받고,
//        //(i,j)부터 (x,y)위치까지의 수들의 합
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        int[][] arr = new int[n][m];
//
//        for(int i=0; i<n; i++){
//            st = new StringTokenizer(br.readLine(), " ");
//            for(int j=0; j<m; j++){
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        int k = Integer.parseInt(br.readLine());
//        for(int i=0; i<k; i++){
//            st = new StringTokenizer(br.readLine(), " ");
//            int x1 = Integer.parseInt(st.nextToken());
//            int y1 = Integer.parseInt(st.nextToken());
//            int x2 = Integer.parseInt(st.nextToken());
//            int y2 = Integer.parseInt(st.nextToken());
//            int sum = 0;
//
//            for(int startX=x1-1; startX<=x2-1; startX++){
//                for(int startY=y1-1; startY<=y2-1; startY++){
//                    sum += arr[startX][startY];
//                }
//            }
//
//            sb.append(sum);
//            sb.append("\n");
//        }
//        System.out.println(sb);
//    }
//}

//class sol17478 {
//    public void solution() throws IOException {
//        //재귀함수 : 자기 자신을 호출하는 함수
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//
//        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
//        recursion(n, sb, "");
//        System.out.println(sb);
//    }
//
//    public void recursion(int n, StringBuilder sb, String underBar) {
//        if(n==0){
//            sb.append(underBar).append("\"재귀함수가 뭔가요?\"\n");
//            sb.append(underBar).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
//            sb.append(underBar).append("라고 답변하였지.\n");
//
//            return;
//        }
//
//        sb.append(underBar).append("\"재귀함수가 뭔가요?\"\n");
//        sb.append(underBar).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
//        sb.append(underBar).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
//        sb.append(underBar).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
//
//        recursion(n-1, sb, underBar + "____");
//        sb.append(underBar).append("라고 답변하였지.\n");
//    }
//}

//class sol10870 {
//    public void solution() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        int result = fib(n);
//
//        System.out.println(result);
//    }
//
//    public int fib(int n) {
//        int result;
//
//        if(n==1 || n==0){
//            return n;
//        }
//        else {
//            result = fib(n-1) + fib(n-2);
//        }
//
//        return result;
//    }
//}

//class sol11727 {
//    public void solution() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        //2*n 직사각형을
//
//        int[] dp = new int[n+3];
//        dp[1] = 1;
//        dp[2] = 3;
//
//        for(int i=3; i<=n; i++){
//            dp[i] = (dp[i-1] + dp[i-2] * 2) % 10007;
//        }
//
//        System.out.println(dp[n]);
//    }
//}

//class sol1654 {
//    public void solution() throws IOException {
//        //n개의 랜선
//        //길이가 제각각인 k개의 랜선
//        //길이가 같은 n개의 랜선을 k개의 랜선을 잘라서 만든다.
//        //랜선을 자를 때 손실되는 길이가 없다고 가정
//        //만들 수 있는 최대 랜선의 길이를 구하라
//
//        //이미 가지고 있는 랜선 k개
//        //필요한 랜선의 n개
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int k = Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//
//        int[] arr = new int[k];
//
//        long min = 1;
//        long mid = 0;
//        long max = 0;
//
//        for(int i=0; i<k; i++){
//            arr[i] = Integer.parseInt(br.readLine());
//            if(max<arr[i]){
//                max = arr[i];
//            }
//        }
//
//        long sum;
//        while(min<=max){
//            mid = (min+max)/2;
//            sum=0;
//
//            for(int i=0; i<k; i++) {
//                sum += arr[i]/mid;
//            }
//
//            if(sum < n) {
//                max = mid-1;
//            }
//            else {
//                min = mid+1;
//            }
//        }
//
//        System.out.println(min-1);
//    }
//}

//class sol10989 {
//    public void solution() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        int[] arr = new int[n];
//
//        for(int i=0; i<n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
////        for(int i=0; i<n; i++){
////            for(int j=i+1; j<n; j++){
////                if(arr[i] > arr[j]){
////                    int tmp;
////                    tmp = arr[i];
////                    arr[i] = arr[j];
////                    arr[j] = tmp;
////                }
////            }
////        }
//
//        Arrays.sort(arr);
//
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<n; i++){
//            sb.append(arr[i]).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//}

//class sol2947 {
//    public void solution() throws IOException {
//        //나무조각 1~5
//        //첫번째수 두번째수
//        //두번째수 세번째수 ..
//        //버블 정렬(오름차순)
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        StringBuilder sb = new StringBuilder();
//
//        int[] arr = new int[5];
//
//        for(int i=0; i<5; i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for(int i=0; i<5; i++){
//            for(int j=0; j<4; j++){
//                if(arr[j]>arr[j+1]){
//                    int tmp;
//                    tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//
//                    for(int z=0; z<5; z++){
//                        sb.append(arr[z]).append(" ");
//                    }
//                    sb.append("\n");
//                }
//            }
//        }
//
//        System.out.println(sb);
//    }
//}

//class sol1427 {
//    public void solution() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String s = br.readLine();
//
//        Integer[] arr = new Integer[s.length()];
//
//        for(int i=0; i<s.length(); i++){
//            arr[i] = s.charAt(i) - '0';
//        }
//
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<s.length(); i++){
//            sb.append(arr[i]);
//        }
//
//        System.out.println(sb);
//    }
//}

class sol10814 {
    public class person {
        int age;
        String name;

        public person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        person[] arr = new person[n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            person p = new person(age, name);
            arr[i] = p;
        }

        Arrays.sort(arr, new Comparator<person>() {
            @Override
            public int compare(person p1, person p2) {
                return p1.age - p2.age;
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(arr[i].age + " " + arr[i].name).append("\n");
        }

        System.out.println(sb);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {

        sol10814 sol = new sol10814();
        sol.solution();
    }
}
