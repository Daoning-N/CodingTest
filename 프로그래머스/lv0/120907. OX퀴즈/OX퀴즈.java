class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] q = quiz[i].split(" ");
            int num1 = Integer.parseInt(q[0]);
            int num2 = Integer.parseInt(q[2]);
            int num3 = Integer.parseInt(q[4]);
            
            if (q[1].equals("+")) {
                if ((num1 + num2) == num3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
            
            if (q[1].equals("-")) {
                if ((num1 - num2) == num3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}