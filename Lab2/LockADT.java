public interface LockADT {
    void alter(int x, int y, int z);
    void turn(String direction, int number);
    void close();
    boolean attempt(int x, int y, int z);
    String inquire();
    int current();
    @Override
    String toString();
}