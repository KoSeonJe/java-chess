package chess.piece;

import chess.Color;

public class Bishop extends Piece{

    public Bishop(Color color) {
        super(color, PieceType.BISHOP);
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "B";
    }
}
