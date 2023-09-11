class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("left")){
                x += -1;
            }else if(keyinput[i].equals("right")){
                x += 1;
            }else if(keyinput[i].equals("up")){
                y += 1;
            }else{
                y += -1;
            }
            if(board[0]/2<x){
                x -= (x-(board[0]/2));
            }else if(-(board[0]/2)>x){
                x += -(x+(board[0]/2));
            }else if(board[1]/2<y){
                y -= (y-(board[1]/2));
            }else if(-(board[1]/2)>y){
                y += -(y+(board[1]/2));
            }
        }
        answer[0]=x;
        answer[1]=y;
        return answer;
    }
}