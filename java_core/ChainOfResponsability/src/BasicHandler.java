public class BasicHandler implements Handler {
    protected  Handler next;
    public void add(Handler next){
        this.next = next;
    }
    @Override
    public boolean handle(Request r) {
        if(next!=null){
            next.handle(r);
        }
        return false;
    }
}
