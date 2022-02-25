package pack.structure.types;

import pack.structure.specialty.Mage;

public final class Wizard extends Mage {
    public Wizard(String name, int hp, int attack, int manna) {
        super(name, hp, attack, manna);
    }

    public Wizard(int manna) {
        super(manna);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                super.toString() +
                ", manna=" + manna +
                '}';
    }

    @Override
    public int attack() {
        return super.attack();
    }

    @Override
    public void takeDamage(int otherAttack) {
        super.takeDamage(otherAttack - manna);
        /*manna--;
        if (manna <= 0) {
            super.takeDamage(otherAttack - hp);
        } else {
            super.takeDamage(otherAttack - manna - hp);
        }*/
    }
}
