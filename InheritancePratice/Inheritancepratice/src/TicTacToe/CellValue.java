package TicTacToe;

public enum CellValue {
    X, O, EMPTY;

    public char getDisplayChar() {
        return this == X ? 'X' : this == O ? 'O' : ' ';
    }


    public CellValue nextPlayer() {
        return this == X ? O : X;
    }
}