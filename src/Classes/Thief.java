package Classes;

import javax.swing.*;

public class Thief extends Hero{

    public Thief(){
        super();
        this.setHealth(50);
        this.setDefense(0);
        this.setBaseAttack(55);
        this.setAgility(80);
        this.setName("Thief");
        this.setPhoto(new ImageIcon(getClass().getResource("/Images/Thief.png"), "Thief photo"));
        this.setDescription("Specializing in stealth the Thief has great agility, a solid baseAttack but poor health and defense.");
    }
}
