package Classes;

import javax.swing.*;

abstract class Hero {
    protected int health;
    protected int defense;
    protected int baseAttack;
    protected int agility;
    protected String name;
    protected String description;

    protected ImageIcon photo;

    protected Weapon weapon;

    public Hero(){
        this.health = 100;
        this.defense = 100;
        this.baseAttack = 100;
        this.agility = 100;
        this.photo = new ImageIcon(getClass().getResource("/Images/warrior.jpg"), "default photo");
        this.description = "Please select a character";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhoto(ImageIcon photo){
        this.photo = photo;
    }

    public ImageIcon getPhoto(){
        return this.photo;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public String getName() {
        return name;
    }



}
