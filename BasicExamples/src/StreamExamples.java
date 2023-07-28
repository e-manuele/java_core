import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        Integer x = 8;
        Optional<Integer> optInt = Optional.ofNullable(x);
        System.out.println(generateOptionalInteger(optInt));
        System.out.println(returnListFromOptInt(optInt));
        List<Integer> a = returnListFromOptInts(optInt);
        Collections.reverse(a);
        System.out.println(a);

    }

    public static List<Integer> generateOptionalInteger(Optional<Integer> o) {
        List<Integer> listInt = new ArrayList<Integer>();
        if (o != null) {
            for (int i = o.get(); i > 0; i--) {
                listInt.add(i);
            }
        }
        return listInt;
    }

    public static List<Integer> returnListFromOptInt(Optional<Integer> o) {
        if (o.isPresent()) {
            return Stream.of(o)
                    .map(x -> createList(x))
                    .flatMap((List<Integer> l) -> l.stream())
                    .collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    private static List<Integer> createList(Optional<Integer> x) {
        List<Integer> intList = new ArrayList<>(x.get());
        for (int i = x.get(); i > 0; i--) {
            intList.add(i);
        }
        return intList;
    }

    public static List<Integer> returnListFromOptInts(Optional<Integer> o) {
        if (o.isPresent()) {
            return
                    (IntStream.range(1, o.get() + 1))
                            .boxed()
                            //.sorted((o1, o2) -> o1 - o2 >= 0 ? -1 : 1)
                            .collect(Collectors.toList())
                    ;
        }
        return new ArrayList<>();
    }
}

// STREAM API EXERCISE