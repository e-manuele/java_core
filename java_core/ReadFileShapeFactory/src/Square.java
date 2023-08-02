public class Square extends Shape{
    public Square(int x, int y, IColors color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        return "Square: " +
                "x=" + x +
                ", y=" + y +
                ", color=" + color.getColor();
    }
}
