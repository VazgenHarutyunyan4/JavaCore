package homework;

public class PracticeHomework {
    long convert(int minutes) {
        minutes *= 60;
        return minutes;
    }

    int calcAge(int years) {
        int days;
        days = years * 365;
        return days;

    }

    int nextNumber(int number) {
        int nextNumber = number + 1;
        return nextNumber;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    boolean lessThenOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean reverseBool(boolean value) {
        if (value = !true) {
            return false;
        } else {

            return true;
        }
    }

    int x = 0;
    int y = 0;

    int maxLength(int[] array1, int[] array2) {
        array1 = new int[x];
        array2 = new int[y];
        if (x > y) {
            return array1.length;

        } else {
            return array2.length;
        }

    }


}
