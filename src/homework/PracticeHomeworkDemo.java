package homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        int[]array1 = {2,6,8,9,4};
        int[]array2 = {2,8,7};
        PracticeHomework practiceHomework = new PracticeHomework();
        System.out.println(practiceHomework.convert(52));
        System.out.println(practiceHomework.calcAge(2));
        System.out.println(practiceHomework.nextNumber(7));
        System.out.println(practiceHomework.isSameNum(5, 6));
        System.out.println(practiceHomework.lessThenOrEqualToZero(-5));
        System.out.println(practiceHomework.reverseBool(false));

        System.out.println(practiceHomework.maxLength(array1,array2));

    }
}
