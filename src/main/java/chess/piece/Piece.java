package chess.piece;

import chess.Color;

public abstract class Piece {

    protected final Color color;
    protected final PieceType pieceType;

    public Piece(Color color, PieceType pieceType) {
        this.color = color;
        this.pieceType = pieceType;
    }

    public abstract void move();

    public boolean isEqualColor(Color color) {
        return this.color == color;
    }

    public boolean gameStopIfDie(){
        return false;
    };

    public Color getColor() {
        return color;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
}
