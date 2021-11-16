package sk.ssnd.kandrac.hodina_2_5.uloha3;

public class Segment {

    private Point a;
    private Point b;

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public double getLength() {
        return a.getDistance(b);
    }

    /**
     * Tuto metodu zavolam, ak chcem ziskat nahodnu usecku.
     * Volam ju pomocou Segment.generateRandomSegment()
     *
     * @return nahodna usecka
     */
    public static Segment generateRandomSegment() {
        return new Segment(Point.generateRandomPoint(), Point.generateRandomPoint());
    }
}
