import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int board_rows = board.length; 
        int board_cols = board[0].length; 

        boolean[][] visited = new boolean[board_rows][board_cols];

        for (int i = 0; i < board_rows; i++) {
            for (int j = 0; j < board_cols; j++) {
                if (board[i][j] == 1) {
                    visited[i][j] = true; 
                }
            }
        }
        
         for (int i = 0; i < board_rows; i++) {
            for (int j = 0; j < board_cols; j++) {
                if (visited[i][j]) {
                    if (i - 1 >= 0) board[i - 1][j] = 1;

                    if (i + 1 < board_rows) board[i + 1][j] = 1;

                    if (j - 1 >= 0) board[i][j - 1] = 1;
                    if (j + 1 < board_cols) board[i][j + 1] = 1;

                    if (i - 1 >= 0 && j - 1 >= 0) board[i - 1][j - 1] = 1;
                    if (i - 1 >= 0 && j + 1 < board_cols) board[i - 1][j + 1] = 1;

                    if (i + 1 < board_rows && j - 1 >= 0) board[i + 1][j - 1] = 1;
                    if (i + 1 < board_rows && j + 1 < board_cols) board[i + 1][j + 1] = 1;
                }
            }
        }
        
        int count = (int) Arrays.stream(board)
                .flatMapToInt(Arrays::stream)
                .filter(val -> val == 1)
                .count();
        
        answer = ((board_rows*board_cols) - count);
        
        return answer;
    }
}