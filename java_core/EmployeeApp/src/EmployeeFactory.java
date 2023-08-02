import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFactory {
    FileReader fileReader;
    String path;

    public EmployeeFactory(FileReader fileReader, String path) {
        this.fileReader = fileReader;
        this.path = path;
    }

    public List<Employee> generateEmployee() {
        List<String> employeeData = fileReader.readFile(path);
        return employeeData.stream()
                .map(this::decodeEmployeeString)
                .collect(Collectors.toList());
    }

    private Employee decodeEmployeeString(String c) { //String name, Role role, List<Skill> skillList
        String[] dataSplitted = c.split(",");
        return new Employee(dataSplitted[0],
                Role.getRole(dataSplitted[1]),
                Arrays.asList(dataSplitted)
                        .subList(2, dataSplitted.length)
                        .stream()
                        .map(Skill::getSkill)
                        .collect(Collectors.toList()));
    }
}
