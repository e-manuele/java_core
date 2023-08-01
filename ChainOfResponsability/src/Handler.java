public interface Handler {
    void handle(Request r);
    void add(Handler h);
}
