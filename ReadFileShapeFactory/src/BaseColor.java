public class BaseColor implements IColors {
    BaseColorEnum color;

    public BaseColor(String color) {
        this.color = BaseColorEnum.checksColor(color);
    }

    @Override
    public String getColor() {
        return this.color.name();
    }


}
