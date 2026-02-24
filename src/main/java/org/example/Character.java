package org.example;

public abstract class Character {
    private String name;
    private int age;
    private String origin;
    private String alignment;
    private String race;
    private String description;
    private String image;

    public Character(String name, int age, String origin, String alignment, String race, String description, String image) {
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.alignment = alignment;
        this.race = race;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOrigin() {
        return origin;
    }

    public String getAlignment() {
        return alignment;
    }

    public String getRace() {
        return race;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public abstract void displayDetails();
}
