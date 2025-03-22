package chess.piece;

import chess.Color;
import chess.board.Position;

public class Rook extends Piece {

    public Rook(Color color) {
        super(color, PieceType.ROOK);
    }

    @Override
    public void move() {

    }

    @Override
    public boolean isMovable(Position startPoint, Position destination) {
        return false;
    }
}
