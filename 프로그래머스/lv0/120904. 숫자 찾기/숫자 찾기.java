class Solution {
    public int solution(int num, int k) {
        int answer = -1; 

        String number = String.valueOf(num); 
        char targetChar = (char) (k + '0'); 

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c == targetChar) {
                answer = i + 1;
                break; 
            }
        }

        return answer;
    }
}