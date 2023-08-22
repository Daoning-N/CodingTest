class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum1=0;
        int sum2=x;
        while(x>0){
            sum1 += x%10;
            x /= 10;
        }
        answer = (sum2%sum1==0);
        return answer;
    }
}