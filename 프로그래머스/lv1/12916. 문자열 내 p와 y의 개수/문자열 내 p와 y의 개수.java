class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p=0;
        int y=0;
        char [] charArr = s.toCharArray();
        for(int i=0; i<charArr.length; i++){
            if(charArr[i]=='p'||charArr[i]=='P'){
                p++;
            }else if(charArr[i]=='y'||charArr[i]=='Y'){
                y++;
            }
        }
        answer = (p==y);
        return answer;
    }
}