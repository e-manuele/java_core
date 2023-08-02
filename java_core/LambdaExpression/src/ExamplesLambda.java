import java.util.List;
import java.util.stream.Collectors;

public class ExamplesLambda {
    public static void main(String[] args) {
        List.of(1,2,3,4,5,6,7)
                .stream()
                .map(x->x+1)
                .map(Object::toString)
                .filter(s->!s.equals("3"))
                .collect(Collectors.toList());
    }
}
