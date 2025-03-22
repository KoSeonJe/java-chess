package chess;

import chess.board.ChessBoard;
import view.ConsoleView;

public class ChessGame {

    private final ChessBoard chessBoard;
    private final ConsoleView consoleView;

    public ChessGame(ChessBoard chessBoard, ConsoleView consoleView) {
        this.chessBoard = chessBoard;
        this.consoleView = consoleView;
    }

    public void start() {
        Turn currentTurn = Turn.getStartingTurn();
        consoleView.printBoard(chessBoard.getPieces());

        while (true) {

            currentTurn = currentTurn.changeTurn();
        }
    }
}
