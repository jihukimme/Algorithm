import java.util.*;

class Solution {
    
    Queue<Node> queue;
    boolean[][] visited;
    
    int[] dx = {0, 0, -1, 1};
    int[] dy = {1, -1, 0, 0};
    
    
    public int solution(int[][] maps) {
        
        queue = new LinkedList<>();
        visited = new boolean[maps.length][maps[0].length];
                        
        return bfs(0, 0, 1, maps);
    }
    
    class Node {
        int x;
        int y;
        int distance;
        
        Node(int x, int y, int distance){
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    
    public int bfs(int x, int y, int distance, int[][] maps){
        Node startNode = new Node(x, y, distance);
        queue.add(startNode);
        
        while(!queue.isEmpty()){
            Node currentNode = queue.poll();
            
            if(currentNode.x == maps.length-1 && currentNode.y == maps[0].length-1){
                return currentNode.distance;
            }
            
            for(int i=0; i<4; i++){
                int nextX = currentNode.x + dx[i];
                int nextY = currentNode.y + dy[i];
                
                if(nextX>=0 && nextX<maps.length && nextY>=0 && nextY<maps[0].length){
                    if(!visited[nextX][nextY] && maps[nextX][nextY] != 0) {
                        visited[nextX][nextY] = true;
                        queue.add(new Node(nextX, nextY, currentNode.distance+1));
                    }
                }
            }
        }
        
        return -1;
    }    
}



// import java.util.*;

// class Solution {
    
//     boolean[][] isVisited;
    
//     int[] dx = {0, 0, -1, 1};
//     int[] dy = {1, -1, 0, 0};
    
//     ArrayList<Integer> list = new ArrayList<>();
    
    
//     public int solution(int[][] maps) {
//         int n = maps.length;
//         int m = maps[0].length;
        
//         isVisited = new boolean[n][m];
        
//         isVisited[0][0] = true; // 첫 시작위치
//         dfs(0, maps, 0, 0, 1);
        
//         Collections.sort(list);
        
//         if(list.isEmpty()){
//             return -1;
//         }
        
//         return list.get(0);
//     }
    
//     void dfs(int depth, int[][] maps, int x, int y, int distance){ 
//         if(depth == maps.length*maps[0].length){
//             return;
//         }
        
//         // if(x<0 || x>maps[0].length-1 || y<0 || y>maps.length-1){
//         //     return;
//         // }

//         if(x==maps[0].length-1 && y==maps.length-1){
//             list.add(distance);
//             return;
//         }
        
        
//         for(int i=0; i<4; i++){
//             int nextX = x + dx[i];
//             int nextY = y + dy[i];
            
//             if(nextX>=0 && nextX<=maps[0].length-1 && nextY>=0 && nextY<=maps.length-1){
//                 if(maps[nextX][nextY]!=0 && !isVisited[nextX][nextY]){
//                     isVisited[nextX][nextY] = true;
//                     dfs(depth+1, maps, nextX, nextY, distance+1);
//                     isVisited[nextX][nextY] = false;
//                 }
//             }
//         }
//     }
// }