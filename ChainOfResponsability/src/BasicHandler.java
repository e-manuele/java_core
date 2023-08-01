public class BasicHandler implements Handler {
    protected  Handler next;
    public void add(Handler next){
        this.next = next;
    }
    @Override
    public void handle(Request r) {
        if(next!=null){
            next.handle(r);
        }
    }
}
