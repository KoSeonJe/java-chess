package chess.piece;

import chess.Color;
import chess.board.Position;

public class King extends Piece {

    public King(Color color) {
        super(color, PieceType.KING);
    }

    @Override
    public void move() {

    }

    @Override
    public boolean isMovable(Position startPoint, Position destination) {
        return false;
    }

    @Override
    public boolean isGameStopIfDie() {
        return true;
    }
}
