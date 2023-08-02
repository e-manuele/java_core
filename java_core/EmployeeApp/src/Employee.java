import java.util.List;

public class Employee {
    String name;
    Role role;
    List<Skill> skillList;

    public Employee(String name, Role role, List<Skill> skillList) {
        this.name = name;
        this.role = role;
        this.skillList = skillList;
    }
}
