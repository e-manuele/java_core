public class Shape {
    int x;
    int y;

    IColors color;

    public Shape(int x, int y, IColors color) {
        this.x = x;
        this.y = y;

        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape: " +
                "x=" + x +
                ", y=" + y +
                ", color=" + color.getColor();
    }

}
