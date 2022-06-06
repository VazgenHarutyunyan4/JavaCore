package homework.stack;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker braceChecker1 = new BraceChecker("Hello from [Java]");
        BraceChecker braceChecker2 = new BraceChecker("Hello from {Java)");
        braceChecker1.check();
        braceChecker2.check();
    }
}
