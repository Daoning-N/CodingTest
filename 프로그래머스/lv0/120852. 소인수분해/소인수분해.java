import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(n%i==0){
                while(n%i==0){
                    n /= i;
                }
                num.add(i);
            }
        }
        int[] answer = new int[num.size()];
        for(int i=0; i<num.size(); i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}