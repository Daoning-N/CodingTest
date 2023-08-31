class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strk = Integer.toString(k);
        for(int a=i; a<=j; a++){
            String [] temp = Integer.toString(a).split("");
            for(int b=0; b<temp.length; b++){
                if(strk.equals(temp[b])){
                    answer++;
                }
            }
        }
        return answer;
    }
}