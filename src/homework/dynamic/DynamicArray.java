package homework.dynamic;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(int value) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = value;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void increaseArray() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];

        }
        array = tmp;
    }

    public boolean isEmpty() {
        if (array.length == 0) {
            return true;
        }
        return false;
    }

    public int getByIndex(int index) {
        return array[index];
    }

    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[size - 1] == value) {
                value++;
                break;
            }
        }
        return value;
    }

    public int set(int index, int value) {
        array[index] = value;
        increaseArray();

        return value;
    }

    public int add1(int index, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                add(value);
            }
        }
        return value;
    }

    public int deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
        return index;
    }
}
