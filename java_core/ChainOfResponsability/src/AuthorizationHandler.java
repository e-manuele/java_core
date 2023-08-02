public class AuthorizationHandler extends BasicHandler {

    protected Handler next;

    public void add(Handler next) {
        this.next = next;
    }

    @Override
    public boolean handle(Request r) {
        if (r.authorization.equals(Authorization.STAFF)) {
//            System.out.println("AuthorizationH: User: " + r.user + " is staff");
            return true;
        } else if (r.authorization.equals(Authorization.GUEST)) {
//            System.out.println("AuthorizationH: User: " + r.user + " is guest");
            return false;
        } else if (r.authorization.equals(Authorization.NONE)) {
//            System.out.println("AuthorizationH: User: " + r.user + " is unauthorized");
            return false;
        } else {

            if (this.next != null) {
                return this.next.handle(r);
            }
        }


        return false;
    }
}