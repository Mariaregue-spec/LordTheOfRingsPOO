package org.example;

public class Dwarf extends Character {

    private String house;
    private String weapon;
    private double beardLength;

    public Dwarf(String name, int age, String origin, String alignment,
                 String description, String image,
                 String house, String weapon, double beardLength) {

        super(name, age, origin, alignment, "Dwarf", description, image);

        this.house = house;
        this.weapon = weapon;
        this.beardLength = beardLength;
    }

    public String getHouse() { return house; }
    public String getWeapon() { return weapon; }
    public double getBeardLength() { return beardLength; }

    public void setHouse(String house) { this.house = house; }
    public void setWeapon(String weapon) { this.weapon = weapon; }
    public void setBeardLength(double beardLength) { this.beardLength = beardLength; }

    @Override
    public void displayDetails() {
        System.out.println("Raza: " + getRace() +
                " | Nombre: " + getName() +
                " | Casa: " + house +
                " | Arma: " + weapon +
                " | Largo de barba: " + beardLength +
                " | Descripción: " + getDescription() +
                " | Imagen: " + getImage());
    }
}