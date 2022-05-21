package homework.arrayUtil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'e', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println(count);


        char[] chars2 = {'j', 'a', 'v', 'e', 'l', 'o', 'v', 'e'};

        System.out.print(chars2[chars2.length / 2 - 1] + " and ");
        System.out.println(chars2[chars2.length / 2]);


        char[] chars3 = {'j', 'a', 'v', 'e', 'l', 'o', 'l', 'y'};
        boolean ly = false;
        for (int i = 0; i < chars3.length; i++) {
            if (chars3[i] == chars3[chars3.length - 2] && chars3[i + 1] == chars3[chars3.length - 1]) {
                ly = true;
            }

        }
        System.out.println(ly);


        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i < bobArray.length; i++) {
            if ((i + 2) < bobArray.length) {
                if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                    boolean bob = true;
                    System.out.println(bob);
                }
            }
        }

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }

        }
    }
}
