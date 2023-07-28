public class Shape {
private final int x;
private final int y;
private final double radius;

private Shape(Builder builder) {
        x = builder.x;
        y = builder.y;
        radius = builder.radius;
        }
public static class Builder {
    private final int x;
    private final int y;
    private double radius;
    public Builder(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Builder radius(double radius) {
        this.radius = radius;
        return this;
    }

    public Shape build() {
        return new Shape(this);
    }
}
}

