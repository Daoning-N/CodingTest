class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char []sarr = s.toCharArray();
        int p =0;
        int y =0;
        for(int i=0; i<s.length(); i++){
        if(sarr[i]==('p')||sarr[i]==('P')){
                    p++;
                }else if(sarr[i]==('y')||sarr[i]==('Y')){
                    y++;
                }
        }
        answer = (p == y);
        return answer;
    }
}