package pack.structure.base;

import java.util.Objects;
import java.util.Random;

public abstract class Hero {

    protected String name;
    protected int hp;
    protected int attack;
    protected boolean alive;
    protected final int rd;
    protected final Random random = new Random();

    {
        alive = true;
        rd = random.nextInt(10) + 1;
    }


    public Hero() {
    }

    public Hero(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        if (hp <= 0) alive = false;
        return alive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return hp == hero.hp && attack == hero.attack && alive == hero.alive && Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hp, attack, alive);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", alive=" + alive +
                '}';
    }

    public void takeDamage(int otherAttack) {
        if ((hp -= otherAttack) < 0) hp = 0;
        isAlive();
    }

    public int attack() {
        return attack + rd;
    }
}
