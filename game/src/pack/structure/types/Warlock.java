package pack.structure.types;

import pack.structure.specialty.Mage;

public final class Warlock extends Mage {
    public Warlock(String name, int hp, int attack, int manna) {
        super(name, hp, attack, manna);
    }

    public Warlock(int manna) {
        super(manna);
    }

    @Override
    public String toString() {
        return "Warlock{" +
                super.toString() +
                ", manna=" + manna +
                '}';
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

    @Override
    public int attack() {
        return super.attack();
    }
}
