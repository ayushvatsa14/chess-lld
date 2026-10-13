package entity;

import strategy.PawnMovement;

public class Pawn extends Piece{
    public Pawn(Color color, PawnMovement movementStrategy) {
        super(color, movementStrategy);
    }
}
