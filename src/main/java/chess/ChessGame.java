package chess;

import chess.board.ChessBoard;
import chess.board.Position;
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
        consoleView.printTurn(currentTurn);
        Position startPoint = consoleView.requestStartPoint();
        Position destination = consoleView.requestDestination();
        while (true) {

            currentTurn = currentTurn.changeTurn();
        }
    }
}
