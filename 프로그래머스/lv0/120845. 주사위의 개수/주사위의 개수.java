class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int i=0; i<box.length; i++){
            box[i] /= n;
        }
        for(int j=0; j<box.length; j++){
            answer *= box[j];
        }
        return answer;
    }
}