package pack.structure.types;

import pack.structure.specialty.Archer;

public final class Elf extends Archer {

    public Elf(String name, int hp, int attack, int arrows) {
        super(name, hp, attack, arrows);
    }

    public Elf(int arrows) {
        super(arrows);
    }


    @Override
    public String toString() {
        return "Elf{" +
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
