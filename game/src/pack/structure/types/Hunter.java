package pack.structure.types;

import pack.structure.specialty.Archer;

public final class Hunter extends Archer {
    public Hunter(String name, int hp, int attack, int arrows) {
        super(name, hp, attack, arrows);
    }

    public Hunter(int arrows) {
        super(arrows);
    }

    @Override
    public String toString() {
        return "Hunter{" +
                super.toString() +
                ", arrows=" + arrows +
                '}';
    }

    @Override
    public void takeDamage(int otherAttack) {
        super.takeDamage(otherAttack - hp);
    }

    @Override
    public int attack() {
        return super.attack();
        /*arrows--;
        if (arrows >= 0) {
            return attack - 2 * arrows;
        } else {
            return super.attack();
        }*/
    }
}
