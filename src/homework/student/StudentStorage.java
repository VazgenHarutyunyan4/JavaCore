package homework.student;

public class StudentStorage {
    private Student[] array = new Student[10];
    private int size = 0;


    public void add(Student student) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = student;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    private void increaseArray() {
        Student[] tmp = new Student[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];

        }
        array = tmp;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void printStudentByLesson(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)){
                System.out.println(array[i]);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void changeLesson() {
        for (int i = 0; i < size; i++) {
            String newLessonName = null;
            array[i].setLesson(newLessonName);

        }
    }

    public Student getStudentByIndex(int index) {
        if(index<0 || index>=size){
            System.out.println("invalid index");
            return null;
        }
        return array[index];
    }
}


