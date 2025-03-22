package chess.piece;

import chess.Color;
import chess.board.Position;
import java.util.List;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color, PieceType.KNIGHT);
    }

    @Override
    public boolean isMovable(Position startPoint, Position destination) {
        return false;
    }

    @Override
    public List<Position> createAllPaths(Position startPoint, Position destination) {
        return List.of();
    }

    @Override
    public boolean canJumpOver() {
        return true;
    }
}
