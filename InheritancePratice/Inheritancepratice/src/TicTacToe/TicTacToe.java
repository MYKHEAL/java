package TicTacToe;


public class TicTacToe {
    final CellValue[][] board;
    private CellValue currentPlayer;


    public TicTacToe() {
        board = new CellValue[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = CellValue.EMPTY;
            }
        }
        currentPlayer = CellValue.X;
    }

    public boolean makeMove(int position) {
        int row = position / 3;
        int col = position % 3;
        if (isValidMove(row, col)) {

            board[row][col] = currentPlayer;
            currentPlayer = currentPlayer.nextPlayer();
            return true;
        }
        return false;
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == CellValue.EMPTY;
    }

    public CellValue getCurrentPlayer() {
        return currentPlayer;
    }

    public CellValue[][] getBoard() {
      return board;
    }


    public CellValue getGameStatus() {
       for (int row = 0; row < 3; row++) {
            if (board[row][0] != CellValue.EMPTY && board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                return board[row][0];
            }

            if (board[0][row] != CellValue.EMPTY && board[0][row] == board[1][row] && board[1][row] == board[2][row]) {
               return board[0][row];
            }

        }


        if (board[0][0] != CellValue.EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }

        if (board[0][2] != CellValue.EMPTY && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == CellValue.EMPTY) {
                    return null;
                }
            }
        }
        return CellValue.EMPTY;
   }



    public void displayBoard() {
        for (int row = 0; row < 3; row++) {
            System.out.print(" " + board[row][0].getDisplayChar() + " | " +
                    board[row][1].getDisplayChar() + " | " +
                    board[row][2].getDisplayChar() + " ");
            System.out.println();
            if (row < 2) {
                System.out.println("---+---+---");
            }
        }
    }
}