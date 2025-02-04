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
    
    
//     public void dfs(int x, int y, int[][] maps, int distance){
//         if(x==maps.length-1 && y==maps[0].length-1){
//             distance++;
//             list.add(distance);
//             return;
//         }
        
//         for(int i=0; i<4; i++){
//             int nextX = x + dx[i];
//             int nextY = y + dy[i];
            
//             if(nextX>=0 && nextX<maps.length && nextY>=0 && nextY<maps[0].length){
//                 if(maps[nextX][nextY] != 0 && !visited[nextX][nextY]){
//                     visited[nextX][nextY] = true;
//                     dfs(nextX, nextY, maps, distance+1);
//                     visited[nextX][nextY] = false;
//                 }
//             }
//         }
//     }
    
}