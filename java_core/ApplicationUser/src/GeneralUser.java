public class GeneralUser {
    private UserType userType;
    private String userName;
    private String password;

    @Override
    public String toString() {
        return "User: " +
                "userType=" + userType +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '.';
    }

    public GeneralUser(UserType userType, String userName, String password) {
        this.userType = userType;
        this.userName = userName;
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

enum UserType{
    ADMIN,
    EDITOR,
    USER;

}