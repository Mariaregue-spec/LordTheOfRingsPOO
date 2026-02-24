package org.example;

public class Human extends Character {

    private String kingdom;
    private String title;
    private boolean isNoble;

    public Human(String name, int age, String origin, String alignment,
                 String description, String image,
                 String kingdom, String title, boolean isNoble) {

        super(name, age, origin, alignment, "Human", description, image);

        this.kingdom = kingdom;
        this.title = title;
        this.isNoble = isNoble;
    }

    public String getKingdom() { return kingdom; }
    public String getTitle() { return title; }
    public boolean isNoble() { return isNoble; }

    public void setKingdom(String kingdom) { this.kingdom = kingdom; }
    public void setTitle(String title) { this.title = title; }
    public void setIsNoble(boolean isNoble) { this.isNoble = isNoble; }

    @Override
    public void displayDetails() {
        System.out.println("Raza: " + getRace() +
                " | Nombre: " + getName() +
                " | Reino: " + kingdom +
                " | Título: " + title +
                " | Noble: " + isNoble +
                " | Descripción: " + getDescription() +
                " | Imagen: " + getImage());
    }
}