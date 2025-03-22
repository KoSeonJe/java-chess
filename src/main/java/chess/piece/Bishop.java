package chess.piece;

import chess.Color;
import chess.board.Position;

public class Bishop extends Piece{

    public Bishop(Color color) {
        super(color, PieceType.BISHOP);
    }

    @Override
    public void move() {

    }

    @Override
    public boolean isMovable(Position startPoint, Position destination) {
        return false;
    }
}
