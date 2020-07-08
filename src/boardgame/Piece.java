package boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // o Java ja faz isso por padrão
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(){
        //Hook method --> é um método que faz um gancho com a subclasse, pois necessita da implementação concreta do método em uma subclasse
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        for (boolean[] b:
             possibleMoves()) {
            for (boolean b1:
                 b) {
                    if(b1)//testa se b1 eh true
                        return b1;
            }

        }
        return false;
    }
}
