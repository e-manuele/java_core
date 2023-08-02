import java.util.HashMap;

public  class ApplicationUser {
    private static HashMap<String, GeneralUser> generalUsers = new HashMap<String, GeneralUser>();

    public static GeneralUser findUser(String username, String password) {
        if (generalUsers.get(username) == null) {
            System.out.printf("User %s not found.\n", username);
        } else if (password.equals(generalUsers.get(username).getPassword())) {
            System.out.println("User found.");
            return generalUsers.get(username);
        } else {
            System.out.println("Incorrect password.");
        }
        return null;
    }

    public static void createUser(String username, String password, UserType userType) {
        generalUsers.put(username, new GeneralUser(userType, username, password));
        System.out.println("Created new account: " + generalUsers.get(username));
    }

}
