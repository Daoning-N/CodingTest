import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        List<Integer> co = Arrays.stream(common).boxed().collect(Collectors.toList());
        Collections.reverse(co);
        int a = co.get(0) - co.get(1);
        if(a == (co.get(1) - co.get(2))) {
            answer = co.get(0) + a;
        } else {
            a = co.get(0) / co.get(1);
            answer = co.get(0) * a;
        }
        return answer;
    }
}