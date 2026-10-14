package entity;

import strategy.MovementStrategy;

public abstract class Piece {
    private final Color color;
    private final MovementStrategy movementStrategy;

    protected Piece(Color color, MovementStrategy movementStrategy) {
        this.color=color;
        this.movementStrategy=movementStrategy;
    }

    public Color getColor() {
        return color;
    }

    public MovementStrategy getMovementStrategy() {
        return movementStrategy;
    }
}