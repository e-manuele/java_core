public enum Role {
    SOFTWARE_DEVELOPER("software_developer"),
    PRODUCT_MANAGER("product_manager");

    private final String value;
    Role(String value) {
        this.value = value;
    }

    public static Role getRole(String value){
        for(Role r: Role.values()){
            if(r.value.equals(value)){
                return r;
            }
        }
        return null;
    }
}
