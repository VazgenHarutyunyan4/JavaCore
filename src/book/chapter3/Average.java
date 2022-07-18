package book.chapter3;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double a = 0;
        for (int i = 0; i < 5; i++) {
            a = a + nums[i];
        }
        System.out.println("Average is " + a / 5);

    }
}
