package com.jsd.lesson_13;

import com.jsd.lesson_13.weapon.Bow;
import com.jsd.lesson_13.weapon.MeleeWeapon;
import com.jsd.lesson_13.weapon.Sword;
import com.jsd.lesson_13.weapon.Weapon;
import com.jsd.oop_lesson_11.Archer;
import com.jsd.oop_lesson_11.Hero;
import com.jsd.oop_lesson_11.Warrior;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Боромир", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(warrior);
    }

    public static void printWeaponDamage(Hero<? super Sword> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }
}
