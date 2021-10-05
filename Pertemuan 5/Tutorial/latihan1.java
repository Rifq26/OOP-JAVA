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


public class latihan1 {
    public static void main(String[] args) {

        // membuat objeck player
        Player player1 = new Player("Sopo", 100);
        Player player2 = new Player("Jarwo", 50);

        // membuat objeck player
        Weapon pedang = new Weapon("Pedang",15);
        Weapon pisau = new Weapon("Pisau", 8);

        // membuat objeck armor
        Armor bajuBesi = new Armor("Baju Besi",10);
        Armor bajuRombeng = new Armor("Baju Rombeng", 3);

        // equip senjata dan armor player1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // equip senjata dan armor player1
        player2.equipWeapon(pedang);
        player2.equipArmor(bajuBesi);
        player2.display();


    }
}
