package entity;

import strategy.RookMovement;

public class Rook extends Piece{
    public Rook(Color color, RookMovement movementStrategy) {
        super(color, movementStrategy);
    }
}
