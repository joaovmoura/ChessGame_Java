package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // o Java ja faz isso por padrão
    }

    protected Board getBoard() {
        return board;
    }
}
