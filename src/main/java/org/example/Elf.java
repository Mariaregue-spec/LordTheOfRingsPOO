package org.example;

public class Elf extends Character {

    private String clan;
    private boolean immortal;
    private String realm;

    public Elf(String name, int age, String origin, String alignment,
               String description, String image,
               String clan, boolean immortal, String realm) {

        super(name, age, origin, alignment, "Elf", description, image);

        this.clan = clan;
        this.immortal = immortal;
        this.realm = realm;
    }

    public String getClan() {
        return clan;
    }

    public boolean isImmortal() {
        return immortal;
    }

    public String getRealm() {
        return realm;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public void setImmortal(boolean immortal) {
        this.immortal = immortal;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    @Override
    public void displayDetails() {
        System.out.println("Race: " + getRace() +
                " | Name: " + getName() +
                " | Clan: " + clan +
                " | Realm: " + realm +
                " | Immortal: " + immortal +
                " | Description: " + getDescription() +
                " | Image: " + getImage());
    }
}
