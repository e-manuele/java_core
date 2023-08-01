public class AuthorizationHandler extends BasicHandler {

    protected Handler next;

    public void add(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request r) {
        if(r.authorization.equals(Authorization.STAFF)){
            System.out.println("AuthorizationH: User: "+r.user+" is staff");
        } else if (r.authorization.equals(Authorization.GUEST)){
            System.out.println("AuthorizationH: User: "+r.user+" is guest");
        } else if (r.authorization.equals(Authorization.NONE)){
            System.out.println("AuthorizationH: User: "+r.user+" is unauthorized");
        }
        if (this.next != null) {
            this.next.handle(r);
        }
    }


}
