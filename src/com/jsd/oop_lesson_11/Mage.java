package com.jsd.oop_lesson_11;

import com.jsd.lesson_13.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " сотворил заклинание в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
