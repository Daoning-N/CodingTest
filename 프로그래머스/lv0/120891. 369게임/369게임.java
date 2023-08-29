class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order); 
        String[] temp = orderStr.split(""); 
        
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals("3") || temp[i].equals("6") || temp[i].equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}