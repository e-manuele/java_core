public class MainShape {
    public static void main(String[] args) {
    //in client code
    int x = 8;
    int y= 9;
    int radiusValue =9;
    Shape rectangle = new Shape.Builder(x,y).build();
    Shape circle = new Shape.Builder(x,y).radius(radiusValue).build();

} }
