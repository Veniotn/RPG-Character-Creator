package Classes;

import javax.swing.*;
import java.util.Random;

public class Player extends Asset{

    protected Hero hero;

    protected Weapon weapon;

    protected ImageIcon photo;
    public Player(String name) {
        super(name);
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
    public Hero getHero() {
        return hero;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public int getWeaponModifier(){
        return weapon.getAttackModifier();
    }

    public int getWeaponWeight(){
        return weapon.getWeight();
    }

    public String getWeaponName(){
        return weapon.getWeaponName();
    }

    public String getWeaponDescription(){
        return weapon.getDescription();
    }

    public void setHealth(int health){
        hero.setHealth(health);
    }

    public void setDefense(int defense){
        hero.setDefense(defense);
    }

    public void setAgility(int agility){
        hero.setAgility(agility);
    }

    public void setBaseAttack(int baseAttack){
        hero.setBaseAttack(baseAttack);
    }





    public void setDescription(String description){
        hero.setDescription(description);
    }

    public String getDescription(){
        return hero.getDescription();
    }
    public void setPhoto(ImageIcon photo){
        this.photo = photo;
    }

    public ImageIcon getPhoto(){
        return hero.getPhoto();
    }

    public void setNane(String name){
        super.setName(name);
    }





    public int getHealth(){
        return hero.getHealth();
    }

    public int getDefense(){
        return hero.getDefense();
    }

    public int getBaseAttack(){
        return hero.getBaseAttack();
    }

    public int getAgility(){
        return hero.getAgility();
    }

    public String getHeroName(){
        return hero.getName();
    }
}
