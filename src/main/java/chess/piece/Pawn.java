package chess.piece;

import chess.Color;
import chess.board.BoardVector;
import chess.board.Position;
import java.util.List;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color, PieceType.PAWN);
    }

    @Override
    public boolean isMovable(Position startPoint, Position destination) {
        BoardVector boardVector = BoardVector.createVector(startPoint, destination);
        if (color == Color.BLACK) {
            return boardVector.getAbsDy() == -1 && boardVector.getAbsDx() == 0;
        }

        if (color == Color.WHITE) {
            return boardVector.getAbsDy() == 1 && boardVector.getAbsDx() == 0;
        }

        throw new IllegalStateException("[ERROR] 현재 기물의 색이 정해져있지 않습니다");
    }

    @Override
    public List<Position> createAllPaths(Position startPoint, Position destination) {
        return List.of();
    }
}
