package chess.piece;

import chess.Color;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color, PieceType.QUEEN);
    }

    @Override
    public void move() {

    }

    @Override
    public boolean gameStopIfDie() {
        return false;
    }
}
