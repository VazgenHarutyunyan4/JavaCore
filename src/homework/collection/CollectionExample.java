

package homework.collection;


import java.util.*;
import java.util.Collections;

public class CollectionExample {

    public static void main(String[] args) {
        String[] values = {"Sanasar","Baxtasar"};
        List<String> list = new ArrayList<>();
        list.add(0, "Aram");
        list.add(1, "Bob");
        list.add(2, "Sos");
        list.add(3, "Pogos");
        list.add(4, "Bob");
        list.add(5, "Pol");
        list.add(6, "Lol");
        list.add(7,"Aram");
        System.out.println(list);
        System.out.println(arrayToList(values));

        System.out.println(removeById(list,2));
        System.out.println(listToSet(list));
        Integer[] list1 = {5,8,97,854,1,0};
        System.out.println(listToLinkedList(list1));

        System.out.println(Arrays.asList(reverseNumbers(list1)));
        printFirstFive(list);
        System.out.println(sizeOfList(list));

    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {


        return new ArrayList<>(Arrays.asList(values));
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {
        list.remove(index);
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        return set;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static List<Integer> listToLinkedList(Integer[] list) {
        return new LinkedList<>(Arrays.asList(list));
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static Integer[] reverseNumbers(Integer[] list) {
        Collections.reverse(Arrays.asList(list));
        return list;
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        Arrays.copyOfRange(list.toArray(),0,3);
        System.out.println(list);

    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list) {

        return list.size();
    }

}

