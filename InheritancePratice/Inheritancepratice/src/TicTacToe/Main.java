package TicTacToe;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner input = new Scanner(System.in);

        while (true) {
            game.displayBoard();
            System.out.println("Player " + game.getCurrentPlayer().getDisplayChar() + ", enter row (1-3) and column (1-3): ");
            int row = input.nextInt() - 1;
            int col = input.nextInt() - 1;

            if (!game.makeMove(row, col)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            CellValue status = game.getGameStatus();
            if (status != null) {
                game.displayBoard();
                if (status == CellValue.EMPTY) {
                    System.out.println("It's a draw!");
                } else {
                    System.out.println("Player " + status.getDisplayChar() + " won!");
                }
                break;
            }
        }
        input.close();
    }
}