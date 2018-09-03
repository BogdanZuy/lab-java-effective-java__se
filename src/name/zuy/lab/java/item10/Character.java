package name.zuy.lab.java.item10;

public class Character {

    public Character(String name) {
        this.name = name;
    }

    public void beMage() {
        this.current_class = CharacterClass.Mage;
    }

    public void beThief() {
        this.current_class = CharacterClass.Thief;
    }

    public void beWarrior() {
        this.current_class = CharacterClass.Warrior;
    }

    enum CharacterClass {
        Novice, Mage, Thief, Warrior
    }

    private String name;
    private int level = 1;
    private int exp = 0;
    private CharacterClass current_class = CharacterClass.Novice;

    /**
     * Returns the string representation of character.
     * The string consists of Name, Class and characters level
     * whose format "NAME (CLASS, lvl N)"
     * For example,
     *  John (Mage, lvl 40)
     */
    @Override
    public String toString() {
        return "" + name + " (" + current_class +
                ", lvl " + level +
                ")";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public CharacterClass getCurrent_class() {
        return current_class;
    }

    public void setCurrent_class(CharacterClass current_class) {
        this.current_class = current_class;
    }

}
