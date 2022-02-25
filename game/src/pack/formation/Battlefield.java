package pack.formation;

import pack.structure.base.Hero;

public class Battlefield {
    private Squad squad1;
    private Squad squad2;
    private final int sizeDefault;

    public Battlefield(int sizeDefault) {
        this.sizeDefault = sizeDefault;
        squad1 = new Squad(sizeDefault, "First");
        squad2 = new Squad(sizeDefault, "Second");
    }

    private void sleepThis() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fight() {
        Hero hero1, hero2;
        while (squad1.alive() && squad2.alive()) {
            hero1 = squad1.hero();
            hero2 = squad2.hero();
            //
            hero1.takeDamage(hero2.attack());
            System.out.printf("%s\t\t%s\n", hero1, hero2);
            sleepThis();
            if (hero1.isAlive() && hero2.isAlive()) {
                hero2.takeDamage(hero1.attack());
                System.out.printf("%s\t\t%s\n", hero1, hero2);
            }
            sleepThis();
            System.out.printf("%s %d\t\t%s %d\n",
                    squad1.getName(), squad1.aliveCount(),
                    squad2.getName(), squad2.aliveCount()
            );
            if (squad1.aliveCount() == 0) {
                System.out.println("\t" + squad2.getName() + " WIN");
            }
            if (squad2.aliveCount() == 0) {
                System.out.println("\t" + squad1.getName() + " WIN");
            }
            System.out.println("**********************************************************************************");
        }
    }
}
