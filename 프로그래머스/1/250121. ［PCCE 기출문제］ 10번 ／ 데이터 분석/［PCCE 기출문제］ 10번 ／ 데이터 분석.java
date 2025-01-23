import java.util.*;

class Solution {
    static int extIdx = 0;
    static int sortIdx = 0;
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();
        
        String[] colName = {"code", "date", "maximum", "remain"};
        
        for(int i=0; i<colName.length; i++){
            if(colName[i].equals(ext)){
                extIdx = i;
            }
            if(colName[i].equals(sort_by)){
                sortIdx = i;
            }
        }
        
        
        for(int i=0; i<data.length; i++){
            if(data[i][extIdx]<val_ext){
                list.add(data[i]);
            }
        }
        
        // list.sort((o1, o2) -> Integer.compare(o1[sortIdx], o2[sortIdx]));
        
        list.sort((o1,o2) -> o1[sortIdx] - o2[sortIdx]);
        
        int[][] answer = new int[list.size()][4];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}