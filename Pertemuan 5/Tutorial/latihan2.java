package com.praktikum;

// player
class Player {
    String name;
    double health;
    int level;

    //object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    // Keterangan : opponent yaitu musuh
    void attack(Player opponent) {
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    void defence(double attackPower) {

        double damage;
        // akan menggambil damage
        // kalau attackPower > defencePower maka attackPower dikurang defencePower
        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage; // setiap healt akan dikurang karna damage
        System.out.println(this.name + " gets damage " + damage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// weapon
class Weapon{
    double attackPower;
    String name;

    //construktor
    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// armor
class Armor{
    double defencePower;
    String name;

    //construktor
    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower + "\n");
    }
}


public class latihan2 {
    public static void main(String[] args) {

        // membuat objeck player
        Player player1 = new Player("Sopo", 100);
        Player player2 = new Player("Jarwo", 100);
        Player player3 = new Player("AnakBaru", 99);

        // membuat objeck player
        Weapon pedang = new Weapon("Pedang",15);
        Weapon pisau = new Weapon("Pisau", 10);
        Weapon batu =  new Weapon("Batu", 2);

        // membuat objeck armor
        Armor bajuBesi = new Armor("Baju Besi",10);
        Armor bajuRombeng = new Armor("Baju Rombeng", 0);

        // equip senjata dan armor player1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuRombeng);
        player1.display();

        // equip senjata dan armor player2
        player2.equipWeapon(pisau);
        player2.equipArmor(bajuBesi);
        player2.display();

        // equip senjata dan armor player3
        player3.equipWeapon(batu);
        player3.equipArmor(bajuRombeng);
        player3.display();

        // pertempuran dimulai
        System.out.println("\nPertempuran");

        System.out.println("\nOpisode - 1");
        player1.attack(player2);
        player2.attack(player1);
        player1.display();
        player2.display();
        player3.display();

        System.out.println("\nOpisode - 2");
        player2.attack(player1);
        player1.display();
        player2.display();
        player3.display();

        System.out.println("\nOpisode - 3");
        player3.attack(player1);
        player1.display();
        player2.display();
        player3.display();

    }
}
