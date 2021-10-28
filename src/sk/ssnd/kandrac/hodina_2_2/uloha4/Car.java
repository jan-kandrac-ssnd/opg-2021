package sk.ssnd.kandrac.hodina_2_2.uloha4;

public class Car {
    double maxSpeed, actualSpeed, fail = 0.0;

    void faster() {
        if (fail > Math.random()) {
            actualSpeed += 10.0;
            if (actualSpeed > maxSpeed) actualSpeed = maxSpeed;
        }
    }
}
