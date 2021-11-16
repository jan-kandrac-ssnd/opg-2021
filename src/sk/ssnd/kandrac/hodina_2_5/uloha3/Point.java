package sk.ssnd.kandrac.hodina_2_5.uloha3;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point that) {
        return Math.sqrt(
                Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2)
        );
    }

    /**
     * Tuto metodu zavolam, ak chcem ziskat nahodny bod.
     * Volam ju pomocou Point.generateRandomPoint()
     *
     * @return nahodny bod
     */
    public static Point generateRandomPoint() {
        return new Point(Math.random(), Math.random());
    }

}
