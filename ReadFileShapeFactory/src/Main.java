public class Main {

    public static void main(String[] args) {
        String path = "C:/Users/Emanuele/IdeaProjects/java_core/ReadFileShapeFactory/src/Shapes.txt";
        ShapeManager manager = new ShapeManager();
        manager.readShapes(path);
        manager.show();
    }
}