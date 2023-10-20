class Solution {
    public int[] solution(int[][] score) {
        int[] avg = new int[score.length];
            for(int i=0; i<score.length; i++){
                avg[i] = (score[i][0]+score[i][1]);
            }
        
        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            int result = 1;
            for(int j=0; j<score.length; j++){
                if(avg[i]<avg[j]){
                    result++;
                }
                answer[i] = result;
            }
        }
        return answer;
    }
}