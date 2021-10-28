/*
Vytvorte triedu Point, ktorá reprezentuje bod v 2D priestore,
teda obsahuje 2 celočíselné súradnice x a y. V triede Point
vytvorte metódu distanceFrom(Point point), ktorá vráti manhattan-ovskú
vzdialenosť medzi aktuálnym bodom a bodom, ktorý prijala ako argument.

V triede main vytvorte 2 body a a b a pomocou metódy distanceFrom zistite
vzdialenosť medzi bodmi a a b.
 */
package sk.ssnd.kandrac.hodina_2_2.uloha5;

public class Main {

    public static void main(String[] args) {
        Point a = new Point();
        a.x = 3;
        a.y = 4;

        Point b = new Point();
        b.x = 6;
        b.y = 8;

        System.out.println(a.distanceFrom(b));
        System.out.println(b.distanceFrom(a));
    }
}
