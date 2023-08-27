import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String my = my_string.replaceAll("[^0-9]","");
        int[] answer = new int[my.length()];
        for(int i=0; i<my.length(); i++){
             answer[i] = Character.getNumericValue(my.charAt(i));
        }
        Arrays.sort(answer);
        return answer;
    }
}