package chess.piece;

import chess.Color;

public class King extends Piece {

    public King(Color color) {
        super(color, PieceType.KING);
    }

    @Override
    public void move() {

    }

    @Override
    public boolean gameStopIfDie() {
        return true;
    }
}
