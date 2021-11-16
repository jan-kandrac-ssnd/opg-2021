package sk.ssnd.kandrac.hodina_2_5.uloha1;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    private String titlesBeforeName;
    private String titlesAfterName;
    private String middleName;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void setTitlesBeforeName(String titles) {
        this.titlesBeforeName = titles;
    }

    public void setTitlesAfterName(String titlesAfterName) {
        this.titlesAfterName = titlesAfterName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getTitlesBeforeName() {
        return titlesBeforeName;
    }

    public String getTitlesAfterName() {
        return titlesAfterName;
    }

    public String getMiddleName() {
        return middleName;
    }
}
