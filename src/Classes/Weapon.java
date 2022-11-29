package Classes;

abstract class Weapon {
    private int attackModifier;
    private int weight;
    private String name;
    private String description;

    public Weapon(){
        this.attackModifier = 0;
        this.weight = 0;
        this.name = "No weapon selected.";
        this.description = "No weapon selected.";
    }


    public int getAttackModifier() {
        return attackModifier;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAttackModifier(int attackModifier) {
        this.attackModifier = attackModifier;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getWeaponName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
