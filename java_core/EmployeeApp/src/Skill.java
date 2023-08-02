public enum Skill {
    SOFTWARE_DEVELOPMENT("software_development"),
    PERSONNEL_MANAGEMENT("personnel_management"),
    APP_DEVELOPER("software_development"),
    APP_ENGINEERING("app_engineering");
    private final String value;
    Skill(String value) {
        this.value = value;
    }
    public static Skill getSkill(String value){
        for(Skill r: Skill.values()){
            if(r.value.equals(value)){
                return r;
            }
        }
        return null;
    }
}
