package chess.piece;

import chess.Color;
import chess.board.Position;
import java.util.List;

public abstract class Piece {

    protected final Color color;
    protected final PieceType pieceType;

    public Piece(Color color, PieceType pieceType) {
        this.color = color;
        this.pieceType = pieceType;
    }

    public abstract void move();

    public abstract boolean isMovable(Position startPoint, Position destination);

    public boolean isEqualColor(Color color) {
        return this.color == color;
    }

    public boolean isGameStopIfDie(){
        return false;
    };

    public Color getColor() {
        return color;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public abstract List<Position> createAllPaths(Position startPoint, Position destination);

    public abstract boolean canArrive(List<Piece> pathPieces);
}
