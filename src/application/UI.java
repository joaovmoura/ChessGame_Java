package application;

//User Interface

import boardgame.Piece;
import chess.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] chessPieces) {
        for (int i = 0; i<chessPieces.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < chessPieces[0].length; j++) {
                printPiece(chessPieces[i][j]);
            }
            System.out.println();
        }
        System.out.print("  a b c d e f g h");
    }

    public static void printPiece(Piece piece){
        if (piece != null) {
            System.out.print(piece + " ");
        } else {
            System.out.print("- ");
        }
    }
}