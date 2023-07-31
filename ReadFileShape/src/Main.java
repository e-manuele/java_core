import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = "C:/Users/Emanuele/IdeaProjects/java_core/ReadFileShape/src/Shapes.txt";
        List<Shape> shapeList = Shape.readShapes(path);
        shapeList.forEach(System.out::println);
    }


}