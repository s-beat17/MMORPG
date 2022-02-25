package pack.structure.specialty;

import pack.structure.base.Hero;

import java.util.Objects;

public abstract class Mage extends Hero {
    protected int manna;

    public Mage(int manna) {
        this.manna = manna;
    }

    public Mage(String name, int hp, int attack, int manna) {
        super(name, hp, attack);
        this.manna = manna;
    }

    public int getManna() {
        return manna;
    }

    public void setManna(int manna) {
        this.manna = manna;
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
    public String toString() {
        return "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", alive=" + alive
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mage mage = (Mage) o;
        return manna == mage.manna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manna);
    }
}
