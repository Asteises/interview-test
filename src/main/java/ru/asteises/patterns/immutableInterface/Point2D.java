package main.java.ru.asteises.patterns.immutableInterface;

public class Point2D implements ImmutablePoint2D {

    private int x;
    private int y;
    public Point2D(int x, int y) { this.x = x; this.y = y; }

    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public void setX(int newX) { this.x = newX; }
    public void setY(int newY) { this.y = newY; }
}
