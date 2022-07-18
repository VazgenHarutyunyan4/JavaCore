package homework.dynamic;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(7);
        dynamicArray.add(3);
        dynamicArray.add(3);
        dynamicArray.add(3);
        dynamicArray.add(3);
        dynamicArray.add(3);
        dynamicArray.add(0);
        dynamicArray.add(3);
        dynamicArray.add(1);
        dynamicArray.add(4);
        dynamicArray.add(8);
        dynamicArray.add(8);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.print();
        System.out.println();
        System.out.println(dynamicArray.getByIndex(5));
        System.out.println();
        System.out.println(dynamicArray.isEmpty());
        System.out.println();
        System.out.println(dynamicArray.getFirstIndexByValue(17));
        System.out.println();
        System.out.println(dynamicArray.set(10,15));
        System.out.println();
        System.out.println(dynamicArray.add1(5,25));
        System.out.println();
        System.out.println(dynamicArray.deleteByIndex(3));
    }
}
