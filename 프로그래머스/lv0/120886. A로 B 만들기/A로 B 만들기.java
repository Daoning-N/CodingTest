import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String [] b = before.split("");
        String [] a = after.split("");
        Arrays.sort(b);
        Arrays.sort(a);
        
        String bStr = Arrays.toString(b);
        String aStr = Arrays.toString(a);
        
        if (aStr.equals(bStr)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}