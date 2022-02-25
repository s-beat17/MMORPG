package pack.structure.specialty;

import pack.structure.base.Hero;

import java.util.Objects;

public abstract class Warrior extends Hero {
    protected int armor;

    public Warrior(int armor) {
        this.armor = armor;
    }

    public Warrior(String name, int hp, int attack, int armor) {
        super(name, hp, attack);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public int attack() {
        return super.attack();
    }

    @Override
    public void takeDamage(int otherAttack) {
        super.takeDamage(otherAttack);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return armor == warrior.armor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), armor);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", alive=" + alive
                ;
    }
}
