package tictactoe;

public class TicTacToe {
    private int[][] board;
    TicTacToe(){
        board = new int[][]{
                {0,0,0},{0,0,0},{0,0,0}
        };
    }

    public int place(int player, int row, int column){
        if(board[row][column] != 0) return 3;
        else board[row][column] = player;

        if (win(1) == 1) return 1;
        if (win(2) == 1) return 2;

        return 0;
    }

    private int win(int player){
        for(int i = 0; i < 3; i ++){
            if((board[i][0] == player) && (board[i][1] == player) && (board[i][2] == player)) return 1;
        }
        for(int j = 0; j < 3; j ++){
            if((board[0][j] == player) && (board[1][j] == player) && (board[2][j] == player)) return 1;
        }
        if((board[0][0] == player) && (board[1][1] == player) && (board[2][2] == player)) return 1;
        if((board[0][2] == player) && (board[1][1] == player) && (board[2][0] == player)) return 1;

        return 0;
    }
}
