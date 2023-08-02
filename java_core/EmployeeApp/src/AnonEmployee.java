import java.util.List;

public class AnonEmployee {
    private static AnonEmployee INSTANCE;
    private Role role;
    private List<Skill> skillList;

    private AnonEmployee() {
    }

    public static AnonEmployee getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AnonEmployee();
        }
        return INSTANCE;
    }
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    // getters and setters
}

