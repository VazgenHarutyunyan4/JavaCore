package homework.arrayUtil;

public class ArrayUtil {
    void allElements(int[] array) {
        //print array's all elements
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }


    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }


        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;

    }


    //print array's even elements
    void even(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)


                System.out.print(array[i] + ",");
        }
    }

    void odd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println();

    }

    void evenQaunt(int[] array) {
        System.out.print("evens quantity are ");
        int count = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                count++;

            }
        }
        System.out.print(count + ", ");
        System.out.println();
    }


    void oddQaunt(int[] array) {
        System.out.print("odds quantity are ");
        int count = 0;
        for (int x : array) {
            if (x % 2 != 0) {
                count++;

            }
        }
        System.out.print(count + ", ");

    }


    double sum(int[] array) {
        //print array element's average sum and sum
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Elements sum = " + sum);

        return sum;
    }

    //print array element's average sum
    double averageSum(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Elements sum = " + sum/ array.length);

        return sum/ array.length;
    }

    void bubbleSortDown(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    int sort = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = sort;
                }
            }
        }
        for (int sort : array)

            System.out.print(sort + " ");
        System.out.println();

    }

    void bubbleSortUp(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int sort = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = sort;
                }
            }
        }
        for (int sort : array)

            System.out.print(sort + " ");
        System.out.println();

    }

}
