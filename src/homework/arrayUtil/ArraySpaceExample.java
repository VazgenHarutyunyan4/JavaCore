package homework.arrayUtil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] result;
        for (int i = 1; i < spaceArray.length - 1; i++) {
            result = spaceArray;
            result[0]++;
            System.out.print(result[i]+".");
        }
    }
}


