package pack.formation;

import pack.structure.base.Hero;
import pack.structure.types.*;
import pack.structure.base.HeroTypes;

import java.util.Arrays;
import java.util.Random;

public class Squad {
    private String name;
    private final Hero[] heroes;
    private Random random;

    public Squad(int size, String name) {
        this.heroes = new Hero[size];
        random = new Random();
        this.name = name;
        fill();
    }

    public String getName() {
        return name;
    }

    public int aliveCount() {
        int count = 0;
        for (Hero hero : heroes) {
            if (hero.isAlive()) count++;
        }
        return count;
    }

    private void fill() {
        Hero hero = null;
        for (int i = 0; i < heroes.length; i++) {
            switch (random.nextInt(HeroTypes.TYPES_COUNT)) {
                case HeroTypes.PALADIN:
                    hero = new Paladin("P", 100, 50, 5);
                    break;
                case HeroTypes.BERSERKER:
                    hero = new Berserker("B", 100, 70, 0, 3);
                    break;
                case HeroTypes.ELF:
                    hero = new Elf("E", 100, 50, 5);
                    break;
                case HeroTypes.HUNTER:
                    hero = new Hunter("H", 100, 50, 5);
                    break;
                case HeroTypes.WARLOCK:
                    hero = new Warlock("WLK", 100, 50, 5);
                    break;
                case HeroTypes.WIZARD:
                    hero = new Wizard("WRD", 100, 50, 5);
                    break;
            }
            heroes[i] = hero;
        }
    }

    public int size() {
        return heroes.length;
    }

    @Override
    public String toString() {
        return "Squad " + name + Arrays.toString(heroes);
    }

    public boolean alive() {
        for (Hero hero : heroes) {
            if (hero.isAlive()) return true;
        }
        return false;
    }

    public Hero hero() {
        Hero h;
        while (!(h = heroes[random.nextInt(size())]).isAlive()) {
        }
        return h;
    }
}
