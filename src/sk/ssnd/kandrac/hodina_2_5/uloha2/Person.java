package sk.ssnd.kandrac.hodina_2_5.uloha2;

import java.util.Date;

public class Person {

    private String name;
    private Date birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBirthDay() {
        Date actualDate = new Date();
        return
                actualDate.getDay() == birthDate.getDay() &&
                actualDate.getMonth() == birthDate.getMonth();
    }
}
