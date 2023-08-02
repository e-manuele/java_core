import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RGBColor implements IColors {
List<Integer> rgb;
public RGBColor(String s){
    String[] rgbString= s.split(",");
    rgb = Arrays.stream(rgbString)
            .map(Integer::parseInt)
            .collect(Collectors.toList());
}
    @Override
    public String getColor() {
        return rgb.toString();
    }
}
