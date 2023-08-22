class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long sum = 0;
        
        if (a <= b) { 
            for (long i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (long i = b; i <= a; i++) { 
                sum += i;
            }
        }
        
        answer = sum;
        return answer;
    }
}