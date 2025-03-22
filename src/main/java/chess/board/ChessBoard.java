package chess.board;

import chess.Color;
import chess.piece.Bishop;
import chess.piece.King;
import chess.piece.Knight;
import chess.piece.Pawn;
import chess.piece.Piece;
import chess.piece.Queen;
import chess.piece.Rook;
import java.util.HashMap;
import java.util.Map;

public class ChessBoard {

    private final Map<Position, Piece> pieces;

    public ChessBoard(Map<Position, Piece> pieces) {
        this.pieces = pieces;
    }

    public void move() {

    }

    public Map<Position, Piece> getPieces() {
        return pieces;
    }

    public static ChessBoard initialize() {
        Map<Position, Piece> initialPieces = new HashMap<>();
        initialPieces.put(new Position(Row.ONE, Column.A), new Rook(Color.WHITE));
        initialPieces.put(new Position(Row.ONE, Column.B), new Knight(Color.WHITE));
        initialPieces.put(new Position(Row.ONE, Column.C), new Bishop(Color.WHITE));
        initialPieces.put(new Position(Row.ONE, Column.D), new Queen(Color.WHITE));
        initialPieces.put(new Position(Row.ONE, Column.E), new King(Color.WHITE));
        initialPieces.put(new Position(Row.ONE, Column.F), new Bishop(Color.WHITE));
        initialPieces.put(new Position(Row.ONE, Column.G), new Knight(Color.WHITE));
        initialPieces.put(new Position(Row.ONE, Column.H), new Rook(Color.WHITE));
        initialPieces.put(new Position(Row.TWO, Column.A), new Pawn(Color.WHITE));
        initialPieces.put(new Position(Row.TWO, Column.B), new Pawn(Color.WHITE));
        initialPieces.put(new Position(Row.TWO, Column.C), new Pawn(Color.WHITE));
        initialPieces.put(new Position(Row.TWO, Column.D), new Pawn(Color.WHITE));
        initialPieces.put(new Position(Row.TWO, Column.E), new Pawn(Color.WHITE));
        initialPieces.put(new Position(Row.TWO, Column.F), new Pawn(Color.WHITE));
        initialPieces.put(new Position(Row.TWO, Column.G), new Pawn(Color.WHITE));
        initialPieces.put(new Position(Row.TWO, Column.H), new Pawn(Color.WHITE));

        initialPieces.put(new Position(Row.EIGHT, Column.A), new Rook(Color.BLACK));
        initialPieces.put(new Position(Row.EIGHT, Column.B), new Knight(Color.BLACK));
        initialPieces.put(new Position(Row.EIGHT, Column.C), new Bishop(Color.BLACK));
        initialPieces.put(new Position(Row.EIGHT, Column.D), new Queen(Color.BLACK));
        initialPieces.put(new Position(Row.EIGHT, Column.E), new King(Color.BLACK));
        initialPieces.put(new Position(Row.EIGHT, Column.F), new Bishop(Color.BLACK));
        initialPieces.put(new Position(Row.EIGHT, Column.G), new Knight(Color.BLACK));
        initialPieces.put(new Position(Row.EIGHT, Column.H), new Rook(Color.BLACK));
        initialPieces.put(new Position(Row.SEVEN, Column.A), new Pawn(Color.BLACK));
        initialPieces.put(new Position(Row.SEVEN, Column.B), new Pawn(Color.BLACK));
        initialPieces.put(new Position(Row.SEVEN, Column.C), new Pawn(Color.BLACK));
        initialPieces.put(new Position(Row.SEVEN, Column.D), new Pawn(Color.BLACK));
        initialPieces.put(new Position(Row.SEVEN, Column.E), new Pawn(Color.BLACK));
        initialPieces.put(new Position(Row.SEVEN, Column.F), new Pawn(Color.BLACK));
        initialPieces.put(new Position(Row.SEVEN, Column.G), new Pawn(Color.BLACK));
        initialPieces.put(new Position(Row.SEVEN, Column.H), new Pawn(Color.BLACK));
        return new ChessBoard(initialPieces);
    }
}
