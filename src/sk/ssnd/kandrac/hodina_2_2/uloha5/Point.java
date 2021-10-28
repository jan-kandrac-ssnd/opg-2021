package sk.ssnd.kandrac.hodina_2_2.uloha5;

public class Point {

    int x, y;

    int distanceFrom(Point that) {
        return Math.abs(x - that.x) + Math.abs(y - that.y);
    }

}
