package entity;

import strategy.KingMovement;

public class King extends Piece{
    public King(Color color, KingMovement movementStrategy) {
        super(color, movementStrategy);
    }
}
