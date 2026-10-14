package strategy;

import entity.Board;
import entity.Piece;
import util.MovementUtil;

public class RookMovement implements MovementStrategy{
    @Override
    public boolean canMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        boolean validMovement =
                MovementUtil.isHorizontalMove(fromRow, fromCol, toRow, toCol)
                        || MovementUtil.isVerticalMove(fromRow, fromCol, toRow, toCol);

        if (!validMovement) {
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
