package Classes;

import javax.swing.*;

public class Mage extends Hero{

    public Mage(){
        super();
        super.health = 60;
        super.defense = 0;
        super.baseAttack = 30;
        super.agility = 100;
        super.name = "Mage";
        super.photo = new ImageIcon(getClass().getResource("/Images/mage.jpg"), "Mage photo");
        super.description = "The Mage has an average base attack, base health. but solid base defense and base agility.";
    }
}
