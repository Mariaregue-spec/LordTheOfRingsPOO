package org.example;

public class Wizard extends Character {

    private String staffType;
    private String robeColor;
    private int powerLevel;

    public Wizard(String name, int age, String origin, String alignment,
                  String description, String image,
                  String staffType, String robeColor, int powerLevel) {

        super(name, age, origin, alignment, "Wizard", description, image);

        this.staffType = staffType;
        this.robeColor = robeColor;
        this.powerLevel = powerLevel;
    }

    public String getStaffType() { return staffType; }
    public String getRobeColor() { return robeColor; }
    public int getPowerLevel() { return powerLevel; }

    public void setStaffType(String staffType) { this.staffType = staffType; }
    public void setRobeColor(String robeColor) { this.robeColor = robeColor; }
    public void setPowerLevel(int powerLevel) { this.powerLevel = powerLevel; }

    @Override
    public void displayDetails() {
        System.out.println("Raza: " + getRace() +
                " | Nombre: " + getName() +
                " | Tipo de bastón: " + staffType +
                " | Color de túnica: " + robeColor +
                " | Nivel de poder: " + powerLevel +
                " | Descripción: " + getDescription() +
                " | Imagen: " + getImage());
    }
}