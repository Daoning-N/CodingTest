import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=1; j<=n; j++){
                if(i%j==0){
                   temp.add(j);
                }
            }
            if(temp.size()>2){
            answer++;
            }
        }
        return answer;
    }
}