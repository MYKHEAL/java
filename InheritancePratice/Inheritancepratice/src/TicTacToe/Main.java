package TicTacToe;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner input = new Scanner(System.in);

        while (true) {
            game.displayBoard();
            System.out.println("Player " + game.getCurrentPlayer().getDisplayChar() + ", enter a number: ");
            int position = input.nextInt() - 1;

            if (!game.makeMove(position)) {
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