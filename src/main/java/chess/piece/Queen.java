package chess.piece;

import chess.Color;
import chess.board.Position;
import java.util.List;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color, PieceType.QUEEN);
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
    public boolean isGameStopIfDie() {
        return false;
    }
}
