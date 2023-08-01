import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapGenerator {

    public Map<String,String> read(String path){
        Map<String,String> map = new HashMap<String, String>() {};
        FileReader reader = new FileReader();
        List<String> fileRows = reader.readFile(path);
        fileRows.stream()
                .map(c->c.split(","))
                .forEach(c->map.put(c[0],c[1]));
//        fileRows.forEach(System.out::println);
        return map;
    }
}
