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

        characters[3] = new Elf("Legolas", 2931, "Bosque de Greenwood", "Bueno",
                "Príncipe del Bosque y gran arquero", "legolas.png",
                "Bosque", true, "Bosque de Greenwood");

        characters[4] = new Elf("Elrond", 6500, "Rivendel", "Bueno",
                "Señor de Rivendel", "elrond.png",
                "Elfos de Rivendel", true, "Rivendel");

        characters[5] = new Elf("Galadriel", 7000, "Lothlórien", "Bueno",
                "Dama de Lothlórien", "galadriel.png",
                "Elfos de Lothlórien", true, "Lothlórien");

        characters[6] = new Dwarf("Gimli", 139, "Erebor", "Bueno",
                "Guerrero en la Comunidad del Anillo", "gimli.png",
                "Casa de Durin", "Hacha", 1.2);

        characters[7] = new Dwarf("Thorin", 195, "Erebor", "Bueno",
                "Rey bajo la Montaña", "thorin.png",
                "Casa de Durin", "Espada", 2.0);

        characters[8] = new Dwarf("Balin", 178, "Erebor", "Bueno",
                "Explorador y consejero de Thorin", "balin.png",
                "Casa de Durin", "Hacha", 1.5);

        characters[9] = new Wizard("Gandalf", 2019, "Valinor", "Bueno",
                "Mago Gris, guía de la Comunidad", "gandalf.png",
                "Bastón de madera", "Gris", 100);

        characters[10] = new Wizard("Saruman", 2019, "Valinor", "Malo",
                "Mago Blanco, traidor de Isengard", "saruman.png",
                "Bastón de madera", "Blanco", 95);

        characters[11] = new Wizard("Radagast", 2019, "Valinor", "Bueno",
                "Mago pardo, amigo de los animales", "radagast.png",
                "Bastón de madera", "Pardo", 80);

    }
}