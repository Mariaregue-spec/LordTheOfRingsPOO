package org.example;

public class Orc extends Character {

    private String army;
    private String rank;
    private boolean aggressive;

    public Orc(String name, int age, String origin, String alignment,
               String description, String image,
               String army, String rank, boolean aggressive) {

        super(name, age, origin, alignment, "Orc", description, image);

        this.army = army;
        this.rank = rank;
        this.aggressive = aggressive;
    }

    public String getArmy() {
        return army;
    }

    public String getRank() {
        return rank;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public void setArmy(String army) {
        this.army = army;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setAggressive(boolean aggressive) {
        this.aggressive = aggressive;
    }

    @Override
    public void displayDetails() {
        System.out.println("Race: " + getRace() +
                " | Name: " + getName() +
                " | Army: " + army +
                " | Rank: " + rank +
                " | Aggressive: " + aggressive +
                " | Description: " + getDescription() +
                " | Image: " + getImage());
    }
}
