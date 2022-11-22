package Lab3.Prototype;

import java.util.Scanner;

public class main {
    public static Character createNewChar() {
        Scanner scn = new Scanner(System.in);
        int strength = scn.nextInt();

        System.out.println("Constitution: ");
        int constitution = scn.nextInt();

        System.out.println("dexterity: ");
        int dexterity = scn.nextInt();

        System.out.println("intelligence: ");
        int intelligence = scn.nextInt();

        System.out.println("wisdom: ");
        int wisdom = scn.nextInt();

        System.out.println("charisma: ");
        int charisma = scn.nextInt();

        System.out.println("name: ");
        String name = scn.next();

        System.out.println("for class please enter one of the following");
        for (int i = 0; i < Class.values().length; i++) {
            System.out.println(String.valueOf(i) + Class.values()[i]);
        }
        System.out.println("charClass: ");

        int charClass = scn.nextInt();

        System.out.println("now please enter strings");

        System.out.println("story: ");
        String story = scn.next();

        return new Character(strength, constitution, dexterity, intelligence, wisdom, charisma, name, Class.values()[charClass], story);
    }

    public static void modifyExitingChar(Character c) {

    }
    public static void main(String[] args) {
        PrototypeRegistry characters = new PrototypeRegistry();
        System.out.println("Hello Adventurer!\n For starters, you have to create a new character: ");
        System.out.println("please enter values between 3 and 20 ");
        System.out.println("Strength: ");
        Scanner scn = new Scanner(System.in);

        createNewChar();

        System.out.println("now chreate another character. you can either create a new one or modify an existing one. Enter 1 to chreate a new char or 2" +
                "to modify an existing one");

        int option = scn.nextInt();
        if(option == 1)
            createNewChar();
        else {
            System.out.println("choose character to modify ");
            for(int i : characters.getChars()) {
                System.out.println("character" + characters.getCharName(i));
            }
        };
    }
}
