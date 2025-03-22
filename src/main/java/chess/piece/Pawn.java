package chess.piece;

import chess.Color;
import chess.board.Position;
import java.util.List;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color, PieceType.PAWN);
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
