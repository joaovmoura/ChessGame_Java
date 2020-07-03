package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] auxMat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i<board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                auxMat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return auxMat;
    }

    private void placeNewPiece(char column, int row, Piece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    private void initialSetup(){
        placeNewPiece('c', 2, new King(board, Color.BLACK));
        placeNewPiece('f', 7, new King(board, Color.WHITE));
    }
}
