package homework.collection;


import book.chapter8.A;
import homework.arrayUtil.ArrayUtil;

import java.util.*;

public class MapExample {

    static List<FootballTeamMember> member;

    public void put(Integer number, String name) {
        member.add(new FootballTeamMember(number, name));
    }

    public static void main(String[] args) {

        List<FootballTeamMember> members = new ArrayList<>();
        members.add(new FootballTeamMember(5,"Zidan"));
        members.add(new FootballTeamMember(7,"Pele"));
        members.add(new FootballTeamMember(9,"Poxos"));
        members.add(new FootballTeamMember(11,"Baxtasar"));
        members.add(new FootballTeamMember(1,"Kan"));

        Map<Integer, String> member = new HashMap<>();

        member.put(5, "Zidan");
        member.put(7, "Pele");
        member.put(9, "Poxos");
        member.put(11, "Baxtasar");
        member.put(1, "Kan");

        System.out.println("HashMap key and value");
        System.out.println(createFootballTeam(members));
        System.out.println("__________________________");
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
        Map<Integer,String> map = new HashMap<>();
        for (FootballTeamMember member:members) {
            map.put(member.getNumber(),member.getName());
        }
        return map;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {

       if (memberMap.containsKey(removedNumber)){
           memberMap.remove(removedNumber);
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
