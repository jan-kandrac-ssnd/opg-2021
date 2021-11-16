package sk.ssnd.kandrac.hodina_2_5.uloha3;

public class Main {

    public static void main(String[] args) {
        Point a1 = new Point(Math.random(), Math.random());
        Point a2 = new Point(Math.random(), Math.random());
        Point b1 = new Point(Math.random(), Math.random());
        Point b2 = new Point(Math.random(), Math.random());

        Segment a = new Segment(a1, a2);
        Segment b = new Segment(b1, b2);

        System.out.println(a.getLength());
        System.out.println(b.getLength());
    }

}
