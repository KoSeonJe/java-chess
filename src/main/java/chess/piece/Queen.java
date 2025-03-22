package chess.piece;

import chess.Color;
import chess.board.Position;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color, PieceType.QUEEN);
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
        return false;
    }
}
