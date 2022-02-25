package pack.structure.specialty;

import pack.structure.base.Hero;

import java.util.Objects;

public abstract class Archer extends Hero {
    protected int arrows;

    public Archer(int arrows) {
        this.arrows = arrows;
    }

    public Archer(String name, int hp, int attack, int arrows) {
        super(name, hp, attack);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
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
        Archer archer = (Archer) o;
        return arrows == archer.arrows;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), arrows);
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
