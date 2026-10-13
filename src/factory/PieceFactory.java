package factory;

import entity.*;
import strategy.*;

public class PieceFactory {
    public static Piece createPiece(PieceType type, Color color) {
        return switch (type) {
            case KING -> new King(color, new KingMovement());
            case QUEEN -> new Queen(color, new QueenMovement());
            case ROOK -> new Rook(color, new RookMovement());
            case BISHOP -> new Bishop(color, new BishopMovement());
            case KNIGHT -> new Knight(color, new KnightMovement());
            case PAWN -> new Pawn(color, new PawnMovement());
        };
    }
}
