package homework.arrayUtil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 9, 6};
        ArrayUtil au = new ArrayUtil();

        au.allElements(array);
        System.out.println();
        System.out.print("Max is " + au.max(array));
        System.out.println();
        System.out.println("Min is "+au.min(array));
        System.out.print("Evens are ");
        au.even(array);
        System.out.println();
        System.out.print("Odds are ");
        au.odd(array);
        au.evenQaunt(array);
        au.oddQaunt(array);
        System.out.println();
        au.sum(array);
        System.out.println();
        au.averageSum(array);
        System.out.println();
        au.bubbleSortDown(array);
        System.out.println();
        au.bubbleSortUp(array);
    }
}
