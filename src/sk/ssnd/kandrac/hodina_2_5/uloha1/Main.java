package sk.ssnd.kandrac.hodina_2_5.uloha1;

public class Main {
    public static void main(String[] args) {
        Person osoba1 = new Person("Janko", "Hrasko", 1500);
        Person osoba2 = new Person("Anicka", "Novakova", 1505);
        osoba2.setMiddleName("Trdlo");
        osoba2.setTitlesBeforeName("Ing.");
        osoba2.setTitlesAfterName("CsC.");

        System.out.println(osoba2.getFirstName() + " " + osoba2.getMiddleName());
    }
}
