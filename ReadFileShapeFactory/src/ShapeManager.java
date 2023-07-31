import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
    List<Shape> shapeList = new ArrayList<>();

    void readShapes(String path) {
        FileReader reader = new FileReader();
        List<String> fileRows = reader.readFile(path);
        for (int i = 0; i < fileRows.size(); i = i + 5) {
            generateShape(fileRows, i);
        }
    }

    private void generateShape(List<String> fileRows, int i) {
        if (Integer.parseInt(fileRows.get(i + 2)) == 3) {
            this.shapeList.add(new Triangle(Integer.parseInt(fileRows.get(i)),
                    Integer.parseInt(fileRows.get(i + 1)),
                    returnColor(fileRows.get(i + 3), fileRows.get(i + 4))));
        } else if (Integer.parseInt(fileRows.get(i + 2)) == 4) {
            this.shapeList.add(new Square(Integer.parseInt(fileRows.get(i)),
                    Integer.parseInt(fileRows.get(i + 1)),
                    returnColor(fileRows.get(i + 3), fileRows.get(i + 4))));
        }
    }

    static IColors returnColor(String colorType, String color) {
        if (colorType.equals("BASE")) {
            return new BaseColor(color);
        } else if (colorType.equals("RGB")) {
            return new RGBColor(color);
        } else
            return new BaseColor("");

    }


    public void show() {
        this.shapeList.forEach(System.out::println);
    }
}
