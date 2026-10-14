package strategy;

import entity.Board;
import entity.Color;
import entity.Piece;

public class PawnMovement implements MovementStrategy{
    @Override
    public boolean canMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        Piece sourcePiece = board.getPieceAtPosition(fromRow, fromCol);
        Piece destinationPiece = board.getPieceAtPosition(toRow, toCol);

        int direction = sourcePiece.getColor() == Color.WHITE ? -1 : 1;
        int rowDiff = toRow - fromRow;
        int colDiff = Math.abs(toCol - fromCol);

        if (colDiff == 0 && rowDiff == direction && destinationPiece == null) {
            return true;
        }

        int startingRow = sourcePiece.getColor() == Color.WHITE ? 6 : 1;

        if (colDiff == 0 && fromRow == startingRow
                && rowDiff == 2 * direction
                && destinationPiece == null
                && board.getPieceAtPosition(fromRow + direction, fromCol) == null) {
            return true;
        }

        if (colDiff == 1 && rowDiff == direction
                && destinationPiece != null
                && destinationPiece.getColor() != sourcePiece.getColor()) {
            return true;
        }

        return false;
    }
}
