package com.jsd.oop_lesson_11;

public class TrainingGround {

    public static void main(String[] args) {
        Hero warrior = new Warrior("Боромир", 15);
        Hero mage = new Mage("Гендальф", 20);
        Archer archer = new Archer("Леголас", 10);

        Archer.Wolf second_wolf = archer.new Wolf("Second wolf", 11);

        Enemy enemy = new Enemy("Зомби", 100);

        attackEnemy(enemy, warrior, mage, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
