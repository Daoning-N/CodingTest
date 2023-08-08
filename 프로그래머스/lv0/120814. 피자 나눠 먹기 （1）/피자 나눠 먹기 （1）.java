import java.util.*;

class Solution {
    public int solution(int n) { 
        int answer = 0;
        int p = 0;
        for(int i=0; i<n; i++){
            p ++;
        }
        answer =(int)Math.ceil((double)p/7);
        return answer;
    }
}