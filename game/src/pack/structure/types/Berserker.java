package pack.structure.types;

import pack.structure.specialty.Warrior;

public final class Berserker extends Warrior {

    private int rage;

    public Berserker(String name, int hp, int attack, int armor, int rage) {
        super(name, hp, attack, armor);
        this.rage = rage;
    }

    public Berserker(int armor) {
        super(armor);
    }

    @Override
    public String toString() {
        return "Berserker{" +
                super.toString() +
                ", rage=" + rage +
                ", armor=" + armor +
                '}';
    }

    @Override
    public void takeDamage(int otherAttack) {
        super.takeDamage(otherAttack);
    }

    @Override
    public int attack() {
        if (++rage >= 5) {
            System.out.println("RAGE!");
            return super.attack() * 3;
        }
        return super.attack();
    }
}
