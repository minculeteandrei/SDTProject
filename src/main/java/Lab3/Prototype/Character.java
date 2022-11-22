package Lab3.Prototype;

public class Character implements Cloneable {
    private int strength;
    private int constitution;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private String name;
    private Class charClass;
    private String story;

    public Character(Character clone) {
        this.charClass = clone.charClass;
        this.constitution = clone.constitution;
        this.charisma = clone.charisma;
        this.dexterity = clone.dexterity;
        this.intelligence = clone.intelligence;
        this.name = clone.name;
        this.story = clone.story;
        this.wisdom = clone.wisdom;
        this.strength = clone.strength;
    }

    public Character(int strength, int constitution, int dexterity, int intelligence, int wisdom, int charisma, String name, Class charClass, String story) {
        this.strength = strength;
        this.constitution = constitution;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.name = name;
        this.charClass = charClass;
        this.story = story;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getCharClass() {
        return charClass;
    }

    public void setCharClass(Class charClass) {
        this.charClass = charClass;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public Character clone() {
        return new Character(this);
    }
}
