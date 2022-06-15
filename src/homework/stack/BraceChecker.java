package homework.stack;

public class BraceChecker {
    String s;
    char ch;

    BraceChecker(String s) {
        this.s = s;
    }

    Stack stack = new Stack();

    void check() {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(
                    i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ']':
                    ch = (char) stack.pop();
                    if (ch != '[') {
                        System.err.println("Error in " + i + " line:closed " + c + " but opened " + ch);
                    }
                    break;
                case ')':
                    ch = (char) stack.pop();
                    if (ch != '(') {
                        System.err.println("Error in " + i + " line:closed " + c + " but opened " + ch);
                    }
                    break;
                case '}':
                    ch = (char) stack.pop();
                    if (ch != '{') {
                        System.err.println("Error in " + i + " line:closed " + c + " but opened " + ch);
                    }
                    break;


            }
        }

    }
}




