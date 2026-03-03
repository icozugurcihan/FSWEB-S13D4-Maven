package org.example;

public enum Weapon {

    SWORD(60, 1.2),
    AXE(65, 0.9),
    BOW(40, 1.8),
    DAGGER(30, 2.5);

    // 1️⃣ Değişkenler
    private final int damage;
    private final double attackSpeed;

    // 2️⃣ Constructor (enum constructor private olmak zorundadır)
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // 3️⃣ Getter Metotları
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}