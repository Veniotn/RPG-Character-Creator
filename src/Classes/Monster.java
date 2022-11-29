package Classes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Monster extends Asset{
    protected int health;
    protected int defense;
    protected int Agility;
    protected int basicAttack;
    protected ImageIcon photo;

    public Monster(String name){
        super(name);
        this.setHealth(50);
        this.setDefense(40);
        this.setBasicAttack(30);
        this.setAgility(50);
        this.setPhoto(new ImageIcon(getClass().getResource("/Images/enemy.png"), "Enemy Photo"));
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }

    public ImageIcon getPhoto() {
        return photo;
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

    public int getAgility() {
        return Agility;
    }

    public void setAgility(int agility) {
        Agility = agility;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public void setBasicAttack(int basicAttack) {
        this.basicAttack = basicAttack;
    }
}
