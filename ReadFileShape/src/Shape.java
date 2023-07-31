import java.util.ArrayList;
import java.util.List;

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
        return "Shape:" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color.getColor();
    }
    static List<Shape> readShapes(String path) {
        FileReader reader = new FileReader();
        List<String> fileRows = reader.readFile(path);
        List<Shape> shapeList= new ArrayList<>();
        for (int i = 0; i < fileRows.size(); i = i + 3) {
            Shape shape = new Shape(Integer.parseInt(fileRows.get(i)),
                    Integer.parseInt(fileRows.get(i + 1)),
                    new BaseColor(fileRows.get(i + 2)));
            shapeList.add(shape);
        }
        return shapeList;
    }
}
