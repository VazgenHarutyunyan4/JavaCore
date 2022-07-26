package homework.collection;


import java.util.*;

public class MapExample {

    static List<FootballTeamMember> member;

    public void put(Integer number, String name) {
        member.add(new FootballTeamMember(number, name));
    }

    public static void main(String[] args) {

        Map<Integer, String> member = new HashMap<>();

        member.put(5, "Zidan");
        member.put(7, "Pele");
        member.put(9, "Poxos");
        member.put(11, "Baxtasar");
        member.put(1, "Kan");

        System.out.println("Print all members names");
        printAllMemberNames(member);
        System.out.println("_________________________");
        System.out.println("Print all members");
        printAllMembers(member);
        System.out.println("_________________________");
        System.out.println("If remove print true,else false");
        System.out.println(removeFromMap(member, 8));
        System.out.println("_________________________");


    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {

        return null;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {

        for (Integer integer : memberMap.keySet()) {
            boolean b = memberMap.containsKey(removedNumber);
            if (b) {
                memberMap.remove(integer);
                return true;
            }
        }

            return false;
        }


    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {

        for (String value : memberMap.values()) {
            System.out.println(value);
        }
    }


    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Map.Entry<Integer,String> entry : memberMap.entrySet()){
            System.out.println(entry.getKey()+" - " + entry.getValue());
        }

    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public FootballTeamMember() {
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
