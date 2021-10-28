/*
V triede Car z úlohy 3 pridajte aj atribút double fail. V metóde faster
vyberte náhodnú hodnotu z intervalu 0-1. Ak padne číslo menšie ako fail,
rýchlosť auta nezvyšujte. Vytvorte si 2 autá s rôznymi atribútmi a zistite,
ktoré auto vyhráva preteky častejšie. Rýchlejšie s väčšou poruchovosťou,
alebo pomalšie bez porúch?
 */
package sk.ssnd.kandrac.hodina_2_2.uloha4;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.actualSpeed = 10.0;
        car1.maxSpeed = 25.0;
        car1.fail = 0.0;
        Car car2 = new Car();
        car2.actualSpeed = 10.0;
        car2.maxSpeed = 50.0;
        car2.fail = 0.5;

        for (int i = 0; i < 10; i++) {
            car1.faster();
            car2.faster();
        }

        System.out.println(car1.actualSpeed);
        System.out.println(car2.actualSpeed);
    }
}
