public class Main {
    public static void main(String[] args) {
        Request r = new Request("pippo","pluto",Authorization.STAFF);
        Request r1 = new Request("dw","plutwddo",Authorization.GUEST);
        Request r2 = new Request("pinco","pallo",Authorization.GUEST);
        Request r3 = new Request("miao","bau",Authorization.NONE);
        Handler authenticationHandler = new AuthenticationHandler();
        Handler authorizationHandler = new AuthorizationHandler();
        authenticationHandler.add(authorizationHandler);
        if(authenticationHandler.handle(r)){
            System.out.println(r.user +" AUTH");
        }
        if(authenticationHandler.handle(r1)){
            System.out.println(r.user +" AUTH");
        }

        if(authenticationHandler.handle(r2)){
            System.out.println(r.user +" AUTH");
        }
        if(authenticationHandler.handle(r3)){
            System.out.println(r.user +" AUTH");
        }
        System.out.println("***");

    }
}