package chess.piece;

import chess.Color;
import chess.board.Position;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color, PieceType.KNIGHT);
    }

    @Override
    public void move() {

    }

    @Override
    public boolean isMovable(Position startPoint, Position destination) {
        return false;
    }
}
