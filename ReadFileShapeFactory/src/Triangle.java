public class Triangle extends Shape{
    public Triangle(int x, int y, IColors color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "x=" + x +
                ", y=" + y +
                ", color=" + color.getColor();
    }
}
