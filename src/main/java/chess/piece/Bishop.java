package chess.piece;

import chess.Color;
import chess.board.Position;
import java.util.List;

public class Bishop extends Piece{

    public Bishop(Color color) {
        super(color, PieceType.BISHOP);
    }

    @Override
    public boolean isMovable(Position startPoint, Position destination) {
        return false;
    }

    @Override
    public List<Position> createAllPaths(Position startPoint, Position destination) {
        return List.of();
    }
}
