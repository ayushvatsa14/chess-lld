package strategy;

import entity.Board;
import entity.Piece;

public class KingMovement implements MovementStrategy{
    @Override
    public boolean canMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        int rowDiff = Math.abs(toRow - fromRow);
        int colDiff = Math.abs(toCol - fromCol);

        if (rowDiff > 1 || colDiff > 1 || rowDiff + colDiff == 0) {
            return false;
        }

        Piece destinationPiece = board.getPieceAtPosition(toRow, toCol);
        Piece sourcePiece = board.getPieceAtPosition(fromRow, fromCol);

        if (destinationPiece != null && destinationPiece.getColor() == sourcePiece.getColor()) {
            return false;
        }

        return true;
    }
}
