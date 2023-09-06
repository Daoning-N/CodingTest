class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String []my = my_string.split(" ");
        answer += Integer.parseInt(my[0]);
        for(int i=1; i<my.length; i++){
            if(my[i].equals("+")){
                answer += Integer.parseInt(my[i+1]);
            }
            if(my[i].equals("-")){
                answer -= Integer.parseInt(my[i+1]);
            }
        }
        return answer;
    }
}