public interface Handler {
    boolean handle(Request r);
    void add(Handler h);
}
