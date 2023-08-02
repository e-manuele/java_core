import java.util.Map;

public class AuthenticationHandler extends BasicHandler {
    Map<String, String> userMap;
    String path = "C:/Users/Emanuele/IdeaProjects/java_core/ChainOfResponsability/src/userMap.txt";

    public AuthenticationHandler() {
        UserMapGenerator reader = new UserMapGenerator();
        this.userMap = reader.read(path);
    }

    protected Handler next;

    public void add(Handler next) {
        this.next = next;
    }

    @Override
    public boolean handle(Request r) {
        if (userMap.get(r.user) != null) {
            if (userMap.get(r.user).equals(r.passwd)) {
                r.authenticate();
                System.out.println("AuthenticationH: User: " + r.user +" is authenticated");
            } else {
                System.out.println("AuthenticationH: Incorrect pwd for " + r.user);
                return false;
            }

        } else {
            System.out.println("AuthenticationH: User: " + r.user + " not present");
            return false;
        }
        if (this.next != null && r.isAuth()) {
             return this.next.handle(r);
        }


        return false;
    }

}



