package org.example;

public class Main {
    public static void main(String[] args) {
        Character[] characters = new Character[15];
        characters[0] = new Human("Aragorn", 87, "Gondor", "Bueno",
                "Heredero de Isildur y rey de Gondor", "aragorn.png",
                "Gondor", "Rey", true);

        characters[1] = new Human("Boromir", 40, "Gondor", "Bueno",
                "Hijo de Denethor y Capitán de la Torre Blanca", "boromir.png",
                "Gondor", "Capitán", true);

        characters[2] = new Human("Eomer", 36, "Rohan", "Bueno",
                "Mariscal de la Marca de los Jinetes", "eomer.png",
                "Rohan", "Mariscal", true);
        // 3 Elves
        characters[3] = new Elf("Legolas", 2931, "Bosque de Greenwood", "Bueno",
                "Príncipe del Bosque y gran arquero", "legolas.png",
                "Bosque", true, "Bosque de Greenwood");

        characters[4] = new Elf("Elrond", 6500, "Rivendel", "Bueno",
                "Señor de Rivendel", "elrond.png",
                "Elfos de Rivendel", true, "Rivendel");

        characters[5] = new Elf("Galadriel", 7000, "Lothlórien", "Bueno",
                "Dama de Lothlórien", "galadriel.png",
                "Elfos de Lothlórien", true, "Lothlórien");
    }
}