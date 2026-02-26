# 🧙 Personajes del Señor de los Anillos (Java POO)

Este proyecto implementa **Programación Orientada a Objetos (POO)** en Java, aplicando:

- **Encapsulamiento** (getters y setters)  
- **Herencia** (subclases de `Character`)  
- **Polimorfismo** (`displayDetails()` en cada subclase)  

Todos los personajes son del universo de “El Señor de los Anillos”.

---

## ⚙️ Estructura del proyecto

- **Package:** `org.example`  
- **Superclase abstracta:** `Character`  
- **Subclases:** 
  - `Human` 🧑  
  - `Elf` 🧝  
  - `Dwarf` 🪓  
  - `Wizard` 🧙  
  - `Orc` 🧌  
- **Clase principal:** `Main.java` (crea 15 personajes y los imprime)

---

## 🛠 Requisitos cumplidos

| Requisito | Estado |
|------------|--------|
| ✅ Encapsulamiento (getters y setters) | Completo |
| ✅ Superclase (`Character`) | Completo |
| ✅ Herencia | Cada raza hereda de `Character` |
| ✅ Polimorfismo | `displayDetails()` implementado en cada subclase |
| ✅ Naming | Variables y métodos en inglés; salida en castellano |
| ✅ Commits | Hechos paso a paso y claros |
| ✅ Inserción de datos | 3 personajes por raza (15 total) |
| ✅ Impresión en pantalla | Consola mostrando atributos en castellano |

---

## 🎯 Clases y atributos

### **Superclase `Character`**
- `name` – Nombre  
- `age` – Edad  
- `origin` – Origen  
- `alignment` – Alineamiento (Bueno/Malo)  
- `race` – Raza  
- `description` – Descripción  
- `image` – Imagen (nombre de archivo)

### **Subclases y atributos específicos**

| Raza | Atributos adicionales |
|------|---------------------|
| 🧑 Human | `kingdom`, `title`, `isNoble` |
| 🧝 Elf | `clan`, `immortal`, `realm` |
| 🪓 Dwarf | `house`, `weapon`, `beardLength` |
| 🧙 Wizard | `staffType`, `robeColor`, `powerLevel` |
| 🧌 Orc | `army`, `rank`, `aggressive` |

---

## 🖼 Diagrama de clases (Draw.io)
<img width="781" height="441" alt="ElSeñorDeLosAnillos color drawio (2)" src="https://github.com/user-attachments/assets/c53a05dc-4af5-4954-92c2-00bf69df16a1" />




> Contiene superclase, subclases y sus atributos principales.

---
# 🧑‍🤝‍🧑 Personajes Creados (15 Total)

## 🧑 Humanos
- 👑 Aragorn  
- 🛡️ Boromir  
- 🐎 Éomer  

## 🧝 Elfos
- 🏹 Legolas  
- 🌊 Elrond  
- ✨ Galadriel  

## 🪓 Enanos
- 🪓 Gimli  
- 👑 Thorin  
- 🏔️ Balin  

## 🧙 Magos
- ⚪ Gandalf  
- ⚫ Saruman  
- 🌿 Radagast  

## 🧌 Orcos
- 🔥 Azog  
- ⚔️ Bolg  
- 🩸 Gorbag  

---

# 🧾 Atributos

## 🔷 Superclase `Character`

| Atributo     | Descripción        |
|--------------|-------------------|
| `name`       | Nombre            |
| `age`        | Edad              |
| `origin`     | Origen            |
| `alignment`  | Bueno / Malo      |
| `race`       | Raza              |
| `description`| Descripción       |
| `image`      | Imagen            |

---

## 🔷 Atributos por Raza

| Raza | Atributos Extra |
|------|----------------|
| 🧑 Human  | `kingdom`, `title`, `isNoble` |
| 🧝 Elf    | `clan`, `immortal`, `realm` |
| 🪓 Dwarf  | `house`, `weapon`, `beardLength` |
| 🧙 Wizard | `staffType`, `robeColor`, `powerLevel` |
| 🧌 Orc    | `army`, `rank`, `aggressive` |
## 🖥 Ejecución

1. Clona el repositorio:  
   ```bash
   git clone <tu_repositorio_github>
Abre el proyecto en IntelliJ IDEA

Ejecuta la clase Main

Salida esperada (ejemplo parcial):

===== LISTA DE PERSONAJES =====

Raza: Human | Nombre: Aragorn | Reino: Gondor | Título: Rey | Noble: true | Descripción: Heredero de Isildur y rey de Gondor | Imagen: aragorn.png
Raza: Human | Nombre: Boromir | Reino: Gondor | Título: Capitán | Noble: true | Descripción: Hijo de Denethor y Capitán de la Torre Blanca | Imagen: boromir.png
...
Raza: Orc | Nombre: Gorbag | Ejército: Ejército de Mordor | Rango: Soldado | Agresivo: true | Descripción: Orco de Minas Morgul | Imagen: gorbag.png
