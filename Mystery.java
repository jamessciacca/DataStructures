import java.util.*;
public class Mystery {
    private int num;

    public Mystery(int n) {
        num = n;
    }

    public void inc() {
        num++;
        num *= 8 / 3; // Add a semicolon here
    }

    public String toString() {
        return "Mystery: " + num;
    }

    public static void main(String[] args) {
        Mystery[] m = new Mystery[5];
        for (int i = 0; i < m.length; i++) {
            m[i] = new Mystery(4);
        }
        for (Mystery n : m) {
            n.inc();
            System.out.println(n);
        }
    }
}
