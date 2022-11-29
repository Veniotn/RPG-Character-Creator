package Classes;

import javax.swing.*;

public class Warrior extends Hero{

    public Warrior(){
        this.setHealth(100);
        this.setDefense(30);
        this.setBaseAttack(40);
        this.setAgility(10);
        super.name = "Warrior";
        super.photo = new ImageIcon(getClass().getResource("/Images/warrior.jpg"), "Warrior photo");
        super.description = "The warrior has the highest starting health, poor agility and average defense and baseAttack.";
    }



}
