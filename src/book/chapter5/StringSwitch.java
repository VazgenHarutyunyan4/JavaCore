package book.chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String txt = "two";

        switch (txt){
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}
