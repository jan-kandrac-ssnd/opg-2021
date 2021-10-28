/*
2.2 Java Triedy a Objekty - Cvičenia Uloha 3

https://docs.google.com/document/d/11YBG2lFvRZTcK6vTWp_PCAwhSWm4hubeYKKsY8uiTp8/edit#

Vytvorte triedu Car s atribútmi typu double maxSpeed a actualSpeed.
Vytvorte v triede Car bezparametrickú metódu faster(), ktorá zvýši
aktuálnu rýchlosť o 10.0, ale len za predpokladu, že nová actualSpeed
nebude väčšia ako maxSpeed. Ak by nová rýchlosť presiahla maximálnu,
nastavte actualSpeed na maxSpeed.

V main metóde si vytvorte auto s actualSpeed = 10 a maxSpeed = 25.
Na štandardný výstup vypíšte actualSpeed, actualSpeed po zavolaní
faster a actualSpeed po zavolaní metódy faster 2x
 */
package sk.ssnd.kandrac.hodina_2_2.uloha3;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.actualSpeed = 10.0;
        car.maxSpeed = 25.0;

        System.out.println(car.actualSpeed);
        car.faster();
        System.out.println(car.actualSpeed);
        car.faster();
        System.out.println(car.actualSpeed);
    }

}
