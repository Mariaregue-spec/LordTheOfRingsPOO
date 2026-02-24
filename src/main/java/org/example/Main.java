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
    }
}