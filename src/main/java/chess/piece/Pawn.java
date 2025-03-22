package chess.piece;

import chess.Color;
import chess.board.Position;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color, PieceType.PAWN);
    }

    @Override
    public void move() {

    }

    @Override
    public boolean isMovable(Position startPoint, Position destination) {
        return false;
    }
}
