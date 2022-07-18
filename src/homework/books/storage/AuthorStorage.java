package homework.books.storage;

import homework.books.model.Authors;
import homework.student.model.Lesson;

public class AuthorStorage {
    private Authors[] array = new Authors[10];
    private int size = 0;

    public void add(Authors author) {
        if (size == array.length){
            increaseArray();
        }
        array[size++] = author;
    }

    private void increaseArray() {
        Authors[] temp = new Authors[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + array[i]);
        }
    }

}
