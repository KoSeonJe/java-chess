package view;

import chess.board.Position;
import chess.piece.Piece;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import view.support.BoardComparator;
import view.support.OutputSupporter;

public class ConsoleView {

    private final OutputSupporter outputSupporter;

    public ConsoleView(OutputSupporter outputSupporter) {
        this.outputSupporter = outputSupporter;
    }

    public void printBoard(Map<Position, Piece> pieces) {
        Map<Position, Piece> filledPieces = outputSupporter.fillBoard(pieces);
        List<Position> positions = new ArrayList<>(filledPieces.keySet());
        positions.sort(new BoardComparator());

        StringBuilder builder = new StringBuilder();
        Position printPosition = positions.getFirst();
        builder.append(printPosition.row().ordinal()).append(" ");

        for (Position position : positions) {
            Piece piece = filledPieces.get(position);
            if (printPosition.row() != position.row()) {
                builder.append("\n").append(position.row().ordinal()).append(" ");
                printPosition = position;
            }
            if (piece == null) {
                builder.append("- ").append(" ");
                continue;
            }
            String formattedPiece = outputSupporter.formatPiece(piece);
            builder.append(formattedPiece).append(" ");
        }
        builder.append("\n").append("  A  B  C  D  E  F  G  H").append("\n\n");
        System.out.println(builder);
    }
}
