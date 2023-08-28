class Solution {
    public String solution(String my_string, int num1, int num2) {
        //String answer = "";
        String []a = my_string.split("");
        String temp = a[num1];
        a[num1] = a[num2];
        a[num2] = temp;
        String answer = String.join("",a);
        return answer;
    }
}