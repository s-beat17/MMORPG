package pack.structure.types;

import pack.structure.specialty.Warrior;

public final class Paladin extends Warrior {

    public Paladin(String name, int hp, int attack, int armor) {
        super(name, hp, attack, armor);
    }

    public Paladin(int armor) {
        super(armor);
    }

    @Override
    public String toString() {
        return "Paladin{" +
                super.toString() +
                ", armor=" + armor +
                '}';
    }

    @Override
    public void takeDamage(int otherAttack) {
        super.takeDamage(otherAttack - armor);
    }

    @Override
    public int attack() {
        return super.attack();
    }
}
