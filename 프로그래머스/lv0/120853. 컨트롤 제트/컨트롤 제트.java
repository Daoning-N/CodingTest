class Solution {
    public int solution(String s) {
        int answer = 0;
        int sum = 0;
        String[] temp = s.split(" ");
        
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals("Z")) {
                sum -= Integer.parseInt(temp[i - 1]);
            } else {
                sum += Integer.parseInt(temp[i]);
            }
        }
        
        answer = sum;
        return answer;
    }
}