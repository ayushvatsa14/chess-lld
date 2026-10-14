package strategy;

import entity.Board;
import entity.Piece;
import util.MovementUtil;

public class BishopMovement implements MovementStrategy{
    @Override
    public boolean canMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        if (!MovementUtil.isDiagonalMove(fromRow, fromCol, toRow, toCol)) {
            return false;
        }

        if (MovementUtil.isPathClear(board, fromRow, fromCol, toRow, toCol)) {
            return false;
        }

        Piece sourcePiece = board.getPieceAtPosition(fromRow, fromCol);
        Piece destinationPiece = board.getPieceAtPosition(toRow, toCol);

        if (destinationPiece != null &&
                destinationPiece.getColor() == sourcePiece.getColor()) {
            return false;
        }

        return true;
    }
}
