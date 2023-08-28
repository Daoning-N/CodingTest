class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            int temp=numbers[numbers.length-1];
            for(int i=0; i<numbers.length-1; i++){
                answer[i+1]=numbers[i];
            }
            answer[0] = temp;
        }else{
            int temp=numbers[0];
            for(int i=numbers.length-1; i>0; i--){
                answer[i-1] = numbers[i];
            }
            answer[answer.length-1]=temp;
        }
        return answer;
    }
}