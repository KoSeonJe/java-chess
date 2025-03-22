package chess.piece;

import chess.Color;
import chess.board.BoardVector;
import chess.board.Position;
import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece{

    public Bishop(Color color) {
        super(color, PieceType.BISHOP);
    }

    @Override
    public boolean isMovable(Position startPoint, Position destination) {
        BoardVector boardVector = BoardVector.createVector(startPoint, destination);
        return boardVector.getAbsDx() == boardVector.getAbsDy();
    }

    @Override
    public List<Position> createAllPaths(Position startPoint, Position destination) {
        List<Position> paths = new ArrayList<>();

        BoardVector boardVector = BoardVector.createVector(startPoint, destination);
        Position path = startPoint;
        if (boardVector.isOneQuadrant()) {
            for (int i = 0; i < boardVector.dx() - 1; i++) {
                path = path.moveRightUp();
                paths.add(path);
            }
        }
        if (boardVector.isTwoQuadrant()) {
            for (int i = 0; i < boardVector.dx(); i++) {
                path = path.moveLeftUp();
                paths.add(path);
            }
        }
        if (boardVector.isThreeQuadrant()) {
            for (int i = 0; i < boardVector.dx(); i++) {
                path = path.moveLeftDown();
                paths.add(path);
            }
        }
        if (boardVector.isFourQuadrant()) {
            for (int i = 0; i < boardVector.dx(); i++) {
                path = path.moveRightDown();
                paths.add(path);
            }
        }

        return paths;
    }
}
