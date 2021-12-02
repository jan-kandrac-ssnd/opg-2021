package sk.ssnd.kandrac.hodina_2_7.sample2;

public abstract class Shape {

	public abstract double obvod();
	
	public abstract double obsah();

	public void vypisVsetko() {
		System.out.println("Obvod = "
				+ obvod()
				+ "; Obsah = "
				+ obsah());
	}
}
