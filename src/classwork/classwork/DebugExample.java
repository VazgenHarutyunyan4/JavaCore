package classwork.classwork;

public class DebugExample {
    public static void main(String[] args) {
        int[] num = {7, 5, 3, 8, 9};

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
        num[0] = 66;
        num[1] = 33;
        num[2] = 11;
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
    }
}
