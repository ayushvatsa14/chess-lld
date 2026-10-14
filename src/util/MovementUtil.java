package util;

import entity.Board;

public class MovementUtil {
    public static boolean isHorizontalMove(int fromRow, int fromCol, int toRow, int toCol) {
        return fromRow == toRow && fromCol != toCol;
    }

    public static boolean isVerticalMove(int fromRow, int fromCol, int toRow, int toCol) {
        return fromCol == toCol && fromRow != toRow;
    }

    public static boolean isDiagonalMove(int fromRow, int fromCol, int toRow, int toCol) {
        return Math.abs(toRow - fromRow) == Math.abs(toCol - fromCol) && fromRow != toRow;
    }

    public static boolean isPathClear(Board board, int fromRow, int fromCol, int toRow, int toCol) {

        int rowStep = Integer.compare(toRow, fromRow);
        int colStep = Integer.compare(toCol, fromCol);

        int row = fromRow + rowStep;
        int col = fromCol + colStep;

        while (row != toRow || col != toCol) {
            if (board.getPieceAtPosition(row, col) != null) {
                return true;
            }

            row += rowStep;
            col += colStep;
        }

        return false;
    }
}