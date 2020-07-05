package application;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.nio.charset.CharacterCodingException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.J;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch c = new ChessMatch();

        while (true){
            try{
                UI.clearScreen();
                UI.printBoard(c.getPieces());
                System.out.println();
                System.out.print("Source:");
                ChessPosition source = UI.readChessPosition(sc);
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece chessPiece = c.performChessMove(source, target);
                UI.printPiece(chessPiece);
                sc.nextLine();
                UI.printBoard(c.getPieces());
            } catch (ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }catch (InputMismatchException i){
                System.out.println(i.getMessage());
                sc.nextLine();
            }

        }

    }
}
