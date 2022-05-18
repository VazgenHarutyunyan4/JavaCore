package homework.arrayUtil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {17, 21, -4, -1, 0, 1, 4, 7, 10, 13};

        //print array's all elements
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

        //print array's max and min
        int max = array[0];
        int min = array[0];
        for (int i = 0; i <= 9; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max is " + max);
        System.out.println("min is " + min);

        //print array's even elements
        System.out.print("even are ");
        for (int x : array) {
            if (x % 2 == 0) {
                System.out.print(x + ", ");
            }
        }

        //print array's odd elements
        System.out.println();
        System.out.print("odds are ");
        for (int x : array) {
            if (x % 2 != 0) {
                System.out.print(x + ", ");
            }
        }
        System.out.println();

        //print quantity of evens
        System.out.print("Evens length = ");
        int evensLen = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evensLen++;
            }
        }
        //print quantity of odds
        System.out.println(evensLen);
        System.out.print("Odds length = ");
        int oddsLen = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddsLen++;
            }
        }

        System.out.println(oddsLen);

        //print array element's average sum and sum
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Average sum = " + sum / array.length);
        System.out.println("Elements sum = " + sum);
    }
}

