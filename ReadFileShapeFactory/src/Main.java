import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = "C:/Users/Emanuele/IdeaProjects/java_core/ReadFileShape/src/Shapes.txt";
        ShapeCreator manager = new ShapeCreator();
        manager.readShapes(path);
        manager.show();
    }


}