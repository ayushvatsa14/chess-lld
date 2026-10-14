package strategy;

import entity.Board;
import entity.Piece;

public class KnightMovement implements MovementStrategy{
    @Override
    public boolean canMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        int rowDiff = Math.abs(toRow - fromRow);
        int colDiff = Math.abs(toCol - fromCol);

        if (!((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2))) {
            return false;
        }

        Piece sourcePiece = board.getPieceAtPosition(fromRow, fromCol);
        Piece destinationPiece = board.getPieceAtPosition(toRow, toCol);

        if (destinationPiece != null && destinationPiece.getColor() == sourcePiece.getColor()) {
            return false;
        }

        return true;
    }
}
