package homework;

public class PracticeHomework {
    long convert(int minutes) {
        minutes *= 60L;
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
        return a == b;
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



    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array1.length;

        } else {
            return array2.length;
        }

    }


}
