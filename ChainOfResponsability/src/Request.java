public class Request {
    String user;
    String passwd;
    boolean auth;
    Authorization authorization;

    public Request(String user, String passwd,Authorization authorization) {
        this.user = user;
        this.passwd = passwd;
        this.auth = false;
        this.authorization = authorization;
    }

    public boolean isAuth() {
        return auth;
    }

    public void authenticate(){
        this.auth = true;
    }
    public String getUser() {
        return user;
    }

    public String getPasswd() {
        return passwd;
    }
}
