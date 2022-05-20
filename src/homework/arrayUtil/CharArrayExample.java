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
        for (int i = 0; i < chars2.length; i++) {

        }
        System.out.print(chars2[chars2.length / 2 - 1] + " and ");
        System.out.println(chars2[chars2.length / 2]);


        char[] chars3 = {'j', 'a', 'v', 'e', 'l', 'o', 'l', 'y'};
        boolean x = ((chars3[chars3.length - 1] + chars3[chars3.length - 2]) == ('l' + 'y'));
        if (x) {
            System.out.println(true);
        }
        if (!x) {
            System.out.println(false);
        }


        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                boolean bob = true;
                System.out.println(bob);
            }
        }

        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] !=' '){
                System.out.print(text[i]);
            }

        }
    }
}
