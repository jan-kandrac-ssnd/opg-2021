package sk.ssnd.kandrac.hodina_2_2.uloha3;

public class Car {
    double maxSpeed, actualSpeed;

    void faster() {
        actualSpeed += 10.0;
        if (actualSpeed > maxSpeed) actualSpeed = maxSpeed;
    }
}
