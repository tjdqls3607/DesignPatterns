package singleton;

public class Test {
    public static void main(String[] args) {
        // Logger 객체가 단 한개만 만들어져야 한다.

        Logger logger1 = new Logger();
        Logger logger2 = new Logger();
    }
}
